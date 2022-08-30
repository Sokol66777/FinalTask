package by.tc.task01.entity;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


public class Oven implements Appliance,Serializable{
	
	private static final long serialVersionUID = 3216230975742870691L;
	
	private int powerConsumption;
	private int weight;
	private int capacity;
	private int depth;
	private int height;
	private int width;
	
	public Oven() {
		
		powerConsumption=0;
		weight=0;
		capacity=0;
		depth=0;
		height=0;
		width=0;
		
	}
	public Oven(int powerConsumption, int weight, int capacity, int depth, int height, int winth) {
		
		this.powerConsumption=powerConsumption;
		this.weight=weight;
		this.capacity=capacity;
		this.depth=depth;
		this.height=height;
		this.width=winth;
	}
	
	@Override
	public Map<String, Object> getInfoIsMap() {
		Map<String,Object> info = new HashMap<>();
		
		info.put(by.tc.task01.entity.criteria.SearchCriteria.Oven.POWER_CONSUMPTION.toString(),this.getPowerConsumption());
		info.put(by.tc.task01.entity.criteria.SearchCriteria.Oven.WEIGHT.toString(),this.getWeight());
		info.put(by.tc.task01.entity.criteria.SearchCriteria.Oven.CAPACITY.toString(),this.getCapacity());
		info.put(by.tc.task01.entity.criteria.SearchCriteria.Oven.DEPTH.toString(),this.getDepth());
		info.put(by.tc.task01.entity.criteria.SearchCriteria.Oven.HEIGHT.toString(),this.getHeight());
		info.put(by.tc.task01.entity.criteria.SearchCriteria.Oven.WIDTH.toString(),this.getWidth());

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
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getDepth() {
		return depth;
	}
	public void setDepth(int depth) {
		this.depth = depth;
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
	public void setWidth(int winth) {
		this.width = winth;
	}
	@Override
	public int hashCode() {
		return Objects.hash(capacity, depth, height, powerConsumption, weight, width);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Oven other = (Oven) obj;
		return capacity == other.capacity && depth == other.depth && height == other.height
				&& powerConsumption == other.powerConsumption && weight == other.weight && width == other.width;
	}
	@Override
	public String toString() {
		return "Oven [powerConsumption=" + powerConsumption + ", weight=" + weight + ", capacity=" + capacity
				+ ", depth=" + depth + ", height=" + height + ", width=" + width + "]";
	}
	
	
}
