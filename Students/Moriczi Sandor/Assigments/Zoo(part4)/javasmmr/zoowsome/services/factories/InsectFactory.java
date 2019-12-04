package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Butterfly;
import javasmmr.zoowsome.models.animals.Cockroach;
import javasmmr.zoowsome.models.animals.Spider;

public class InsectFactory extends SpeciesFactory{
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Insects.Butterfly.equals(type)) {
			return new Butterfly(1,0.01); 
		} else if (Constants.Animals.Insects.Cockroach.equals(type)) {
			return new Cockroach(1,0.02);
		} else if (Constants.Animals.Insects.Spider.equals(type)) {
			return new Spider(1,0.4);
		} else 
			throw new Exception("Invalid animal exception!");
		}
}
