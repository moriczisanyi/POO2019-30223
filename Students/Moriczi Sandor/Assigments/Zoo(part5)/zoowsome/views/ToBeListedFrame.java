package javasmmr.zoowsome.views;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class ToBeListedFrame extends ZooFrame{

	
	private JButton btnListEmployee;
	private JButton btnListAnimals;
	
	private static final long serialVersionUID = -7563165818106334963L;

	public ToBeListedFrame(String title) {
		super(title);
		contentPanel.setLayout(new GridLayout(0, 3, 0, 0));
		JPanel panel = new JPanel();
// adding empty panel to fill grid layout
		contentPanel.add(panel);
		JPanel pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout(slPanel);
		btnListEmployee = new JButton("ListEmployee");
		slPanel.putConstraint(SpringLayout.NORTH, btnListEmployee, 65, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnListEmployee, 93, SpringLayout.WEST, pan);
		pan.add(btnListEmployee);
		btnListAnimals = new JButton("ListAnimals");
		slPanel.putConstraint(SpringLayout.NORTH, btnListAnimals, 150, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnListAnimals, 94, SpringLayout.WEST, pan);
		pan.add(btnListAnimals);
		JPanel panel_2 = new JPanel();
		contentPanel.add(panel_2);
		setVisible(true);
	}
	public void setListEmployeeButtonActionListener(ActionListener a) {
		btnListEmployee.addActionListener(a);
	}
	public void setListAnimalsButtonActionListener(ActionListener a) {
		btnListAnimals.addActionListener(a);
	}

}
