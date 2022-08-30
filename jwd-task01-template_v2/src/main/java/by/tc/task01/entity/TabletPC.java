package by.tc.task01.entity;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class TabletPC implements Appliance,Serializable{
	
	private static final long serialVersionUID = 7334354497553371730L;
	
	private int batteryCapacity;
	private int displayInches;
	private int memoryRom;
	private int flashMemoryCapacity;
	private String color;
	
	public TabletPC() {
		
		batteryCapacity=0;
		displayInches=0;
		memoryRom=0;
		flashMemoryCapacity=0;
		color="";
		
	}
	
	public TabletPC(int batteryCapacity, int displayInches, int memoryRom, int flashMemoryCapacity, 
		String color) {
		
		this.batteryCapacity=batteryCapacity;
		this.displayInches=displayInches;
		this.memoryRom=memoryRom;
		this.flashMemoryCapacity=flashMemoryCapacity;
		this.color=color;
		
	}
	
	@Override
	public Map<String, Object> getInfoIsMap() {
		
		Map<String,Object> info = new HashMap<>();
		
		info.put(by.tc.task01.entity.criteria.SearchCriteria.TabletPC.BATTERY_CAPACITY.toString(),this.getBatteryCapacity());
		info.put(by.tc.task01.entity.criteria.SearchCriteria.TabletPC.DISPLAY_INCHES.toString(),this.getDisplayInches());
		info.put(by.tc.task01.entity.criteria.SearchCriteria.TabletPC.MEMORY_ROM.toString(),this.getMemoryRom());
		info.put(by.tc.task01.entity.criteria.SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY.toString(),this.getFlashMemoryCapacity());
		info.put(by.tc.task01.entity.criteria.SearchCriteria.TabletPC.COLOR.toString(),this.getColor());
		
		return info;
		
		}


	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public int getDisplayInches() {
		return displayInches;
	}

	public void setDisplayInches(int displayInches) {
		this.displayInches = displayInches;
	}

	public int getMemoryRom() {
		return memoryRom;
	}

	public void setMemoryRom(int memoryRom) {
		this.memoryRom = memoryRom;
	}

	public int getFlashMemoryCapacity() {
		return flashMemoryCapacity;
	}

	public void setFlashMemoryCapacity(int flashMemoryCapacity) {
		this.flashMemoryCapacity = flashMemoryCapacity;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public int hashCode() {
		return Objects.hash(batteryCapacity, color, displayInches, flashMemoryCapacity, memoryRom);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TabletPC other = (TabletPC) obj;
		return batteryCapacity == other.batteryCapacity && Objects.equals(color, other.color)
				&& displayInches == other.displayInches && flashMemoryCapacity == other.flashMemoryCapacity
				&& memoryRom == other.memoryRom;
	}

	@Override
	public String toString() {
		return "TabletPC [batteryCapacity=" + batteryCapacity + ", displayInches=" + displayInches + ", memoryRom="
				+ memoryRom + ", flashMemoryCapacity=" + flashMemoryCapacity + ", color=" + color + "]";
	}

	
	

}
