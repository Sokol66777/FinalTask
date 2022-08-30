package by.tc.task01.main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.*;
public class PrintApplianceInfo {

	public static void printApplianceInfo(List<Appliance> appliances) {

		StringBuilder appliance = new StringBuilder();
		Map<String, Object> info = new HashMap<>();

		for (Appliance app : appliances) {

			info = app.getInfoIsMap();
			Iterator<Map.Entry<String, Object>> iteratorInfo = info.entrySet().iterator();
			
			if (app.getClass().getSimpleName().equals(by.tc.task01.entity.criteria.SearchCriteria.Oven.class.getSimpleName())) {
				appliance.append("Name=Oven, ");
				
			} else if (app.getClass().getSimpleName().equals(by.tc.task01.entity.criteria.SearchCriteria.Laptop.class.getSimpleName())) {
				appliance.append("Name=Laptop, ");
				
			} else if (app.getClass().getSimpleName().equals(by.tc.task01.entity.criteria.SearchCriteria.Refrigerator.class.getSimpleName())) {
				appliance.append("Name=Refrigerator, ");
				
			}else if (app.getClass().getSimpleName().equals(by.tc.task01.entity.criteria.SearchCriteria.Speakers.class.getSimpleName())) {
				appliance.append("Name=Speakers, ");
				
			}else if (app.getClass().getSimpleName().equals(by.tc.task01.entity.criteria.SearchCriteria.TabletPC.class.getSimpleName())) {
				appliance.append("Name=TabletPC, ");
				
			}else if (app.getClass().getSimpleName().equals(by.tc.task01.entity.criteria.SearchCriteria.VacuumCleaner.class.getSimpleName())) {
				appliance.append("Name=VacuumCleaner, ");
			}
			
			while (iteratorInfo.hasNext()) {
				Map.Entry<String, Object> entry = iteratorInfo.next();
				appliance.append(entry.getKey()).append("=").append(entry.getValue()).append(", ");
			}

			appliance.replace(appliance.length() - 2, appliance.length(), ";");
			System.out.println(appliance + "\n");
			appliance.setLength(0);

		}

	}
	
	
}
