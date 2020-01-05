package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JComboBox;


import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.repositories.AnimalRepository;
import javasmmr.zoowsome.repositories.EmployeeRepository;
import javasmmr.zoowsome.views.ZooFrame;
import javasmmr.zoowsome.views.utilities.FrameStack;

public class AbstractController {
	protected ZooFrame frame;
	public static ArrayList<Animal> animals = new ArrayList<Animal>(100);
	public static ArrayList<Employee> employees = new ArrayList<Employee>(100);
	public AnimalRepository animalrepo = new AnimalRepository();
	public EmployeeRepository employeerepo= new EmployeeRepository();

	public AbstractController(ZooFrame frame, boolean hasBackButton) {
		this.frame = frame;
		if (hasBackButton)
			frame.setBackButtonActionListener(new BackButtonListener());
	}

	private class BackButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			FrameStack.getInstance().pop();
		}
	}
}