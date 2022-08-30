package by.tc.task01.service.impl;

import java.util.List;
import by.tc.task01.dao.*;
import by.tc.task01.dao.impl.FileApplianceDAOImpl;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceException;
import by.tc.task01.service.validation.ApplianceValidator;
import by.tc.task01.service.validation.NoHaveValitationException;
import by.tc.task01.service.validation.ValidatorException;

public class ApplianceServiceImpl implements ApplianceService{

	@Override
	public List<Appliance> find(Criteria criteria) throws ServiceException {
		try {
			ApplianceValidator.criteriaValidator(criteria);
				
			
		} catch (ValidatorException e) {
			throw new ServiceException(e);
		} catch (NoHaveValitationException e) {
			
		}
		
		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();	
		
		List<Appliance> appliances;
		try {
			appliances = applianceDAO.find(criteria);
			
		} catch (DAOException e) {
			
			throw new ServiceException(e);
		}
		
		
		
		return appliances;
	}

}

//you may add your own new classes
