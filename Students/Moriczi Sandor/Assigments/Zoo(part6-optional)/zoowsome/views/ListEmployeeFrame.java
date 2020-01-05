package javasmmr.zoowsome.views;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SpringLayout;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.repositories.AnimalRepository;
import javasmmr.zoowsome.repositories.EmployeeRepository;

public class ListEmployeeFrame extends ZooFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 759197518385439338L;
	private JTable table;
	public ListEmployeeFrame(String title) {
		super(title);
			contentPanel.setLayout(new GridLayout(0, 1, 0, 0));
			JPanel panel = new JPanel();
			contentPanel.add(panel);
			SpringLayout slPanel = new SpringLayout();
			panel.setLayout(slPanel);
			
			String[] columnNames = {"Name", "id", "salary", "isDead?", "workingHours"};
			ArrayList<Employee> employees = new ArrayList<Employee>(100);
			EmployeeRepository employeerepo = new EmployeeRepository();
			try {
				employees=employeerepo.load();
				for(Employee a: employees)
					System.out.println(a);
			} catch (ParserConfigurationException | SAXException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Object[][] data= new Object[100][100];
			for(int i=0;i<employees.size();i++)
			{

					data[i][0]=employees.get(i).getName();
					data[i][1]=employees.get(i).getId();
					data[i][2]=employees.get(i).getSalary();
					data[i][3]=employees.get(i).isDead();
					data[i][4]=((Caretaker)employees.get(i)).getWorkingHours();
			}
			table = new JTable(data,columnNames);
			table.setPreferredScrollableViewportSize(new Dimension(500,300));
			table.setFillsViewportHeight(true);
			
			JScrollPane scroll= new JScrollPane(table);
			add(scroll);
		}

}
