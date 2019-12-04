package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Owl;
import javasmmr.zoowsome.models.animals.Parrot;
import javasmmr.zoowsome.models.animals.Penguin;

public class BirdFactory extends SpeciesFactory{
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Birds.Owl.equals(type)) {
			return new Owl(4,0.2); 
		} else if (Constants.Animals.Birds.Parrot.equals(type)) {
			return new Parrot(3,0.05);
		} else if (Constants.Animals.Birds.Penguin.equals(type)) {
			return new Penguin(3,0.05);
		} else 
			throw new Exception("Invalid animal exception!");
		}
}
