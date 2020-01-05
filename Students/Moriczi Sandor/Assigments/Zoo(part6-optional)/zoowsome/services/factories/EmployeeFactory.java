package javasmmr.zoowsome.services.factories;

public class EmployeeFactory{
	public  EmployeeAbstractFactory getEmployeeAbstractFactory(String type)
	{
		if(Constants.Employees.Caretaker.equals(type))
			return new CaretakerFactory();
		else
			return null;
	}
}
