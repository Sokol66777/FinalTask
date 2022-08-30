package by.tc.task01.main;

import static by.tc.task01.entity.criteria.SearchCriteria.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceException;
import by.tc.task01.service.ServiceFactory;

public class Main {

	public static void main(String[] args)  {
		List<Appliance> appliances;

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		//////////////////////////////////////////////////////////////////

		Criteria criteriaOven = new Criteria(Refrigerator.class.getSimpleName());
		criteriaOven.add(Refrigerator.POWER_CONSUMPTION.toString(),100);

		try {
			appliances = service.find(criteriaOven);
			PrintApplianceInfo.printApplianceInfo(appliances);
			
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		

		//////////////////////////////////////////////////////////////////

		criteriaOven = new Criteria(Oven.class.getSimpleName());
		criteriaOven.add(Oven.HEIGHT.toString(), 45);
		criteriaOven.add(Oven.DEPTH.toString(), 60);

		try {
			appliances = service.find(criteriaOven);
			PrintApplianceInfo.printApplianceInfo(appliances);
			
		} catch (ServiceException e) {
			e.printStackTrace();
		}


		//////////////////////////////////////////////////////////////////
		
		Criteria criteriaTabletPC = new Criteria(TabletPC.class.getSimpleName());
		criteriaTabletPC.add(TabletPC.COLOR.toString(), "blue");
		criteriaTabletPC.add(TabletPC.DISPLAY_INCHES.toString(), 14);
		criteriaTabletPC.add(TabletPC.MEMORY_ROM.toString(), 8000);

		try {
			appliances = service.find(criteriaTabletPC);
			PrintApplianceInfo.printApplianceInfo(appliances);
			
		} catch (ServiceException e) {
	
			e.printStackTrace();
		}

		

	}

}
