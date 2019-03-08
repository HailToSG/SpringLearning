package itc.srpringmvc.demo.validation;

import org.apache.commons.lang3.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordConstraintValidator implements ConstraintValidator<PasswordWithoutLetter, String> {
   private Character chosenLetter;
   private String message;
   private String stringToCompare;
   public void initialize(PasswordWithoutLetter constraint) {
      chosenLetter = constraint.value();
      message = constraint.message();
      stringToCompare = chosenLetter.toString().toLowerCase();
   }

   public boolean isValid(String pass, ConstraintValidatorContext context) {
      if (chosenLetter!='z' && message.equals("must not contain letter z")){
         context.disableDefaultConstraintViolation();
         context.buildConstraintViolationWithTemplate("must not contain letter "+chosenLetter)
                 .addConstraintViolation();
      }
      return StringUtils.isBlank(pass) || !pass.toLowerCase().contains(stringToCompare);
   }
}
