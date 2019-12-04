package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Lizard;
import javasmmr.zoowsome.models.animals.Snake;
import javasmmr.zoowsome.models.animals.Toad;

public class ReptileFactory extends SpeciesFactory{
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Reptiles.Lizzard.equals(type)) {
			return new Lizard(3,0.2); 
		} else if (Constants.Animals.Reptiles.Snake.equals(type)) {
			return new Snake(5,0.6);
		} else if (Constants.Animals.Reptiles.Toad.equals(type)) {
			return new Toad(4.5,0.1);
		} else 
			throw new Exception("Invalid animal exception!");
		}
}

