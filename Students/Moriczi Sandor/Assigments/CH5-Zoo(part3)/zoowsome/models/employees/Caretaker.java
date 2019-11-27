package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.Constants;

public class Caretaker extends Employee implements Caretaker_I{
	
	private Double workingHours;
	public Caretaker(String name, BigDecimal salary, boolean isDead, Double workingHours)
	{
		super(name, salary, isDead);
		this.workingHours=workingHours;
	}
	public Double getWorkingHours() {
		return workingHours;
	}
	public void setWorkingHours(Double workingHours) {
		this.workingHours = workingHours;
	}
	
	public String takeCareOf( Animal a) {
		if (a.kill()) {
		return Constants.Employees.Caretakers.TCO_KILLED;
		}
		if (this.workingHours < a.getMaintenanceCost()){
		return Constants.Employees.Caretakers.TCO_NO_TIME;
		}
		a.setTakenCareOf(true);
		this.workingHours=this.workingHours-a.getMaintenanceCost();
		return Constants.Employees.Caretakers.TCO_SUCCESS;
		}
	}
		
