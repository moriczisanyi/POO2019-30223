package javasmmr.zoowsome.views;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class AddFrame extends ZooFrame{
	
	private JButton btnMammal;
	private JButton btnAquatic;
	private JButton btnInsect;
	private JButton btnBird;
	private JButton btnReptile;
	private JButton btnEmployee;
	private static final long serialVersionUID = 8008380034804960672L;
	public AddFrame(String title) {
		super(title);
		
		contentPanel.setLayout(new GridLayout(3, 2));
		JPanel panel = new JPanel();
		JPanel panelBtn1 = new JPanel();
		JPanel panelBtn2 = new JPanel();
		JPanel panelBtn3 = new JPanel();
		JPanel panelBtn4 = new JPanel();
		JPanel panelBtn5 = new JPanel();
		JPanel panelBtn6 = new JPanel();
		JPanel panel2 = new JPanel();
		panel2.setLayout( new FlowLayout());
		//contentPanel.add(panel);
		contentPanel.add(panelBtn1);
		contentPanel.add(panelBtn2);
		contentPanel.add(panelBtn3);
		contentPanel.add(panelBtn4);
		contentPanel.add(panelBtn5);
		contentPanel.add(panelBtn6);
		super.add(panel2, BorderLayout.SOUTH);
		SpringLayout slPanel = new SpringLayout();
		//panel.setLayout(slPanel);
		
		btnMammal= new JButton("Mammal");
		//slPanel.putConstraint(SpringLayout.NORTH, btnMammal, 65, SpringLayout.NORTH, panel);
		//slPanel.putConstraint(SpringLayout.WEST, btnMammal, 375, SpringLayout.WEST, panel);
		panelBtn1.add(btnMammal);
		
		btnBird= new JButton("Bird");
		//slPanel.putConstraint(SpringLayout.NORTH, btnBird, 95, SpringLayout.NORTH, panel);
		//slPanel.putConstraint(SpringLayout.WEST, btnBird, 375, SpringLayout.WEST, panel);
		panelBtn2.add(btnBird);
		
		btnAquatic= new JButton("Aquatic");
		//slPanel.putConstraint(SpringLayout.NORTH, btnAquatic, 125, SpringLayout.NORTH, panel);
		//slPanel.putConstraint(SpringLayout.WEST, btnAquatic, 375, SpringLayout.WEST, panel);
		panelBtn3.add(btnAquatic);
		
		btnInsect= new JButton("Insect");
		//slPanel.putConstraint(SpringLayout.NORTH, btnInsect, 155, SpringLayout.NORTH, panel);
		//slPanel.putConstraint(SpringLayout.WEST, btnInsect, 375, SpringLayout.WEST, panel);
		panelBtn4.add(btnInsect);
		
		btnReptile= new JButton("Reptile");
		//slPanel.putConstraint(SpringLayout.NORTH, btnReptile, 185, SpringLayout.NORTH, panel);
		//slPanel.putConstraint(SpringLayout.WEST, btnReptile, 375, SpringLayout.WEST, panel);
		panelBtn5.add(btnReptile);
		
		btnEmployee= new JButton("Employee");
		//slPanel.putConstraint(SpringLayout.NORTH, btnEmployee, 215, SpringLayout.NORTH, panel);
		//slPanel.putConstraint(SpringLayout.WEST, btnEmployee, 375, SpringLayout.WEST, panel);
		panelBtn6.add(btnEmployee);
		setVisible(true);
	}
	public void setMammalButtonActionListener(ActionListener a) {
		btnMammal.addActionListener(a);
	}
	public void setBirdButtonActionListener(ActionListener a) {
		btnBird.addActionListener(a);
	}
	public void setInsectButtonActionListener(ActionListener a) {
		btnInsect.addActionListener(a);
	}
	public void setAquaticButtonActionListener(ActionListener a) {
		btnAquatic.addActionListener(a);
	}
	public void setReptileButtonActionListener(ActionListener a) {
		btnReptile.addActionListener(a);
	}
	public void setEmployeeButtonActionListener(ActionListener a) {
		btnEmployee.addActionListener(a);
	}

	
}
