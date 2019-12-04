package javasmmr.zoowsome.controllers;
import java.util.ArrayList;
import java.util.Scanner;

import org.xml.sax.SAXParseException;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.repositories.AnimalRepository;
import javasmmr.zoowsome.services.factories.AnimalFactory;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.EmployeeAbstractFactory;
import javasmmr.zoowsome.services.factories.EmployeeFactory;
import javasmmr.zoowsome.services.factories.SpeciesFactory;
public class MainZoo {
	
	public static void createMammals(Animal[] arr) throws Exception
	{
		AnimalFactory abstractFactory = new AnimalFactory();
		SpeciesFactory speciesFactory1 =abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
		Scanner scan= new Scanner(System.in);
		System.out.println("insert how many Mammals do you wanna create (limit is 10 for now)");
		int size=scan.nextInt();
		for(int i=0;i<size;i++)
		{
		System.out.println("Give a number: 1 is for Tiger, 2 is for Monkey, 3 is for Cow");
		int number=scan.nextInt();
		while(number>3 || number<1)
		{
			System.out.println("your number is not between 1 and 3, please give an other number");
			number=scan.nextInt();
		}
		if(number==1)
		{
			arr[i]=speciesFactory1.getAnimal(Constants.Animals.Mammals.Tiger);
		}
		else
		{
			if(number==2)
				arr[i]=speciesFactory1.getAnimal(Constants.Animals.Mammals.Monkey);
			else
			{
				if(number==3)
					arr[i]=speciesFactory1.getAnimal(Constants.Animals.Mammals.Cow);
			}
		}
		}
	}
	public static void main(String[] args) throws Exception {
		AnimalFactory abstractFactory = new AnimalFactory();
		SpeciesFactory speciesFactory1 =abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
		Animal a1= speciesFactory1.getAnimal(Constants.Animals.Mammals.Tiger);
		System.out.println(a1);
		Animal[] arr= new Animal[10];
		/*MainZoo.createMammals(arr);
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==null)
				break;
			System.out.println(arr[i]);
		}
		
		Employee[] ang= new Employee[100];
		EmployeeFactory empFactory= new EmployeeFactory();
		EmployeeAbstractFactory empAbsFactory=empFactory.getEmployeeAbstractFactory(Constants.Employees.Caretaker);
		Employee ang1 =empAbsFactory.getEmployee(Constants.Employees.Caretaker);
		for(int i=0;i<5;i++)
		{
			ang[i]=empAbsFactory.getEmployee(Constants.Employees.Caretaker);
		}
		
		for(Employee emp: ang) 
		{
			if(emp!=null)
			{
			if(emp instanceof Caretaker)
			for (Animal a: arr)
			{
				if(a!=null)
				{
					if(emp.isDead()==false && a.getTakenCareOf()==false)
						{
						String result = ((Caretaker)emp).takeCareOf(a);
						
						if(result.equals(Constants.Employees.Caretakers.TCO_KILLED))
						{
								emp.setDead(true);
								//System.out.println(emp.isDead());
						}
			
						else if(result.equals(Constants.Employees.Caretakers.TCO_NO_TIME))
								{
								break;
								}
								else 
									{
									a.setTakenCareOf(true);
									//System.out.println(a.getIfTakenCare());
									}
						}
				}
			}
			}
		}
		for(int i=0;i<ang.length;i++)
		{
			if(ang[i]!=null)
			{
				System.out.println("angajatul nr" + i +" este mort ?" + ang[i].isDead());
				for(int j=0;j<arr.length;j++)
				{
					if(arr[j]!=null)
					{
						System.out.println(arr[j].getName() + " a fost ingrijit ? " +arr[j].getTakenCareOf());
					}
				}
				
			}
		}*/
		
		AnimalRepository animalrepo= new AnimalRepository();
		ArrayList<Animal>animals= new ArrayList<Animal>(10);
		for(int i=0;i<10;i++)
		{
			if(i%2==0)
				animals.add(speciesFactory1.getAnimal(Constants.Animals.Mammals.Tiger));
			else
				animals.add(speciesFactory1.getAnimal(Constants.Animals.Mammals.Monkey));
		}
		animalrepo.save(animals);
		try {
		animalrepo.load();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}	
}