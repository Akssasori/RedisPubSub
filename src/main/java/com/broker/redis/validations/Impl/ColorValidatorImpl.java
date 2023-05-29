package com.broker.redis.validations.Impl;

import com.broker.redis.validations.annotations.ColorValidation;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Arrays;
import java.util.List;

public class ColorValidatorImpl implements ConstraintValidator<ColorValidation, String> {
    @Override
    public void initialize(ColorValidation constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String colorName, ConstraintValidatorContext cxt) {
        List<String> list = Arrays.asList("RED","GREEN","BLUE");
        return list.contains(colorName);
    }
}
