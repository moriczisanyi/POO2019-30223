package javasmmr.zoowsome.views;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SpringLayout;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.repositories.AnimalRepository;
import javasmmr.zoowsome.repositories.EmployeeRepository;

public class ListAnimalFrame extends ZooFrame{

	private static final long serialVersionUID = -1599256608068873963L;
	
	private JTable table;
	public ListAnimalFrame(String title) {
		super(title); 
		/*setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,600);
		setVisible(true);
		setLayout(new FlowLayout());*/
		contentPanel.setLayout(new GridLayout(0, 1, 0, 0));
		JPanel panel = new JPanel();
		contentPanel.add(panel);
		SpringLayout slPanel = new SpringLayout();
		panel.setLayout(slPanel);
		
		String[] columnNames = {"Name", "NrOfLegs", "takenCareOf?", "maintenanceCost", "dangerPerc"};
		ArrayList<Animal> animals = new ArrayList<Animal>(100);
		AnimalRepository animalrepo = new AnimalRepository();
		try {
			animals=animalrepo.load();
			for(Animal a: animals)
				System.out.println(a);
		} catch (ParserConfigurationException | SAXException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Object[][] data= new Object[100][100];
		for(int i=0;i<animals.size();i++)
		{

				data[i][0]=animals.get(i).getName();
				data[i][1]=animals.get(i).getNrOfLegs();
				data[i][2]=animals.get(i).getTakenCareOf();
				data[i][3]=animals.get(i).getMaintenanceCost();
				data[i][4]=animals.get(i).getDangerPerc();
		}
		table = new JTable(data,columnNames);
		table.setPreferredScrollableViewportSize(new Dimension(500,300));
		table.setFillsViewportHeight(true);
		
		JScrollPane scroll= new JScrollPane(table);
		add(scroll);
	}
		

}
