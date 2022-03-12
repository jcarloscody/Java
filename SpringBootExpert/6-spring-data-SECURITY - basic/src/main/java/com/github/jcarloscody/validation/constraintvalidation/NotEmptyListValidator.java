package com.github.jcarloscody.validation.constraintvalidation;

import com.github.jcarloscody.validation.NotEmptyList;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.List;

public class NotEmptyListValidator implements ConstraintValidator<NotEmptyList, List> {
    @Override
    public void initialize( NotEmptyList constraintAnnotation) {

    }

    @Override   //aqui vai validar o dado que no caso presente é uma lista
    public boolean isValid(List list, ConstraintValidatorContext context) {
        return list != null && list.isEmpty();
    }
}
