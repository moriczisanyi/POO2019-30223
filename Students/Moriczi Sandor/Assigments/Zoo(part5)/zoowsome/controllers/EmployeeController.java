package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.services.factories.AnimalFactory;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.EmployeeAbstractFactory;
import javasmmr.zoowsome.services.factories.EmployeeFactory;
import javasmmr.zoowsome.services.factories.SpeciesFactory;
import javasmmr.zoowsome.views.EmployeeFrame;
import javasmmr.zoowsome.views.ZooFrame;

public class EmployeeController extends AbstractController {
	
	public EmployeeController(EmployeeFrame frame, boolean hasBackButton) {
		super(frame, hasBackButton);
		frame.setCaretakerButtonActionListener(new CaretakerButtonActionListener());
	}
	
	private class CaretakerButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			EmployeeFactory empFactory = new EmployeeFactory();
			EmployeeAbstractFactory empAbsFactory = empFactory.getEmployeeAbstractFactory(Constants.Employees.Caretaker);
			try {
				Employee ang1 = empAbsFactory.getEmployee(Constants.Employees.Caretaker);
				employees.add(ang1);
				//animalrepo.save(animals);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

}
