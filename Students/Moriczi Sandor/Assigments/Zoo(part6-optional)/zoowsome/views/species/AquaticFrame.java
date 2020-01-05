package javasmmr.zoowsome.views.species;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import javasmmr.zoowsome.views.ZooFrame;

public class AquaticFrame extends ZooFrame{

	private JButton btnFish;
	private JButton btnShark;
	private JButton btnOctopus;
	private static final long serialVersionUID = 7102721734596342756L;

	public AquaticFrame(String title) {
		super(title);
		contentPanel.setLayout(new GridLayout(0, 1, 0, 0));
		JPanel panel = new JPanel();
		contentPanel.add(panel);
		SpringLayout slPanel = new SpringLayout();
		panel.setLayout(slPanel);
		btnFish= new JButton("Fish");
		slPanel.putConstraint(SpringLayout.NORTH, btnFish, 65, SpringLayout.NORTH, panel);
		slPanel.putConstraint(SpringLayout.WEST, btnFish, 93, SpringLayout.WEST, panel);
		panel.add(btnFish);
		btnShark= new JButton("Shark");
		slPanel.putConstraint(SpringLayout.NORTH, btnShark, 95, SpringLayout.NORTH, panel);
		slPanel.putConstraint(SpringLayout.WEST, btnShark, 93, SpringLayout.WEST, panel);
		panel.add(btnShark);
		btnOctopus= new JButton("Octopus");
		slPanel.putConstraint(SpringLayout.NORTH, btnOctopus, 125, SpringLayout.NORTH, panel);
		slPanel.putConstraint(SpringLayout.WEST, btnOctopus, 93, SpringLayout.WEST, panel);
		panel.add(btnOctopus);
		setVisible(true);
	}
	
	public void setFishButtonActionListener(ActionListener a) {
		btnFish.addActionListener(a);
	}
	public void setSharkButtonActionListener(ActionListener a) {
		btnShark.addActionListener(a);
	}
	public void setOctopusButtonActionListener(ActionListener a) {
		btnOctopus.addActionListener(a);
	}

}
