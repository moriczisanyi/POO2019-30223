package javasmmr.zoowsome.controllers.species;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javasmmr.zoowsome.controllers.AbstractController;
import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.repositories.AnimalRepository;
import javasmmr.zoowsome.services.factories.AnimalFactory;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.SpeciesFactory;
import javasmmr.zoowsome.views.ZooFrame;
import javasmmr.zoowsome.views.species.MammalFrame;

public class MammalController extends AbstractController{

	public MammalController(MammalFrame frame, boolean hasBackButton) {
		super(frame, hasBackButton);
		frame.setTigerButtonActionListener(new TigerButtonActionListener());
		frame.setMonkeyButtonActionListener(new MonkeyButtonActionListener());
		frame.setCowButtonActionListener(new CowButtonActionListener());
	}
	
	private class TigerButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			AnimalFactory abstractFactory = new AnimalFactory();
			SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
			try {
				Animal a = speciesFactory1.getAnimal(Constants.Animals.Mammals.Tiger);
				animals.add(a);
				//animalrepo.save(animals);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	
	private class MonkeyButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			AnimalFactory abstractFactory = new AnimalFactory();
			SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
			try {
				Animal a = speciesFactory1.getAnimal(Constants.Animals.Mammals.Monkey);
				animals.add(a);
				//animalrepo.save(animals);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	
	private class CowButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			AnimalFactory abstractFactory = new AnimalFactory();
			SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
			try {
				Animal a = speciesFactory1.getAnimal(Constants.Animals.Mammals.Cow);
				animals.add(a);
				//animalrepo.save(animals);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

}
