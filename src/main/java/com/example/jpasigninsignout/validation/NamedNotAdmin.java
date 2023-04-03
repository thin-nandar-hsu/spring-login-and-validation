package com.example.jpasigninsignout.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {NamedNotAdminValidator.class})
public @interface NamedNotAdmin {

   String message();

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
