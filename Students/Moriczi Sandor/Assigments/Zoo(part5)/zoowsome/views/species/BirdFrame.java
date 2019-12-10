package javasmmr.zoowsome.views.species;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import javasmmr.zoowsome.views.ZooFrame;

public class BirdFrame extends ZooFrame{

	private JButton btnParrot;
	private JButton btnOwl;
	private JButton btnPenguin;
	private static final long serialVersionUID = -6504879820932045738L;

	public BirdFrame(String title) {
		super(title);
		contentPanel.setLayout(new GridLayout(0, 1, 0, 0));
		JPanel panel = new JPanel();
		contentPanel.add(panel);
		SpringLayout slPanel = new SpringLayout();
		panel.setLayout(slPanel);
		btnParrot= new JButton("Parrot");
		slPanel.putConstraint(SpringLayout.NORTH, btnParrot, 65, SpringLayout.NORTH, panel);
		slPanel.putConstraint(SpringLayout.WEST, btnParrot, 93, SpringLayout.WEST, panel);
		panel.add(btnParrot);
		btnOwl= new JButton("Owl");
		slPanel.putConstraint(SpringLayout.NORTH, btnOwl, 95, SpringLayout.NORTH, panel);
		slPanel.putConstraint(SpringLayout.WEST, btnOwl, 93, SpringLayout.WEST, panel);
		panel.add(btnOwl);
		btnPenguin= new JButton("Penguin");
		slPanel.putConstraint(SpringLayout.NORTH, btnPenguin, 125, SpringLayout.NORTH, panel);
		slPanel.putConstraint(SpringLayout.WEST, btnPenguin, 93, SpringLayout.WEST, panel);
		panel.add(btnPenguin);
		setVisible(true);
	}
	
	public void setParrotButtonActionListener(ActionListener a) {
		btnParrot.addActionListener(a);
	}
	public void setOwlButtonActionListener(ActionListener a) {
		btnOwl.addActionListener(a);
	}
	public void setPenguinButtonActionListener(ActionListener a) {
		btnPenguin.addActionListener(a);
	}

}
