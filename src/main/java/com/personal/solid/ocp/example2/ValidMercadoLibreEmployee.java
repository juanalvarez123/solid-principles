package com.personal.solid.ocp.example2;


import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import javax.validation.Constraint;

@Documented
@Retention(RUNTIME)
@Target({TYPE, METHOD, ANNOTATION_TYPE})
@Constraint(validatedBy = ValidMercadoLibreEmployeeConstraintValidator.class)
public @interface ValidMercadoLibreEmployee {

}
