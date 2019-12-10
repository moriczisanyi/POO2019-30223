package javasmmr.zoowsome.controllers.species;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javasmmr.zoowsome.controllers.AbstractController;
import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.AnimalFactory;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.SpeciesFactory;
import javasmmr.zoowsome.views.ZooFrame;
import javasmmr.zoowsome.views.species.BirdFrame;

public class BirdController extends AbstractController{

	public BirdController(BirdFrame frame, boolean hasBackButton) {
		super(frame, hasBackButton);
		frame.setParrotButtonActionListener(new ParrotButtonActionListener());
		frame.setOwlButtonActionListener(new OwlButtonActionListener());
		frame.setPenguinButtonActionListener(new PenguinButtonActionListener());
	}
	
	private class ParrotButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			AnimalFactory abstractFactory = new AnimalFactory();
			SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Birds);
			try {
				Animal a = speciesFactory1.getAnimal(Constants.Animals.Birds.Parrot);
				animals.add(a);
				//animalrepo.save(animals);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	
	private class OwlButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			AnimalFactory abstractFactory = new AnimalFactory();
			SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Birds);
			try {
				Animal a = speciesFactory1.getAnimal(Constants.Animals.Birds.Owl);
				animals.add(a);
				//animalrepo.save(animals);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	
	private class PenguinButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			AnimalFactory abstractFactory = new AnimalFactory();
			SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Birds);
			try {
				Animal a = speciesFactory1.getAnimal(Constants.Animals.Birds.Penguin);
				animals.add(a);
				//animalrepo.save(animals);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

}
