package com.example.jpasigninsignout.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class NamedNotAdminValidator  implements ConstraintValidator<NamedNotAdmin,String> {

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return !s.equalsIgnoreCase("admin");
    }
}
