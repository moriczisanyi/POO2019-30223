package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class BirdFactory extends SpeciesFactory{
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Birds.Owl.equals(type)) {
			return new Owl(); 
		} else if (Constants.Animals.Birds.Parrot.equals(type)) {
			return new Parrot();
		} else if (Constants.Animals.Birds.Penguin.equals(type)) {
			return new Penguin();
		} else 
			throw new Exception("Invalid animal exception!");
		}
}
