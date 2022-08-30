package by.tc.task01.dao.impl;

import by.tc.task01.entity.*;


class InitializationAppliance {

	private InitializationAppliance() {}
	
	public static Appliance initializationOven(String [] appl) {
		Appliance appliance;
		Oven app = new Oven();
		int intvalue;
		String value;
		
		value = appl[2].substring(18, appl[2].length()-1);
		intvalue=Integer.parseInt(value);
		app.setPowerConsumption(intvalue);

		value = appl[3].substring(7, appl[3].length()-1);
		intvalue = Integer.parseInt(value);
		app.setWeight(intvalue);
		
		value = appl[4].substring(9, appl[4].length()-1);
		intvalue = Integer.parseInt(value);
		app.setCapacity(intvalue);
		
		value = appl[5].substring(6, appl[5].length()-1);
		intvalue = Integer.parseInt(value);
		app.setDepth(intvalue);
		
		value = appl[6].substring(7, appl[6].length()-1);
		intvalue = Integer.parseInt(value);
		app.setHeight(intvalue);
		
		value = appl[7].substring(6, appl[7].length());
		intvalue = Integer.parseInt(value);
		app.setWidth(intvalue);
		
		appliance=app;

		return appliance;
	}
	
	public static Appliance initializationLaptop(String [] appl) {
		Appliance appliance;
		Laptop app = new Laptop();
		int intvalue;
		double doublevalue;
		String value;
		
		value = appl[2].substring(17, appl[2].length()-1);
		intvalue=Integer.parseInt(value);
		app.setBatteryCapacity(intvalue);
		
		value = appl[3].substring(3, appl[3].length()-1);
		app.setOS(value);
		
		value = appl[4].substring(11, appl[4].length()-1);
		intvalue=Integer.parseInt(value);
		app.setMemoryRom(intvalue);
		
		value = appl[5].substring(14, appl[5].length()-1);
		intvalue=Integer.parseInt(value);
		app.setSystemMemory(intvalue);
		
		value = appl[6].substring(4, appl[6].length()-1);
		doublevalue=Double.parseDouble(value);
		app.setCPU(doublevalue);
		
		value = appl[7].substring(15, appl[7].length());
		intvalue=Integer.parseInt(value);
		app.setDisplayInches(intvalue);
		
		appliance =  app;
		
		return appliance;
	}
	
	public static Appliance initializationRefrigerator(String [] appl) {
		Appliance appliance;
		Refrigerator app = new Refrigerator();
		int intvalue;
		double doublevalue;
		String value;
		
		value = appl[2].substring(18, appl[2].length()-1);
		intvalue=Integer.parseInt(value);
		app.setPowerConsumption(intvalue);
		
		value = appl[3].substring(7, appl[3].length()-1);
		intvalue=Integer.parseInt(value);
		app.setWeight(intvalue);
		
		value = appl[4].substring(17, appl[4].length()-1);
		intvalue=Integer.parseInt(value);
		app.setFreezerCapacity(intvalue);
		
		value = appl[5].substring(17, appl[5].length()-1);
		doublevalue=Double.parseDouble(value);
		app.setOverallCapacity(doublevalue);
		
		value = appl[6].substring(7, appl[6].length()-1);
		intvalue = Integer.parseInt(value);
		app.setHeight(intvalue);
		
		value = appl[7].substring(6, appl[7].length());
		intvalue = Integer.parseInt(value);
		app.setWidth(intvalue);
		
		appliance = app;
		
		return appliance;
	}
	
	public static Appliance initializationVacuumCleaner(String [] appl) {
		
		Appliance appliance;
		VacuumCleaner app = new VacuumCleaner();
		int intvalue;
		String value;

		value = appl[2].substring(18, appl[2].length()-1);
		intvalue=Integer.parseInt(value);
		app.setPowerConsumption(intvalue);
		
		value = appl[3].substring(12, appl[3].length()-1);
		app.setFilterType(value);
		
		value = appl[4].substring(9, appl[4].length()-1);
		app.setBagType(value);
		
		value = appl[5].substring(10, appl[5].length()-1);
		app.setWandType(value);
		
		value = appl[6].substring(23, appl[6].length()-1);
		intvalue = Integer.parseInt(value);
		app.setMotorSpeedRegulation(intvalue);
		
		value = appl[7].substring(15, appl[7].length());
		intvalue = Integer.parseInt(value);
		app.setCleaningWidth(intvalue);
		
		appliance = app;
		
		return appliance;
	}
	
	public static Appliance initializationTabletPC(String [] appl) {
		Appliance appliance;
		TabletPC app = new TabletPC();
		int intvalue;
		String value;
		value = appl[2].substring(17, appl[2].length()-1);
		intvalue=Integer.parseInt(value);
		app.setBatteryCapacity(intvalue);
		
		value = appl[3].substring(15, appl[3].length()-1);
		intvalue=Integer.parseInt(value);
		app.setDisplayInches(intvalue);
		
		value = appl[4].substring(11, appl[4].length()-1);
		intvalue=Integer.parseInt(value);
		app.setMemoryRom(intvalue);
		
		value = appl[5].substring(22, appl[5].length()-1);
		intvalue=Integer.parseInt(value);
		app.setFlashMemoryCapacity(intvalue);
		
		value = appl[6].substring(6, appl[6].length());
		app.setColor(value);
		
		appliance = app;
		
		return appliance;
	}
	
	public static Appliance initializationSpeakers(String [] appl) {
		Appliance appliance;
		Speakers app = new Speakers();
		int intvalue;
		String value;

		value = appl[2].substring(18, appl[2].length()-1);
		intvalue=Integer.parseInt(value);
		app.setPowerConsumption(intvalue);
		
		value = appl[3].substring(19, appl[3].length()-1);
		intvalue=Integer.parseInt(value);
		app.setNumberOfSpeakers(intvalue);
		
		value = appl[4].substring(16, appl[4].length()-1);
		app.setFrequencyRange(value);
		
		value = appl[5].substring(12, appl[5].length());
		intvalue=Integer.parseInt(value);
		app.setCordLength(intvalue);
		
		appliance = app;
		
		return appliance;
	}
	
	
}
