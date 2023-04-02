package SpringMVCAssignmentsQ6;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ValidContact implements ConstraintValidator<Contact, String> {

	public boolean isValid(String s, ConstraintValidatorContext cvc) {
		for (int ctr = 0; ctr < s.length(); ctr++) {
			if ("1234567890".contains(Character.valueOf(s.charAt(ctr)).toString())) {
				continue;
			} else {
				return false;
			}
		}
		return true;
	}
}
