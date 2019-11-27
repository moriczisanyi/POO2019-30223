package javasmmr.zoowsome.services.factories;

import java.math.BigDecimal;

import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.models.employees.Employee;

public class CaretakerFactory extends EmployeeAbstractFactory {
	public Employee getEmployee(String type)
	{
		if(Constants.Employees.Caretaker.equals(type))
			
		{ 	BigDecimal b= new BigDecimal(1);
			return new Caretaker("Name",b,false,20.0);
		}
		else
			return null;
		}
}
