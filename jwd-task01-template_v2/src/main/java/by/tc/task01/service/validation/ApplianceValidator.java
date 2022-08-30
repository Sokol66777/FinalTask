package by.tc.task01.service.validation;

import java.util.Map;
import by.tc.task01.entity.criteria.Criteria;

public class ApplianceValidator {
	
	public static void criteriaValidator(Criteria criteria) throws ValidatorException, NoHaveValitationException  {
		
		switch (criteria.getGroupSearchName()) {
		case ("Oven"):
			if( ValidatorOven.ovenValidator(criteria)==false) {
				throw new ValidatorException("Incorrect parameter");
			}
			break;
		default:
			throw new NoHaveValitationException("No have validation for this appliance");
		}
	}
	
	
	

}

