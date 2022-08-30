package by.tc.task01.entity;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Speakers implements Appliance,Serializable{

	private static final long serialVersionUID = 2866959305325444710L;
	
	private int powerConsumption;
	private int numberOfSpeakers;
	private String frequencyRange;
	private int cordLength;
	
	public Speakers() {
		powerConsumption=0;
		numberOfSpeakers=0;
		frequencyRange="";
		cordLength=0;
	}
	
	public Speakers(int powerConsumption, int numberOfSpeakers, String frequencyRange, 
			int cordLength) {
		
		this.powerConsumption=powerConsumption;
		this.numberOfSpeakers=numberOfSpeakers;
		this.frequencyRange=frequencyRange;
		this.cordLength=cordLength;
		
	}
	
	
	@Override
	public Map<String, Object> getInfoIsMap() {
		
		Map<String,Object> info = new HashMap<>();
		
		info.put(by.tc.task01.entity.criteria.SearchCriteria.Speakers.POWER_CONSUMPTION.toString(),this.getPowerConsumption());
		info.put(by.tc.task01.entity.criteria.SearchCriteria.Speakers.NUMBER_OF_SPEAKERS.toString(),this.getNumberOfSpeakers());
		info.put(by.tc.task01.entity.criteria.SearchCriteria.Speakers.FREQUENCY_RANGE.toString(),this.getFrequencyRange());
		info.put(by.tc.task01.entity.criteria.SearchCriteria.Speakers.CORD_LENGTH.toString(),this.getCordLength());
		
		return info;
		
		}

	
	public int getPowerConsumption() {
		return powerConsumption;
	}

	public void setPowerConsumption(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public int getNumberOfSpeakers() {
		return numberOfSpeakers;
	}

	public void setNumberOfSpeakers(int numberOfSpeakers) {
		this.numberOfSpeakers = numberOfSpeakers;
	}

	public String getFrequencyRange() {
		return frequencyRange;
	}

	public void setFrequencyRange(String frequencyRange) {
		this.frequencyRange = frequencyRange;
	}

	public int getCordLength() {
		return cordLength;
	}

	public void setCordLength(int cordLength) {
		this.cordLength = cordLength;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cordLength, frequencyRange, numberOfSpeakers, powerConsumption);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Speakers other = (Speakers) obj;
		return cordLength == other.cordLength && Objects.equals(frequencyRange, other.frequencyRange)
				&& numberOfSpeakers == other.numberOfSpeakers && powerConsumption == other.powerConsumption;
	}

	@Override
	public String toString() {
		return "Speakers [powerConsumption=" + powerConsumption + ", numberOfSpeakers=" + numberOfSpeakers
				+ ", frequencyRange=" + frequencyRange + ", cordLength=" + cordLength + "]";
	}

	
	
}
