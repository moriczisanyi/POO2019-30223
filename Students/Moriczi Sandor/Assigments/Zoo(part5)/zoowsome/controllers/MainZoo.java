package javasmmr.zoowsome.controllers;

import java.util.ArrayList;
import java.util.Random;
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
import javasmmr.zoowsome.views.MainMenuFrame;

public class MainZoo {
	public static void createAnimals(Animal[] arr) throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.println("which animal do you wannna create? 1:Mammal, 2:Bird, 3:Reptile, 4:Aquatic, 5:Insect");
		int animalsp = scan.nextInt();
		AnimalFactory abstractFactory = new AnimalFactory();
		SpeciesFactory speciesFactory1 = null;
		int size;
		switch (animalsp) {
		case 1:
			speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
			System.out.println("insert how many animals do you wanna create (limit is 10 for now)");
			size = scan.nextInt();
			for (int i = 0; i < size; i++) {
				System.out.println("Give a number: 1 is for Tiger, 2 is for Monkey, 3 is for Cow");
				int number = scan.nextInt();
				while (number > 3 || number < 1) {
					System.out.println("your number is not between 1 and 3, please give an other number");
					number = scan.nextInt();
				}
				if (number == 1) {
					arr[i] = speciesFactory1.getAnimal(Constants.Animals.Mammals.Tiger);
				} else {
					if (number == 2)
						arr[i] = speciesFactory1.getAnimal(Constants.Animals.Mammals.Monkey);
					else {
						if (number == 3)
							arr[i] = speciesFactory1.getAnimal(Constants.Animals.Mammals.Cow);
					}
				}
			}
			break;
		case 2:
			speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Birds);
			System.out.println("insert how many animals do you wanna create (limit is 10 for now)");
			size = scan.nextInt();
			for (int i = 0; i < size; i++) {
				System.out.println("Give a number: 1 is for Owl, 2 is for Parrot, 3 is for Penguin");
				int number = scan.nextInt();
				while (number > 3 || number < 1) {
					System.out.println("your number is not between 1 and 3, please give an other number");
					number = scan.nextInt();
				}
				if (number == 1) {
					arr[i] = speciesFactory1.getAnimal(Constants.Animals.Birds.Owl);
				} else {
					if (number == 2)
						arr[i] = speciesFactory1.getAnimal(Constants.Animals.Birds.Parrot);
					else {
						if (number == 3)
							arr[i] = speciesFactory1.getAnimal(Constants.Animals.Birds.Penguin);
					}
				}
			}
			break;
		case 3:
			speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Reptiles);
			System.out.println("insert how many animals do you wanna create (limit is 10 for now)");
			size = scan.nextInt();
			for (int i = 0; i < size; i++) {
				System.out.println("Give a number: 1 is for Lizzard, 2 is for Snake, 3 is for Toad");
				int number = scan.nextInt();
				while (number > 3 || number < 1) {
					System.out.println("your number is not between 1 and 3, please give an other number");
					number = scan.nextInt();
				}
				if (number == 1) {
					arr[i] = speciesFactory1.getAnimal(Constants.Animals.Reptiles.Lizzard);
				} else {
					if (number == 2)
						arr[i] = speciesFactory1.getAnimal(Constants.Animals.Reptiles.Snake);
					else {
						if (number == 3)
							arr[i] = speciesFactory1.getAnimal(Constants.Animals.Reptiles.Toad);
					}
				}
			}
			break;
		case 4:
			speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Aquatics);
			System.out.println("insert how many animals do you wanna create (limit is 10 for now)");
			size = scan.nextInt();
			for (int i = 0; i < size; i++) {
				System.out.println("Give a number: 1 is for Fish, 2 is for Octopus, 3 is for Shark");
				int number = scan.nextInt();
				while (number > 3 || number < 1) {
					System.out.println("your number is not between 1 and 3, please give an other number");
					number = scan.nextInt();
				}
				if (number == 1) {
					arr[i] = speciesFactory1.getAnimal(Constants.Animals.Aquatics.Fish);
				} else {
					if (number == 2)
						arr[i] = speciesFactory1.getAnimal(Constants.Animals.Aquatics.Octopus);
					else {
						if (number == 3)
							arr[i] = speciesFactory1.getAnimal(Constants.Animals.Aquatics.Shark);
					}
				}
			}
			break;
		case 5:
			speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Insects);
			System.out.println("insert how many animals do you wanna create (limit is 10 for now)");
			size = scan.nextInt();
			for (int i = 0; i < size; i++) {
				System.out.println("Give a number: 1 is for Buttlerfly, 2 is for Cockroach, 3 is for Spider");
				int number = scan.nextInt();
				while (number > 3 || number < 1) {
					System.out.println("your number is not between 1 and 3, please give an other number");
					number = scan.nextInt();
				}
				if (number == 1) {
					arr[i] = speciesFactory1.getAnimal(Constants.Animals.Insects.Butterfly);
				} else {
					if (number == 2)
						arr[i] = speciesFactory1.getAnimal(Constants.Animals.Insects.Cockroach);
					else {
						if (number == 3)
							arr[i] = speciesFactory1.getAnimal(Constants.Animals.Insects.Spider);
					}
				}
			}
			break;
		default:
			break;
		}
	}

	public static ArrayList<Animal> RandomAnimals(ArrayList<Animal> arr, int size) throws Exception {
		//arr = new ArrayList<Animal>(size);
		Random rand = new Random();
		int randanimal = 1 + rand.nextInt(5);
		//System.out.println(randanimal);
		AnimalFactory abstractFactory = new AnimalFactory();
		SpeciesFactory speciesFactory1 = null;
		switch (randanimal) {
		case 1:
			speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
			for (int i = 0; i < size; i++) {
				int number = 1 + rand.nextInt(3);
				//System.out.println(number);
				if (number == 1) {
					arr.add(speciesFactory1.getAnimal(Constants.Animals.Mammals.Tiger));
				} else {
					if (number == 2)
						arr.add(speciesFactory1.getAnimal(Constants.Animals.Mammals.Monkey));
					else {
						if (number == 3)
							arr.add(speciesFactory1.getAnimal(Constants.Animals.Mammals.Cow));
					}
				}
			}
			break;
		case 2:
			speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Birds);
			for (int i = 0; i < size; i++) {
				int number = 1 + rand.nextInt(3);
				//System.out.println(number);
				if (number == 1) {
					arr.add(speciesFactory1.getAnimal(Constants.Animals.Birds.Owl));
				} else {
					if (number == 2)
						arr.add(speciesFactory1.getAnimal(Constants.Animals.Birds.Parrot));
					else {
						if (number == 3)
							arr.add(speciesFactory1.getAnimal(Constants.Animals.Birds.Penguin));
					}
				}
			}
			break;
		case 3:
			speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Reptiles);
			for (int i = 0; i < size; i++) {
				int number = 1 + rand.nextInt(3);
				//System.out.println(number);
				if (number == 1) {
					arr.add(speciesFactory1.getAnimal(Constants.Animals.Reptiles.Lizzard));
				} else {
					if (number == 2)
						arr.add(speciesFactory1.getAnimal(Constants.Animals.Reptiles.Snake));
					else {
						if (number == 3)
							arr.add(speciesFactory1.getAnimal(Constants.Animals.Reptiles.Toad));
					}
				}
			}
			break;
		case 4:
			speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Aquatics);
			for (int i = 0; i < size; i++) {
				int number = 1 + rand.nextInt(3);
				//System.out.println(number);
				if (number == 1) {
					arr.add(speciesFactory1.getAnimal(Constants.Animals.Aquatics.Fish));
				} else {
					if (number == 2)
						arr.add(speciesFactory1.getAnimal(Constants.Animals.Aquatics.Octopus));
					else {
						if (number == 3)
							arr.add(speciesFactory1.getAnimal(Constants.Animals.Aquatics.Shark));
					}
				}
			}
			break;
		case 5:
			speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Insects);
			for (int i = 0; i < size; i++) {
				int number = 1 + rand.nextInt(3);
				//System.out.println(number);
				if (number == 1) {
					arr.add(speciesFactory1.getAnimal(Constants.Animals.Insects.Butterfly));
				} else {
					if (number == 2)
						arr.add(speciesFactory1.getAnimal(Constants.Animals.Insects.Cockroach));
					else {
						if (number == 3)
							arr.add(speciesFactory1.getAnimal(Constants.Animals.Insects.Spider));
					}
				}
			}
			break;
		default:
			break;
		}
		return arr;
	}

	public static void main(String[] args) throws Exception {
		 new MainMenuController(new MainMenuFrame("Main Menu"), false);

		AnimalFactory abstractFactory = new AnimalFactory();
		SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
		Animal a1 = speciesFactory1.getAnimal(Constants.Animals.Mammals.Tiger);
		System.out.println(a1);
		Animal[] arr = new Animal[10];
		ArrayList<Animal> animals = new ArrayList<Animal>(10);
		animals = RandomAnimals(animals, 10);
		/*for (Animal a: animals)
			System.out.println(a);*/

		/*Employee[] ang = new Employee[100];
		EmployeeFactory empFactory = new EmployeeFactory();
		EmployeeAbstractFactory empAbsFactory = empFactory.getEmployeeAbstractFactory(Constants.Employees.Caretaker);
		Employee ang1 = empAbsFactory.getEmployee(Constants.Employees.Caretaker);
		for (int i = 0; i < 5; i++) {
			ang[i] = empAbsFactory.getEmployee(Constants.Employees.Caretaker);
		}
		for (Employee emp : ang) {
			if (emp != null) {
				if (emp instanceof Caretaker)
					for (Animal a : animals) {
						if (a != null) {
							if (emp.isDead() == false && a.getTakenCareOf() == false) {
								String result = ((Caretaker) emp).takeCareOf(a);

								if (result.equals(Constants.Employees.Caretakers.TCO_KILLED))
									emp.setDead(true); // System.out.println(emp.isDead()); }

								else if (result.equals(Constants.Employees.Caretakers.TCO_NO_TIME)) {
									break;
								} else {
									a.setTakenCareOf(true); // System.out.println(a.getIfTakenCare()); } }
								}
							}
						}
					}
			}
		}
			for (int i = 0; i < ang.length; i++) {
				if (ang[i] != null) {
					System.out.println("angajatul nr" + i + " este mort ?" + ang[i].isDead());
					for (Animal j: animals) {
						if (j != null) {
							System.out.println(j.getName() + " a fost ingrijit ? " + j.getTakenCareOf());
						}
					}

				}
			}*/
		
			/*AnimalRepository animalrepo = new AnimalRepository();
			ArrayList<Animal> animals2= new ArrayList<Animal>(20);
			animalrepo.save(animals);
			try {
				animals2=animalrepo.load();
			} catch (Exception e) {
				e.printStackTrace();
			}*/
			/*for(Animal a: animals2)
				System.out.println(a);*/
		
	}
}