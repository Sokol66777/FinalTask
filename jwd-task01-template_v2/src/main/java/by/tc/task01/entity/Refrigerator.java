package by.tc.task01.entity;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Refrigerator implements Appliance,Serializable{
	
	private static final long serialVersionUID = -8807387355251604087L;
	
	private int powerConsumption;
	private int weight;
	private int freezerCapacity;
	private double overallCapacity;
	private int height;
	private int width;
	
	public Refrigerator() {
		powerConsumption=0;
		weight=0;
		freezerCapacity=0;
		overallCapacity=0;
		height=0;
		width=0;
	}
	
	public Refrigerator(int powerConsumption, int weight, int freezerCapacity, double overallCapacity,
			int height, int width) {
		this.powerConsumption=powerConsumption;
		this.weight=weight;
		this.freezerCapacity=freezerCapacity;
		this.overallCapacity=overallCapacity;
		this.height=height;
		this.width=width;
	}

	@Override
	public Map<String, Object> getInfoIsMap() {
		
		Map<String,Object> info = new HashMap<>();
		
		info.put(by.tc.task01.entity.criteria.SearchCriteria.Refrigerator.POWER_CONSUMPTION.toString(),this.getPowerConsumption());
		info.put(by.tc.task01.entity.criteria.SearchCriteria.Refrigerator.WEIGHT.toString(),this.getWeight());
		info.put(by.tc.task01.entity.criteria.SearchCriteria.Refrigerator.FREEZER_CAPACITY.toString(),this.getFreezerCapacity());
		info.put(by.tc.task01.entity.criteria.SearchCriteria.Refrigerator.OVERALL_CAPACITY.toString(),this.getOverallCapacity());
		info.put(by.tc.task01.entity.criteria.SearchCriteria.Refrigerator.HEIGHT.toString(),this.getHeight());
		info.put(by.tc.task01.entity.criteria.SearchCriteria.Refrigerator.WIDTH.toString(),this.getWidth());
		
		return info;
		}
	
	public int getPowerConsumption() {
		return powerConsumption;
	}

	public void setPowerConsumption(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getFreezerCapacity() {
		return freezerCapacity;
	}

	public void setFreezerCapacity(int freezerCapacity) {
		this.freezerCapacity = freezerCapacity;
	}

	public double getOverallCapacity() {
		return overallCapacity;
	}

	public void setOverallCapacity(double overallCapacity) {
		this.overallCapacity = overallCapacity;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public int hashCode() {
		return Objects.hash(freezerCapacity, height, overallCapacity, powerConsumption, weight, width);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Refrigerator other = (Refrigerator) obj;
		return freezerCapacity == other.freezerCapacity && height == other.height
				&& Double.doubleToLongBits(overallCapacity) == Double.doubleToLongBits(other.overallCapacity)
				&& powerConsumption == other.powerConsumption && weight == other.weight && width == other.width;
	}

	@Override
	public String toString() {
		return "Refrigerator [powerConsumption=" + powerConsumption + ", weight=" + weight + ", freezerCapacity="
				+ freezerCapacity + ", overallCapacity=" + overallCapacity + ", height=" + height + ", width=" + width
				+ "]";
	}

	
	
}
