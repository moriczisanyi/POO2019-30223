package javasmmr.zoowsome.views.species;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import javasmmr.zoowsome.views.ZooFrame;

public class MammalFrame extends ZooFrame{

	private JButton btnTiger;
	private JButton btnMonkey;
	private JButton btnCow;
	private static final long serialVersionUID = -807024358407155044L;
	public MammalFrame(String title) {
		super(title);
		contentPanel.setLayout(new GridLayout(0, 1, 0, 0));
		JPanel panel = new JPanel();
		contentPanel.add(panel);
		SpringLayout slPanel = new SpringLayout();
		panel.setLayout(slPanel);
		btnTiger= new JButton("Tiger");
		slPanel.putConstraint(SpringLayout.NORTH, btnTiger, 65, SpringLayout.NORTH, panel);
		slPanel.putConstraint(SpringLayout.WEST, btnTiger, 93, SpringLayout.WEST, panel);
		panel.add(btnTiger);
		btnMonkey= new JButton("Monkey");
		slPanel.putConstraint(SpringLayout.NORTH, btnMonkey, 95, SpringLayout.NORTH, panel);
		slPanel.putConstraint(SpringLayout.WEST, btnMonkey, 93, SpringLayout.WEST, panel);
		panel.add(btnMonkey);
		btnCow= new JButton("Cow");
		slPanel.putConstraint(SpringLayout.NORTH, btnCow, 125, SpringLayout.NORTH, panel);
		slPanel.putConstraint(SpringLayout.WEST, btnCow, 93, SpringLayout.WEST, panel);
		panel.add(btnCow);
		setVisible(true);
	}
	public void setTigerButtonActionListener(ActionListener a) {
		btnTiger.addActionListener(a);
	}
	public void setMonkeyButtonActionListener(ActionListener a) {
		btnMonkey.addActionListener(a);
	}
	public void setCowButtonActionListener(ActionListener a) {
		btnCow.addActionListener(a);
	}

	/**
	 * 
	 */
	

}
