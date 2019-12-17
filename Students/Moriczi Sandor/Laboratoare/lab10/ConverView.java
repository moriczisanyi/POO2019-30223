package convert54;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import ex54.CalcModel;

public class ConverView extends JFrame{

	private static final long serialVersionUID = -5668516881479203394L;
	//... Components
	 private JTextField textSuma= new JTextField(5);
	 private JTextField textRezultat = new JTextField(20);
	 private JButton btnConvert = new JButton("Convert");
	 private JList list;
	 private JList list2;
	 private JPanel pan;
	 //private CalcModel m_model;

	 
	 ConverView () {
	 //... Set up the logic
		 JPanel pan2 = new JPanel();
		 JPanel middle= new JPanel();
		 setTitle("CONVERTER");
			setSize(500, 500);
			setLayout(new GridLayout(0,3));
			setLocationRelativeTo(null);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			pan = new JPanel();
			pan.setBorder(new EmptyBorder(5, 5, 5, 5));
			//pan.setBackground(Color.gray);
			//pan2.setBackground(Color.gray);
			
			add(pan);
			add(middle);
			add(pan2);
			
			middle.setLayout(new GridLayout(2,0));
			JPanel midpan1= new JPanel();
			JPanel midpan2= new JPanel();
			middle.add(midpan1);
			middle.add(midpan2);
			midpan2.add( new JLabel("Suma"));
			midpan2.add(textSuma);
			midpan2.add( new JLabel("Rezultat"));
			midpan2.add(textRezultat);
			textRezultat.setEditable(false);
			midpan1.add(btnConvert);
	  
     //String array to store weekdays 
     String week[]= { "RON","EUR","USD"}; 
       
     //create list 
     list= new JList(week);
     //list.setPreferredSize(new Dimension(100,100));
     DefaultListCellRenderer renderer =  (DefaultListCellRenderer)list.getCellRenderer();
     Border bord= BorderFactory.createLineBorder(Color.GRAY, 2);
     list.setBorder(bord);
     renderer.setHorizontalAlignment(JLabel.CENTER);
     list2= new JList(week);
     list2.setBorder(bord);
     pan.add(list);
     pan2.add(list2);
     this.pack();
     
     //textSuma.setText((String) list.getSelectedValue());
     

	 this.setTitle("Converter");
	 }

	 String addtext1() {
		return list.getSelectedValue().toString();
	 }
	 String addtext2() {
			return list2.getSelectedValue().toString();
		 }
	 void setTotal(String newTotal) {
		 textRezultat.setText(newTotal);
		 }
	 void addClickListenerlist1(MouseListener mal) {
		 list.addMouseListener(mal);
		 }
	 void addClickListenerlist2(MouseListener mal) {
		 list2.addMouseListener(mal);
		 }
	 String getUserInput() {
		 return textSuma.getText();
	 }
	/*
	 void setTotal(String newTotal) {
	 m_totalTf.setText(newTotal);
	 }*/

	 void showError(String errMessage) {
	 JOptionPane.showMessageDialog(this, errMessage);
	 }

	 void addConvertListener(ActionListener mal) {
	 btnConvert.addActionListener(mal);
	 }

	 /*void addClearListener(ActionListener cal) {
	 m_clearBtn.addActionListener(cal);
	 }*/
	
}
