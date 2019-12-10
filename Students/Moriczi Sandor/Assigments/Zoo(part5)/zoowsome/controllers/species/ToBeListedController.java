package javasmmr.zoowsome.controllers.species;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javasmmr.zoowsome.controllers.AbstractController;
import javasmmr.zoowsome.controllers.AddController;
import javasmmr.zoowsome.controllers.ListAnimalController;
import javasmmr.zoowsome.controllers.ListEmployeeController;
import javasmmr.zoowsome.views.AddFrame;
import javasmmr.zoowsome.views.ListAnimalFrame;
import javasmmr.zoowsome.views.ListEmployeeFrame;
import javasmmr.zoowsome.views.ToBeListedFrame;
import javasmmr.zoowsome.views.ZooFrame;

public class ToBeListedController extends AbstractController{

	public ToBeListedController(ToBeListedFrame frame, boolean hasBackButton) {
		super(frame, hasBackButton);
		frame.setListAnimalsButtonActionListener(new ListAnimalsButtonActionListener());
		frame.setListEmployeeButtonActionListener(new ListEmployeeButtonActionListener());
	}
	private class ListAnimalsButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			new ListAnimalController(new ListAnimalFrame("ListAnimal"), true);
		}
	}
	
	private class ListEmployeeButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			new ListEmployeeController(new ListEmployeeFrame("ListEmployee"), true);
		}
	}

}
