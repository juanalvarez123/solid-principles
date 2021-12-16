package com.personal.solid.ocp.example2;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ValidMercadoLibreEmployeeConstraintValidator implements ConstraintValidator<ValidMercadoLibreEmployee, MercadoLibreEmployee> {

    @Override
    public void initialize(ValidMercadoLibreEmployee constraintAnnotation) {
        // This is not necessary
    }

    @Override
    public boolean isValid(MercadoLibreEmployee value, ConstraintValidatorContext context) {
        // Apply the correct validations
        return value.age >= 20 && value.age <= 40;
    }
}
