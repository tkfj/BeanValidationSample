package my.sample.validation;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

public class ValidationSample {

    public static void main(String[] args) {
        ValidatorFactory validatorFactory = Validation
                .buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        Bean bean = new Bean();
        bean.setZero("1");

        Set<ConstraintViolation<Bean>> violations = validator.validate(bean);
        for (ConstraintViolation<Bean> violation : violations) {
            System.out.println(violation.getMessage());
        }
    }

}
