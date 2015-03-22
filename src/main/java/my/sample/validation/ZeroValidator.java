package my.sample.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ZeroValidator implements ConstraintValidator<Zero, String> {

    @Override
    public void initialize(Zero constraintAnnotation) {
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null) {
            return true;
        }
        return isZeroValid(value);
    }

    static boolean isZeroValid(String zero) {

        if ("0".equals(zero)) {
            return true;
        }

        return false;

    }
}
