package com.springmvc.secondweb.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class StudentIdConstraintValidator implements ConstraintValidator<StudentId,String> {

    private String studentIdPrefix;

    @Override
    public void initialize(StudentId theStudentId) {
        studentIdPrefix = theStudentId.value();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        boolean result;

        if(s != null) {
            result = s.startsWith(studentIdPrefix);
        }
        else {
            result = false;
        }

        return result;
    }
}
