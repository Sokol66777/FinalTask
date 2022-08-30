package by.tc.task01.dao.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.DAOException;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.*;
import static by.tc.task01.entity.criteria.SearchCriteria.*;


public class FileApplianceDAOImpl implements ApplianceDAO {

	@Override
	public List<Appliance> find(Criteria criteria) throws DAOException{
		List<String> trueAppliances = new ArrayList<>();
		String line;
		StringBuilder parametr = new StringBuilder();
		Map<String, Object> params = criteria.getCriteria();
		ClassLoader loader = FileApplianceDAOImpl.class.getClassLoader();
		File file = new File(loader.getResource("appliances_db.txt").getFile());
		try(BufferedReader read = new BufferedReader(new FileReader(file))) {
			
			line = read.readLine();
			
			while (line != null) {

				if ((criteria.getGroupSearchName() == null) || (line.contains(criteria.getGroupSearchName()))) {
					int flag = 1;

					for (Map.Entry<String, Object> entry : params.entrySet()) {
						parametr.setLength(0);
						parametr.append(entry.getKey()).append("=").append(entry.getValue());

						if (!line.contains(parametr)) {
							flag = 0;
						}
					}

					if (flag == 1) {
						trueAppliances.add(line);

					}

				}
				line = read.readLine();
			}
		} catch (FileNotFoundException e) {
			throw new DAOException(e);
		} catch (IOException e) {
			throw new DAOException(e);
		} 

		List<Appliance> appliance;
		try {
			appliance = createObj(trueAppliances);
		} catch (NoSuchAppliacneException e) {
			throw new DAOException(e);
		}

		return appliance;
	}

	private List<Appliance> createObj(List<String> trueAppliances) throws NoSuchAppliacneException {
		List<Appliance> appl = new ArrayList<Appliance>();
		
		for (String app : trueAppliances) {
			String parameters[] = app.split(" ");
			appl.add(findObj(parameters));
		}

		return appl;
	}

	public Appliance findObj(String[] parameters) throws NoSuchAppliacneException {
		String nameObj = parameters[0];
		Appliance app;
		switch (nameObj) {

		case "Oven":
			app = InitializationAppliance.initializationOven(parameters);
			Oven.class.getSimpleName();
			return app;

		case "Laptop":
			app = InitializationAppliance.initializationLaptop(parameters);
			return app;

		case "Refrigerator":
			app = InitializationAppliance.initializationRefrigerator(parameters);
			return app;

		case "VacuumCleaner":
			app = InitializationAppliance.initializationVacuumCleaner(parameters);
			return app;

		case "TabletPC":
			app = InitializationAppliance.initializationTabletPC(parameters);
			return app;

		case "Speakers":
			app = InitializationAppliance.initializationSpeakers(parameters);
			return app;
			
		default: 
			throw new NoSuchAppliacneException("No Such Appliacne");
		}
		

	}

	

}

