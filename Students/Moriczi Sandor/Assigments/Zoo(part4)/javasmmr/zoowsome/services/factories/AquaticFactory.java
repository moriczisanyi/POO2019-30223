package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Fish;
import javasmmr.zoowsome.models.animals.Octopus;
import javasmmr.zoowsome.models.animals.Shark;
public class AquaticFactory extends SpeciesFactory{

	public Animal getAnimal(String type) throws Exception {
	if (Constants.Animals.Aquatics.Fish.equals(type)) {
		return new Fish(2,0.1); 
	} else if (Constants.Animals.Aquatics.Octopus.equals(type)) {
		return new Octopus(2.5,0.05);
	} else if (Constants.Animals.Aquatics.Shark.equals(type)) {
		return new Shark(7,0.9);
	} else 
		throw new Exception("Invalid animal exception!");
	}
}
