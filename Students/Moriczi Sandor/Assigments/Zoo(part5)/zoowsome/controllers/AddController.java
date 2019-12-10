package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javasmmr.zoowsome.controllers.species.*;
import javasmmr.zoowsome.controllers.species.MammalController;
import javasmmr.zoowsome.views.*;
import javasmmr.zoowsome.views.species.AquaticFrame;
import javasmmr.zoowsome.views.species.BirdFrame;
import javasmmr.zoowsome.views.species.InsectFrame;
import javasmmr.zoowsome.views.species.MammalFrame;
import javasmmr.zoowsome.views.species.ReptileFrame;

public class AddController extends AbstractController {
	public AddController(AddFrame addFrame, boolean hasBackButton) {
		super(addFrame, hasBackButton);
		addFrame.setMammalButtonActionListener(new MammalButtonActionListener());
		addFrame.setBirdButtonActionListener(new BirdButtonActionListener());
		addFrame.setAquaticButtonActionListener(new AquaticButtonActionListener());
		addFrame.setReptileButtonActionListener(new ReptileButtonActionListener());
		addFrame.setInsectButtonActionListener(new InsectButtonActionListener());
		addFrame.setEmployeeButtonActionListener(new EmployeeButtonActionListener());
	}

	private class MammalButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			new MammalController(new MammalFrame("Mammal"), true);
		}
	}
	
	private class BirdButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			new BirdController(new BirdFrame("Brd"), true);
		}
	}
	
	private class AquaticButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			new AquaticController(new AquaticFrame("Aquatic"), true);
		}
	}
	
	private class ReptileButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			new ReptileController(new ReptileFrame("Reptile"), true);
		}
	}
	
	private class InsectButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			new InsectController(new InsectFrame("Insect"), true);
		}
	}
	private class EmployeeButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			new EmployeeController(new EmployeeFrame("Insect"), true);
		}
	}
}
