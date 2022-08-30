package by.tc.task01.entity;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class VacuumCleaner implements Appliance,Serializable{
	
	private static final long serialVersionUID = -6712256125756556164L;
	
	private int powerConsumption;
	private String filterType;
	private String bagType;
	private String wandType;
	private int motorSpeedRegulation;
	private int cleaningWidth;
	
	public VacuumCleaner() {
		
		powerConsumption=0;
		filterType="";
		bagType="";
		wandType="";
		motorSpeedRegulation=0;
		cleaningWidth=0;
	}
	
	public VacuumCleaner(int powerConsumption, String filterType, String bagType, String wandType,
			int motorSpeedRegulation, int cleaningWidth) {
		this.powerConsumption=powerConsumption;
		this.filterType=filterType;
		this.bagType=bagType;
		this.wandType=wandType;
		this.motorSpeedRegulation=motorSpeedRegulation;
		this.cleaningWidth=cleaningWidth;
	}
	
	@Override
	public Map<String, Object> getInfoIsMap() {
		
		Map<String,Object> info = new HashMap<>();
		
		info.put(by.tc.task01.entity.criteria.SearchCriteria.VacuumCleaner.POWER_CONSUMPTION.toString(),this.getPowerConsumption());
		info.put(by.tc.task01.entity.criteria.SearchCriteria.VacuumCleaner.FILTER_TYPE.toString(),this.getFilterType());
		info.put(by.tc.task01.entity.criteria.SearchCriteria.VacuumCleaner.BAG_TYPE.toString(),this.getBagType());
		info.put(by.tc.task01.entity.criteria.SearchCriteria.VacuumCleaner.WAND_TYPE.toString(),this.getWandType());
		info.put(by.tc.task01.entity.criteria.SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION.toString(),this.getMotorSpeedRegulation());
		info.put(by.tc.task01.entity.criteria.SearchCriteria.VacuumCleaner.CLEANING_WIDTH.toString(),this.getCleaningWidth());
		return info;
		
		}

	public int getPowerConsumption() {
		return powerConsumption;
	}

	public void setPowerConsumption(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public String getFilterType() {
		return filterType;
	}

	public void setFilterType(String filterType) {
		this.filterType = filterType;
	}

	public String getBagType() {
		return bagType;
	}

	public void setBagType(String bagType) {
		this.bagType = bagType;
	}

	public String getWandType() {
		return wandType;
	}

	public void setWandType(String wandType) {
		this.wandType = wandType;
	}

	public int getMotorSpeedRegulation() {
		return motorSpeedRegulation;
	}

	public void setMotorSpeedRegulation(int motorSpeedRegulation) {
		this.motorSpeedRegulation = motorSpeedRegulation;
	}

	public int getCleaningWidth() {
		return cleaningWidth;
	}

	public void setCleaningWidth(int cleaningWidth) {
		this.cleaningWidth = cleaningWidth;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bagType, cleaningWidth, filterType, motorSpeedRegulation, powerConsumption, wandType);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VacuumCleaner other = (VacuumCleaner) obj;
		return Objects.equals(bagType, other.bagType) && cleaningWidth == other.cleaningWidth
				&& Objects.equals(filterType, other.filterType) && motorSpeedRegulation == other.motorSpeedRegulation
				&& powerConsumption == other.powerConsumption && Objects.equals(wandType, other.wandType);
	}

	@Override
	public String toString() {
		return "VacuumCleaner [powerConsumption=" + powerConsumption + ", filterType=" + filterType + ", bagType="
				+ bagType + ", wandType=" + wandType + ", motorSpeedRegulation=" + motorSpeedRegulation
				+ ", cleaningWidth=" + cleaningWidth + "]";
	}

	
}
