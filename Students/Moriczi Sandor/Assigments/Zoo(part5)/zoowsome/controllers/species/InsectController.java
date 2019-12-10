package javasmmr.zoowsome.controllers.species;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javasmmr.zoowsome.controllers.AbstractController;
import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.AnimalFactory;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.SpeciesFactory;
import javasmmr.zoowsome.views.ZooFrame;
import javasmmr.zoowsome.views.species.InsectFrame;

public class InsectController extends AbstractController{

	public InsectController(InsectFrame frame, boolean hasBackButton) {
		super(frame, hasBackButton);
		frame.setSpiderButtonActionListener(new SpiderButtonActionListener());
		frame.setCockroachButtonActionListener(new CockroachButtonActionListener());
		frame.setButterflyButtonActionListener(new ButterflyButtonActionListener());
	}

	
	private class SpiderButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			AnimalFactory abstractFactory = new AnimalFactory();
			SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Insects);
			try {
				Animal a = speciesFactory1.getAnimal(Constants.Animals.Insects.Spider);
				animals.add(a);
				//animalrepo.save(animals);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	
	private class CockroachButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			AnimalFactory abstractFactory = new AnimalFactory();
			SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Insects);
			try {
				Animal a = speciesFactory1.getAnimal(Constants.Animals.Insects.Cockroach);
				animals.add(a);
				//animalrepo.save(animals);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	
	private class ButterflyButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			AnimalFactory abstractFactory = new AnimalFactory();
			SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Insects);
			try {
				Animal a = speciesFactory1.getAnimal(Constants.Animals.Insects.Butterfly);
				animals.add(a);
				//animalrepo.save(animals);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
}
