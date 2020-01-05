package javasmmr.zoowsome.views.species;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import javasmmr.zoowsome.views.ZooFrame;

public class ReptileFrame extends ZooFrame{

	private JButton btnLizzard;
	private JButton btnToad;
	private JButton btnSnake;
	private static final long serialVersionUID = -7502007813520576282L;

	public ReptileFrame(String title) {
		super(title);
		contentPanel.setLayout(new GridLayout(0, 1, 0, 0));
		JPanel panel = new JPanel();
		contentPanel.add(panel);
		SpringLayout slPanel = new SpringLayout();
		panel.setLayout(slPanel);
		btnLizzard= new JButton("Lizzard");
		slPanel.putConstraint(SpringLayout.NORTH, btnLizzard, 65, SpringLayout.NORTH, panel);
		slPanel.putConstraint(SpringLayout.WEST, btnLizzard, 93, SpringLayout.WEST, panel);
		panel.add(btnLizzard);
		btnToad= new JButton("Toad");
		slPanel.putConstraint(SpringLayout.NORTH, btnToad, 95, SpringLayout.NORTH, panel);
		slPanel.putConstraint(SpringLayout.WEST, btnToad, 93, SpringLayout.WEST, panel);
		panel.add(btnToad);
		btnSnake= new JButton("Snake");
		slPanel.putConstraint(SpringLayout.NORTH, btnSnake, 125, SpringLayout.NORTH, panel);
		slPanel.putConstraint(SpringLayout.WEST, btnSnake, 93, SpringLayout.WEST, panel);
		panel.add(btnSnake);
		setVisible(true);
	}
	
	public void setLizzardButtonActionListener(ActionListener a) {
		btnLizzard.addActionListener(a);
	}
	public void setToadButtonActionListener(ActionListener a) {
		btnToad.addActionListener(a);
	}
	public void setSnakeButtonActionListener(ActionListener a) {
		btnSnake.addActionListener(a);
	}

}
