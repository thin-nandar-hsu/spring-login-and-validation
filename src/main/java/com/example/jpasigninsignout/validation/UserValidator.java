package com.example.jpasigninsignout.validation;

import com.example.jpasigninsignout.entity.User;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class UserValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
           User user = (User) target;
           if(!user.getPassword().equals(user.getRepeatedPassword())){
               errors.rejectValue("password",null,"Password and Repeated Password must match!");
           }
    }
}
