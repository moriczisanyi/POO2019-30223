package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.controllers.species.ToBeListedController;
import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.views.AddFrame;
import javasmmr.zoowsome.views.ListAnimalFrame;
import javasmmr.zoowsome.views.MainMenuFrame;
import javasmmr.zoowsome.views.ToBeListedFrame;

public class MainMenuController extends AbstractController {
	public MainMenuController(MainMenuFrame frame, boolean hasBackButton) {
		super(frame, hasBackButton);
		frame.setAddButtonActionListener(new AddButtonActionListener());
		frame.setToBeListedButtonActionListener(new ListButtonActionListener());
		frame.setSaveAndExitButtonActionListener(new SaveAndExitButtonActionListener());
	}

	private class AddButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			new AddController(new AddFrame("Add"), true);
		}
	}
	private class ListButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			new ToBeListedController(new ToBeListedFrame("ToBeListedList"), true);
		}
	}
	private class SaveAndExitButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				for(Animal a: animals)
					System.out.println(a);
				animalrepo.save(animals);
				employeerepo.save(employees);
			} catch (FileNotFoundException | XMLStreamException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.exit(0);
		}
	}
}
