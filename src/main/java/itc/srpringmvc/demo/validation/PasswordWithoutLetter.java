package itc.srpringmvc.demo.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.FIELD, ElementType.METHOD})
@Constraint(validatedBy = PasswordConstraintValidator.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface PasswordWithoutLetter {

    char value() default 'z';

    //Сообщение об ошибке
    String message() default "must not contain letter z";

    //Группы по умолчанию
    Class<?> [] groups() default {};

    //Payloads
    Class<? extends Payload>[] payload() default {};



}
