package com.springmvc.secondweb.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = StudentIdConstraintValidator.class)
@Target( {ElementType.METHOD, ElementType.FIELD} )
@Retention(RetentionPolicy.RUNTIME)
public @interface StudentId {

    public String value() default "ZEM";

    public String message() default "must start with ZEM";

    public Class<?>[] groups() default {};

    public Class<? extends Payload>[] payload() default {};

}
