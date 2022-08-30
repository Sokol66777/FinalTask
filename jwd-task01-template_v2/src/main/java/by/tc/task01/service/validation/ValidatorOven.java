package by.tc.task01.service.validation;

import java.util.Map;

import by.tc.task01.entity.criteria.Criteria;

public final class ValidatorOven {
	
	private ValidatorOven() {}
	
	public static boolean ovenValidator(Criteria criteria)  {
		Map<String,Object> params = criteria.getCriteria();
		for (Map.Entry<String, Object> entry : params.entrySet()) {
			
			switch (entry.getKey()) {
			case "WEIGHT":
				if(!ovenWeightValidator(entry.getValue())) {
					return false;
				}
				break;
				
			case "POWER_CONSUMPTION":
				if(!ovenPowerConsumptionValidator(entry.getValue())) {
					return false;
				}
				break;
				
			case "CAPACITY":
				if(!ovenCapacityValidator(entry.getValue())) {
					return false;
				}
				break;
				
			case "DEPTH":
				if(!ovenDepthValidator(entry.getValue())) {
					return false;
				}
				break;
			
			case "HEIGHT":
				if(!ovenHeightValidator(entry.getValue())) {
					return false;
				}
				break;
				
			case "WIDTH":
				if(!ovenWidthValidator(entry.getValue())) {
					return false;
				}
				break;
				
			}
		}
		
		return true;
	}

	private static boolean ovenWeightValidator(Object value)  {
		String stringValue=value.toString();
		
		if(!stringValue.matches("[0-9]*")) {
			return false;
		}
		
		if (Integer.parseInt(stringValue)>900 || Integer.parseInt(stringValue)<1) {
			return false;
		}
		
		return true;
	}
	
	private static boolean ovenPowerConsumptionValidator(Object value)  {
		String stringValue=value.toString();
		
		if(!stringValue.matches("[0-9]*")) {
			return false;
		}
		
		if (Integer.parseInt(stringValue)>4000 || Integer.parseInt(stringValue)<1000) {
			return false;
		}
		
		return true;
	}
	
	private static boolean ovenCapacityValidator(Object value)  {
		String stringValue=value.toString();
		
		if(!stringValue.matches("[0-9]*")) {
			return false;
		}
		
		if (Integer.parseInt(stringValue)>50 || Integer.parseInt(stringValue)<1) {
			return false;
		}
		
		return true;
	}
	
	private static boolean ovenDepthValidator(Object value)  {
		String stringValue=value.toString();
		
		if(!stringValue.matches("[0-9]*")) {
			return false;
		}
		
		if (Integer.parseInt(stringValue)>100 || Integer.parseInt(stringValue)<1) {
			return false;
		}
		
		return true;
	}
	
	private static boolean ovenHeightValidator(Object value)  {
		String stringValue=value.toString();
		
		if(!stringValue.matches("[0-9]*")) {
			return false;
		}
		
		if (Integer.parseInt(stringValue)>220 || Integer.parseInt(stringValue)<30) {
			return false;
		}
		
		return true;
	}
	
	private static boolean ovenWidthValidator(Object value)  {
		String stringValue=value.toString();
		
		if(!stringValue.matches("[0-9]*")) {
			return false;
		}
		
		if (Integer.parseInt(stringValue)>220 || Integer.parseInt(stringValue)<30) {
			return false;
		}
		
		return true;
	}
}
