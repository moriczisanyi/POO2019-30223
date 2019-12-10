package javasmmr.zoowsome.views.species;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import javasmmr.zoowsome.views.ZooFrame;

public class InsectFrame extends ZooFrame {

	private JButton btnSpider;
	private JButton btnCockroach;
	private JButton btnButterfly;
	private static final long serialVersionUID = -7623449840840876913L;

	public InsectFrame(String title) {
		super(title);
		contentPanel.setLayout(new GridLayout(0, 1, 0, 0));
		JPanel panel = new JPanel();
		contentPanel.add(panel);
		SpringLayout slPanel = new SpringLayout();
		panel.setLayout(slPanel);
		btnSpider = new JButton("Spider");
		slPanel.putConstraint(SpringLayout.NORTH, btnSpider, 65, SpringLayout.NORTH, panel);
		slPanel.putConstraint(SpringLayout.WEST, btnSpider, 93, SpringLayout.WEST, panel);
		panel.add(btnSpider);
		btnCockroach = new JButton("Cockroach");
		slPanel.putConstraint(SpringLayout.NORTH, btnCockroach, 95, SpringLayout.NORTH, panel);
		slPanel.putConstraint(SpringLayout.WEST, btnCockroach, 93, SpringLayout.WEST, panel);
		panel.add(btnCockroach);
		btnButterfly = new JButton("Butterfly");
		slPanel.putConstraint(SpringLayout.NORTH, btnButterfly, 125, SpringLayout.NORTH, panel);
		slPanel.putConstraint(SpringLayout.WEST, btnButterfly, 93, SpringLayout.WEST, panel);
		panel.add(btnButterfly);
		setVisible(true);
	}

	public void setSpiderButtonActionListener(ActionListener a) {
		btnSpider.addActionListener(a);
	}

	public void setCockroachButtonActionListener(ActionListener a) {
		btnCockroach.addActionListener(a);
	}

	public void setButterflyButtonActionListener(ActionListener a) {
		btnButterfly.addActionListener(a);
	}

}
