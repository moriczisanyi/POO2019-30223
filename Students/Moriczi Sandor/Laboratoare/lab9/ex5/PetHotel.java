package ex5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class PetHotel {
	private Map<Camera,Dog> reg;
	
	public PetHotel()
	{
		reg = new HashMap<Camera,Dog>();
	}

	public Map<Camera, Dog> getReg() {
		return reg;
	}

	public void setReg(Map<Camera, Dog> reg) {
		this.reg = reg;
	}
	
	public void print() {
	Set<Map.Entry<Camera, Dog>> entrySet = reg.entrySet();
	
	for(Map.Entry<Camera,Dog> entry: entrySet)
	{
		 System.out.println(entry.getKey() + "\t" + entry.getValue());
	}
	}
	
}
