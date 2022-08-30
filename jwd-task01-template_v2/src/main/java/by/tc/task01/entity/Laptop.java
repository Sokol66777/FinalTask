package by.tc.task01.entity;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Laptop implements Appliance,Serializable{
	
	private static final long serialVersionUID = 7614512947158611539L;
	
	private int batteryCapacity;
	private String OS;
	private int memoryRom;
	private int systemMemory;
	private double CPU;
	private int displayInches;
	
	public Laptop() {
		
		batteryCapacity=0;
		OS="";
		memoryRom=0;
		systemMemory=0;
		CPU=0;
		displayInches=0;
	}
	
	public Laptop(int batteryCapacity,  String OS, int memoryRom, int systemMemory, double CPU
			, int displayInches) {
		
		this.batteryCapacity=batteryCapacity;
		this.OS=OS;
		this.memoryRom=memoryRom;
		this.systemMemory=systemMemory;
		this.CPU=CPU;
		this.displayInches=displayInches;
	}
	
	@Override
	public Map<String, Object> getInfoIsMap() {
		Map<String,Object> info = new HashMap<>();
		
		info.put(by.tc.task01.entity.criteria.SearchCriteria.Laptop.BATTERY_CAPACITY.toString(),this.getBatteryCapacity());
		info.put(by.tc.task01.entity.criteria.SearchCriteria.Laptop.CPU.toString(),this.getCPU());
		info.put(by.tc.task01.entity.criteria.SearchCriteria.Laptop.DISPLAY_INCHES.toString(),this.getDisplayInches());
		info.put(by.tc.task01.entity.criteria.SearchCriteria.Laptop.MEMORY_ROM.toString(),this.getMemoryRom());
		info.put(by.tc.task01.entity.criteria.SearchCriteria.Laptop.OS.toString(),this.getOS());
		info.put(by.tc.task01.entity.criteria.SearchCriteria.Laptop.SYSTEM_MEMORY.toString(),this.getSystemMemory());
		
		return info;
	}

	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public String getOS() {
		return OS;
	}

	public void setOS(String oS) {
		OS = oS;
	}

	public int getMemoryRom() {
		return memoryRom;
	}

	public void setMemoryRom(int memoryRom) {
		this.memoryRom = memoryRom;
	}

	public int getSystemMemory() {
		return systemMemory;
	}

	public void setSystemMemory(int systemMemory) {
		this.systemMemory = systemMemory;
	}

	public double getCPU() {
		return CPU;
	}

	public void setCPU(double cPU) {
		CPU = cPU;
	}

	public int getDisplayInches() {
		return displayInches;
	}

	public void setDisplayInches(int displayInches) {
		this.displayInches = displayInches;
	}

	@Override
	public int hashCode() {
		return Objects.hash(CPU, OS, batteryCapacity, displayInches, memoryRom, systemMemory);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		return Double.doubleToLongBits(CPU) == Double.doubleToLongBits(other.CPU) && Objects.equals(OS, other.OS)
				&& batteryCapacity == other.batteryCapacity && displayInches == other.displayInches
				&& memoryRom == other.memoryRom && systemMemory == other.systemMemory;
	}

	@Override
	public String toString() {
		return "Laptop [batteryCapacity=" + batteryCapacity + ", OS=" + OS + ", memoryRom=" + memoryRom
				+ ", systemMemory=" + systemMemory + ", CPU=" + CPU + ", displayInches=" + displayInches + "]";
	}

	
}
