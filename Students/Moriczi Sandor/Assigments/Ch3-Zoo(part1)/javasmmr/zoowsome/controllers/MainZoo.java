package javasmmr.zoowsome.controllers;
import javasmmr.zoowsome.models.animals.*;
import java.util.*;
import javasmmr.zoowsome.services.factories.*;
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
		MainZoo.createMammals(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
	}

}
