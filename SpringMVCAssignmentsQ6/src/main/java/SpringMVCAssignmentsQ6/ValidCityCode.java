package SpringMVCAssignmentsQ6;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ValidCityCode implements ConstraintValidator<CityCode, String> {

	public boolean isValid(String s, ConstraintValidatorContext cvc) {
		Customer R = new Customer();
		if (s.equalsIgnoreCase("Bhopal") && R.getPin().equalsIgnoreCase("462010"))
			return true;
		if (s.equalsIgnoreCase("indore") && R.getPin().equalsIgnoreCase("451010"))
			return true;
		if (s.equalsIgnoreCase("ujjain") && R.getPin().equalsIgnoreCase("456001"))
			return true;
		if (s.equalsIgnoreCase("shahdol") && R.getPin().equalsIgnoreCase("484001"))
			return true;
		
		if (s.equalsIgnoreCase("831004"))
			return true;
		return false;
	}

}
