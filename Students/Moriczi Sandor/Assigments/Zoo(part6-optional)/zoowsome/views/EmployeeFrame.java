package javasmmr.zoowsome.views;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class EmployeeFrame extends ZooFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = -95332304121074376L;
	JButton btnCaretaker;
	
	public EmployeeFrame(String title) {
		super(title);
		contentPanel.setLayout(new GridLayout(0, 1, 0, 0));
		JPanel panel = new JPanel();
		contentPanel.add(panel);
		SpringLayout slPanel = new SpringLayout();
		panel.setLayout(slPanel);
		btnCaretaker= new JButton("Caretaker");
		slPanel.putConstraint(SpringLayout.NORTH, btnCaretaker, 65, SpringLayout.NORTH, panel);
		slPanel.putConstraint(SpringLayout.WEST, btnCaretaker, 93, SpringLayout.WEST, panel);
		panel.add(btnCaretaker);
		setVisible(true);
		
	}
	public void setCaretakerButtonActionListener(ActionListener a) {
		btnCaretaker.addActionListener(a);
	}

}
