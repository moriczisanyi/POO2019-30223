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
import javasmmr.zoowsome.views.species.AquaticFrame;

public class AquaticController extends AbstractController{

	public AquaticController(AquaticFrame frame, boolean hasBackButton) {
		super(frame, hasBackButton);
		frame.setFishButtonActionListener(new FishButtonActionListener());
		frame.setSharkButtonActionListener(new SharkButtonActionListener());
		frame.setOctopusButtonActionListener(new OctopusButtonActionListener());
	}
	
	private class FishButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			AnimalFactory abstractFactory = new AnimalFactory();
			SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Aquatics);
			try {
				Animal a = speciesFactory1.getAnimal(Constants.Animals.Aquatics.Fish);
				animals.add(a);
				//animalrepo.save(animals);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	
	private class SharkButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			AnimalFactory abstractFactory = new AnimalFactory();
			SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Aquatics);
			try {
				Animal a = speciesFactory1.getAnimal(Constants.Animals.Aquatics.Shark);
				animals.add(a);
				//animalrepo.save(animals);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	
	private class OctopusButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			AnimalFactory abstractFactory = new AnimalFactory();
			SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Aquatics);
			try {
				Animal a = speciesFactory1.getAnimal(Constants.Animals.Aquatics.Octopus);
				animals.add(a);
				//animalrepo.save(animals);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

}
