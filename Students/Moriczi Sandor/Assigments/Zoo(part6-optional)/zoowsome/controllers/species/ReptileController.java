package javasmmr.zoowsome.controllers.species;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javasmmr.zoowsome.controllers.AbstractController;
import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.repositories.AnimalRepository;
import javasmmr.zoowsome.services.factories.AnimalFactory;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.SpeciesFactory;
import javasmmr.zoowsome.views.ZooFrame;
import javasmmr.zoowsome.views.species.ReptileFrame;

public class ReptileController extends AbstractController{

	public ReptileController(ReptileFrame frame, boolean hasBackButton) {
		super(frame, hasBackButton);
		frame.setLizzardButtonActionListener(new LizzardButtonActionListener());
		frame.setToadButtonActionListener(new ToadButtonActionListener());
		frame.setSnakeButtonActionListener(new SnakeButtonActionListener());
	}
	private class LizzardButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			AnimalFactory abstractFactory = new AnimalFactory();
			SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Reptiles);
			try {
				Animal a = speciesFactory1.getAnimal(Constants.Animals.Reptiles.Lizzard);
				animals.add(a);
				//animalrepo.save(animals);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	
	private class ToadButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			AnimalFactory abstractFactory = new AnimalFactory();
			SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Reptiles);
			try {
				Animal a = speciesFactory1.getAnimal(Constants.Animals.Reptiles.Toad);
				animals.add(a);
				//animalrepo.save(animals);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	
	private class SnakeButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			AnimalFactory abstractFactory = new AnimalFactory();
			SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Reptiles);
			try {
				Animal a = speciesFactory1.getAnimal(Constants.Animals.Reptiles.Snake);
				animals.add(a);
				//animalrepo.save(animals);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

}
