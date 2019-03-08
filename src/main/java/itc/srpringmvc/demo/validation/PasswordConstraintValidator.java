package itc.srpringmvc.demo.validation;

import org.apache.commons.lang3.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import static java.lang.Character.toLowerCase;

public class PasswordConstraintValidator implements ConstraintValidator<PasswordWithoutLetter, String> {
   private Character chosenLetter;
   private String message;
   public void initialize(PasswordWithoutLetter constraint) {
      chosenLetter = toLowerCase((constraint.value()));
      message = constraint.message();
   }

   public boolean isValid(String pass, ConstraintValidatorContext context) {
      if (chosenLetter!='z' && message.equals("must not contain letter z")){
         context.disableDefaultConstraintViolation();
         context.buildConstraintViolationWithTemplate("must not contain letter "+chosenLetter)
                 .addConstraintViolation();
      }
      return StringUtils.isBlank(pass) || !(pass.toLowerCase().indexOf(chosenLetter)<0);
   }
}
