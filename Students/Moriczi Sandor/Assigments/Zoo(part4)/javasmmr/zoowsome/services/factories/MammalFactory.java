package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Cow;
import javasmmr.zoowsome.models.animals.Monkey;
import javasmmr.zoowsome.models.animals.Tiger;

public class MammalFactory extends SpeciesFactory {
@Override
public Animal getAnimal(String type) throws Exception {
if (Constants.Animals.Mammals.Monkey.equals(type)) {
	return new Monkey(5,0.4); 
} else if (Constants.Animals.Mammals.Cow.equals(type)) {
	return new Cow(7,0.25);
} else if (Constants.Animals.Mammals.Tiger.equals(type)) {
	return new Tiger(8,0.90);
} else 
	throw new Exception("Invalid animal exception!");
}
}

