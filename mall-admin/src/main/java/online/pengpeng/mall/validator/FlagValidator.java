package online.pengpeng.mall.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * @author pengpeng
 * @date 2022/8/28
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Constraint(validatedBy = FlagValidatorHandler.class)
public @interface FlagValidator {
    String[] value() default {};

    String message() default "flag is not found";

    Class<? extends Payload> [] payload() default {};
}
