import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.text.BadLocationException;

// TODO: Auto-generated Javadoc
/**
 * The Class GameFrame.
 */
public class GameFrame extends JFrame implements KeyListener {

	/** The Constant GAP. */
	private static final int GAP = 1;
	
	/** The Constant LABEL_FONT. */
	private static final Font LABEL_FONT = new Font(Font.DIALOG, Font.PLAIN, 24);
	
	/** The grid. */
	private JTextField[][] grid = new JTextField[13][15];
	
	/** The btn check. */
	private JButton btnCheck;
	
	/** The btn hint 1. */
	private JButton btnHint1;
	
	/** The btn hint 2. */
	private JButton btnHint2;
	
	/** The btn hint 3. */
	private JButton btnHint3;
	
	/** The btn hint 4. */
	private JButton btnHint4;
	
	/** The btn hint 5. */
	private JButton btnHint5;
	
	/** The btn hint 6. */
	private JButton btnHint6;
	
	/** The btn hint 7. */
	private JButton btnHint7;
	
	/** The btn hint 8. */
	private JButton btnHint8;
	
	/** The btn hint 9. */
	private JButton btnHint9;
	
	/** The btn hint 10. */
	private JButton btnHint10;
	
	/** The btn hint 11. */
	private JButton btnHint11;
	
	/** The btn hint 12. */
	private JButton btnHint12;

	/**
	 * Instantiates a new game frame.
	 *
	 * @throws FileNotFoundException the file not found exception
	 */
	public GameFrame() throws FileNotFoundException {
		setTitle("CrossWord");
		addKeyListener(this);
		setFocusable(true);
		JPanel infoPanel = new JPanel();
		infoPanel.setLayout(new GridLayout(13,0));
		infoPanel.setSize(100, 100);
		infoPanel.setBackground(Color.white);
		btnCheck = new JButton("Check");
		btnHint1= new JButton("Hint 1 [Across]");
		btnHint2= new JButton("Hint 2 [Down]");
		btnHint3= new JButton("Hint 3 [Down]");
		btnHint4= new JButton("Hint 4 [Both]");
		btnHint5= new JButton("Hint 5 [Down]");
		btnHint6= new JButton("Hint 6 [Across]");
		btnHint6.setForeground(Color.white);
		btnHint7= new JButton("Hint 7 [Down]");
		btnHint8= new JButton("Hint 8 [Both]");
		btnHint9= new JButton("Hint 9 [Across]");
		btnHint9.setForeground(Color.white);
		btnHint10= new JButton("Hint 10 [Across]");
		btnHint11= new JButton("Hint 11 [Across]");
		btnHint12= new JButton("Hint 12 [Across]");
		btnHint12.setForeground(Color.white);
		btnHint1.setBackground(Color.decode("#FF4000"));		
		btnHint2.setBackground(Color.decode("#E1F5A9"));		
		btnHint3.setBackground(Color.decode("#3ADF00"));		
		btnHint4.setBackground(Color.decode("#D358F7"));		
		btnHint5.setBackground(Color.decode("#7401DF"));		
		btnHint6.setBackground(Color.decode("#4B088A"));
		btnHint7.setBackground(Color.decode("#FE2EC8"));		
		btnHint8.setBackground(Color.decode("#B40486"));		
		btnHint9.setBackground(Color.decode("#610B38"));		
		btnHint10.setBackground(Color.decode("#FE2E64"));		
		btnHint11.setBackground(Color.decode("#DF013A"));		
		btnHint12.setBackground(Color.decode("#8A0829"));
		infoPanel.add(btnCheck);
		infoPanel.add(btnHint1);
		infoPanel.add(btnHint2);
		infoPanel.add(btnHint3);
		infoPanel.add(btnHint4);
		infoPanel.add(btnHint5);
		infoPanel.add(btnHint6);
		infoPanel.add(btnHint7);
		infoPanel.add(btnHint8);
		infoPanel.add(btnHint9);
		infoPanel.add(btnHint10);
		infoPanel.add(btnHint11);
		infoPanel.add(btnHint11);
		infoPanel.add(btnHint12);
		JPanel crossWordPanel = new JPanel(new GridLayout(13, 15, GAP, GAP));
		crossWordPanel.setBorder(BorderFactory.createEmptyBorder(GAP, GAP, GAP, GAP));
		crossWordPanel.setBackground(Color.BLACK);
		File text = new File("F:\\POO\\ProiectPOO\\src\\table.txt");
		Scanner scan = new Scanner(text);
		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid[row].length; col++) {
				int i = scan.nextInt();
				if (i == 0) {
					grid[row][col] = new JTextField();
					grid[row][col].setHorizontalAlignment(JTextField.CENTER);
					grid[row][col].setFont(LABEL_FONT); 
					grid[row][col].setBackground(Color.WHITE);
					grid[row][col].setDocument(new LimitText(1));
					grid[row][col].addKeyListener(new KeyAdapter() {
						public void keyTyped(KeyEvent e) {
							char keyChar = e.getKeyChar();
							if (Character.isLowerCase(keyChar)) {
								e.setKeyChar(Character.toUpperCase(keyChar));
							}
							if (!(Character.isLetter(e.getKeyChar()))) {
								e.consume();
							}

						}
					});
					crossWordPanel.add(grid[row][col]);
				}
				if (i == 1) {
					grid[row][col] = new JTextField("     ", SwingConstants.CENTER);
					grid[row][col].setFont(LABEL_FONT); 
					grid[row][col].setBackground(Color.BLACK);
					grid[row][col].setEditable(false);
					crossWordPanel.add(grid[row][col]);
				}
			}
		}
		JPanel bottomPanel = new JPanel();
		grid[0][3].setBackground(Color.decode("#FF4000"));
		grid[0][6].setBackground(Color.decode("#E1F5A9"));
		grid[2][9].setBackground(Color.decode("#3ADF00"));
		grid[3][5].setBackground(Color.decode("#D358F7"));
		grid[4][1].setBackground(Color.decode("#7401DF"));
		grid[5][3].setBackground(Color.decode("#4B088A"));
		grid[5][11].setBackground(Color.decode("#FE2EC8"));
		grid[7][0].setBackground(Color.decode("#B40486"));
		grid[8][9].setBackground(Color.decode("#610B38"));
		grid[9][4].setBackground(Color.decode("#FE2E64"));
		grid[10][10].setBackground(Color.decode("#DF013A"));
		grid[12][0].setBackground(Color.decode("#8A0829"));
		
		
		setLayout(new BorderLayout());
		add(infoPanel, BorderLayout.EAST);
		add(crossWordPanel, BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		add(crossWordPanel);
		pack();
		setLocationByPlatform(true);
		setVisible(true);
	}

	/**
	 * Gets the 1 st string.
	 *
	 * @return the 1 st string
	 * @throws BadLocationException the bad location exception
	 */
	public String get1stString() throws BadLocationException {
		String word = new String();
		String temp = new String();
		for (int i = 3; i < 13; i++) {
			temp=grid[0][i].getText().trim();
			if(temp.length()>1)
			temp=temp.substring(0,1);
			word=word.concat(temp);
		}
		return word;
	}
	
	/**
	 * Sets the 1 st string after check.
	 *
	 * @throws BadLocationException the bad location exception
	 */
	public void set1stStringAfterCheck() throws BadLocationException {
		if(check1stString()==true)
		for (int i = 3; i < 13; i++) {
			grid[0][i].setEditable(false);
			grid[0][i].setForeground(Color.RED);
		}
	}
	
	/**
	 * Gets the 2 nd string.
	 *
	 * @return the 2 nd string
	 * @throws BadLocationException the bad location exception
	 */
	public String get2ndString() throws BadLocationException {
		String word = new String();
		String temp = new String();
		for (int i = 0; i < 4; i++) {
			temp = grid[i][6].getText().trim();
			if (temp.length() > 1)
				temp = temp.substring(0, 1);
			word = word.concat(temp);
		}
		return word;
	}
	
	/**
	 * Sets the 2 nd string after check.
	 *
	 * @throws BadLocationException the bad location exception
	 */
	public void set2ndStringAfterCheck() throws BadLocationException {
		if(check2ndString()==true)
		for (int i = 0; i < 4; i++) {
			grid[i][6].setEditable(false);
			grid[i][6].setForeground(Color.red);
		}
	}
	
	/**
	 * Gets the 3 rd string.
	 *
	 * @return the 3 rd string
	 * @throws BadLocationException the bad location exception
	 */
	public String get3rdString() throws BadLocationException {
		String word = new String();
		String temp = new String();
		for (int i = 2; i < 7; i++)

		{
			temp = grid[i][9].getText().trim();
			if (temp.length() > 1)
				temp = temp.substring(0, 1);
			word = word.concat(temp);
		}
		return word;
	}
	
	/**
	 * Sets the 3 rd string after check.
	 *
	 * @throws BadLocationException the bad location exception
	 */
	public void set3rdStringAfterCheck() throws BadLocationException {
		if(check3rdString()==true)
		for (int i = 2; i < 7; i++) {
			grid[i][9].setEditable(false);
			grid[i][9].setForeground(Color.red);
		}
	}
	
	/**
	 * Gets the 4 th string.
	 *
	 * @return the 4 th string
	 * @throws BadLocationException the bad location exception
	 */
	public String get4thStringAcross() throws BadLocationException {
		String word = new String();
		String temp = new String();
		for (int i = 5; i < 11; i++)

		{
			temp = grid[3][i].getText().trim();
			if (temp.length() > 1)
				temp = temp.substring(0, 1);
			word = word.concat(temp);
		}
		return word;
	}
	public String get4thStringDown() throws BadLocationException {
		String word = new String();
		String temp = new String();
		for (int i = 3; i < 13; i++)

		{
			temp = grid[i][5].getText().trim();
			if (temp.length() > 1)
				temp = temp.substring(0, 1);
			word = word.concat(temp);
		}
		return word;
	}
	
	/**
	 * Sets the 4 th string after check.
	 *
	 * @throws BadLocationException the bad location exception
	 */
	public void set4thStringAcrossAfterCheck() throws BadLocationException {
		if(check4thStringAcross()==true)
		for (int i = 5; i < 11; i++) {
			grid[3][i].setEditable(false);
			grid[3][i].setForeground(Color.RED);
		}
	}
	public void set4thStringDownAfterCheck() throws BadLocationException {
		if(check4thStringDown()==true)
		for (int i = 3; i < 13; i++) {
			grid[i][5].setEditable(false);
			grid[i][5].setForeground(Color.RED);
		}
	}
	
	/**
	 * Gets the 5 th string.
	 *
	 * @return the 5 th string
	 * @throws BadLocationException the bad location exception
	 */
	public String get5thString() throws BadLocationException {
		String word = new String();
		String temp = new String();
		for (int i = 4; i < 8; i++)

		{
			temp = grid[i][1].getText().trim();
			if (temp.length() > 1)
				temp = temp.substring(0, 1);
			word = word.concat(temp);
		}
		return word;
	}
	
	/**
	 * Sets the 5 th string after check.
	 *
	 * @throws BadLocationException the bad location exception
	 */
	public void set5thStringAfterCheck() throws BadLocationException {
		if(check5thString()==true)
		for (int i = 4; i < 8; i++) {
			grid[i][1].setEditable(false);
			grid[i][1].setForeground(Color.red);
		}
	}
	
	/**
	 * Gets the 6 th string.
	 *
	 * @return the 6 th string
	 * @throws BadLocationException the bad location exception
	 */
	public String get6thString() throws BadLocationException {
		String word = new String();
		String temp = new String();
		for (int i = 3; i < 8; i++)

		{
			temp = grid[5][i].getText().trim();
			if (temp.length() > 1)
				temp = temp.substring(0, 1);
			word = word.concat(temp);
		}
		return word;
	}
	
	/**
	 * Sets the 6 th string after check.
	 *
	 * @throws BadLocationException the bad location exception
	 */
	public void set6thStringAfterCheck() throws BadLocationException {
		if(check6thString()==true)
		for (int i = 3; i < 8; i++) {
			grid[5][i].setEditable(false);
			grid[5][i].setForeground(Color.red);
		}
	}
	
	/**
	 * Gets the 7 th string.
	 *
	 * @return the 7 th string
	 * @throws BadLocationException the bad location exception
	 */
	public String get7thString() throws BadLocationException {
		String word = new String();
		String temp = new String();
		for (int i = 5; i < 13; i++)

		{
			temp = grid[i][11].getText().trim();
			if (temp.length() > 1)
				temp = temp.substring(0, 1);
			word = word.concat(temp);
		}
		return word;
	}
	
	/**
	 * Sets the 7 th string after check.
	 *
	 * @throws BadLocationException the bad location exception
	 */
	public void set7thStringAfterCheck() throws BadLocationException {
		if(check7thString()==true)
		for (int i = 5; i < 13; i++) {
			grid[i][11].setEditable(false);
			grid[i][11].setForeground(Color.red);
		}
	}
	
	/**
	 * Gets the 8 th string down.
	 *
	 * @return the 8 th string down
	 * @throws BadLocationException the bad location exception
	 */
	public String get8thStringDown() throws BadLocationException {
		String word = new String();
		String temp = new String();
		for (int i = 7; i < 11; i++)

		{
			temp = grid[i][0].getText().trim();
			if (temp.length() > 1)
				temp = temp.substring(0, 1);
			word = word.concat(temp);
		}
		return word;
	}
	
	/**
	 * Sets the 8 th string down after check.
	 *
	 * @throws BadLocationException the bad location exception
	 */
	public void set8thStringDownAfterCheck() throws BadLocationException {
		if(check8thStringDown()==true)
		for (int i = 7; i < 10; i++) {
			grid[i][0].setEditable(false);
			grid[i][0].setForeground(Color.RED);
		}
	}
	
	/**
	 * Gets the 8 th string across.
	 *
	 * @return the 8 th string across
	 * @throws BadLocationException the bad location exception
	 */
	public String get8thStringAcross() throws BadLocationException {
		String word = new String();
		String temp = new String();
		for (int i = 0; i < 8; i++)

		{
			temp = grid[7][i].getText().trim();
			if (temp.length() > 1)
				temp = temp.substring(0, 1);
			word = word.concat(temp);
		}
		return word;
	}
	
	/**
	 * Sets the 8 th string across after check.
	 *
	 * @throws BadLocationException the bad location exception
	 */
	public void set8thStringAcrossAfterCheck() throws BadLocationException {
		if(check8thStringAcross()==true)
		for (int i = 0; i < 8; i++) {
			grid[7][i].setEditable(false);
			grid[7][i].setForeground(Color.red);
		}
	}
	
	/**
	 * Gets the 9 th string.
	 *
	 * @return the 9 th string
	 * @throws BadLocationException the bad location exception
	 */
	public String get9thString() throws BadLocationException {
		String word = new String();
		String temp = new String();
		for (int i = 9; i < 14; i++)

		{
			temp = grid[8][i].getText().trim();
			if (temp.length() > 1)
				temp = temp.substring(0, 1);
			word = word.concat(temp);
		}
		return word;
	}
	
	/**
	 * Sets the 9 th string after check.
	 *
	 * @throws BadLocationException the bad location exception
	 */
	public void set9thStringAfterCheck() throws BadLocationException {
		if(check9thString()==true)
		for (int i = 9; i < 14; i++) {
			grid[8][i].setEditable(false);
			grid[8][i].setForeground(Color.red);
		}
	}
	
	/**
	 * Gets the 10 th string.
	 *
	 * @return the 10 th string
	 * @throws BadLocationException the bad location exception
	 */
	public String get10thString() throws BadLocationException {
		String word = new String();
		String temp = new String();
		for (int i = 4; i < 9; i++)

		{
			temp = grid[9][i].getText().trim();
			if (temp.length() > 1)
				temp = temp.substring(0, 1);
			word = word.concat(temp);
		}
		return word;
	}
	
	/**
	 * Sets the 10 th string after check.
	 *
	 * @throws BadLocationException the bad location exception
	 */
	public void set10thStringAfterCheck() throws BadLocationException {
		if(check10thString()==true)
		for (int i = 4; i < 9; i++) {
			grid[9][i].setEditable(false);
			grid[9][i].setForeground(Color.red);
		}
	}
	
	/**
	 * Gets the 11 th string.
	 *
	 * @return the 11 th string
	 * @throws BadLocationException the bad location exception
	 */
	public String get11thString() throws BadLocationException {
		String word = new String();
		String temp = new String();
		for (int i = 10; i < 15; i++)

		{
			temp = grid[10][i].getText().trim();
			if (temp.length() > 1)
				temp = temp.substring(0, 1);
			word = word.concat(temp);
		}
		return word;
	}
	
	/**
	 * Sets the 11 th string after check.
	 *
	 * @throws BadLocationException the bad location exception
	 */
	public void set11thStringAfterCheck() throws BadLocationException {
		if(check11thString()==true)
		for (int i = 10; i < 15; i++) {
			grid[10][i].setEditable(false);
			grid[10][i].setForeground(Color.red);
		}
	}
	
	/**
	 * Gets the 12 th string.
	 *
	 * @return the 12 th string
	 * @throws BadLocationException the bad location exception
	 */
	public String get12thString() throws BadLocationException {
		String word = new String();
		String temp = new String();
		for (int i = 0; i < 12; i++)

		{
			temp = grid[12][i].getText().trim();
			if (temp.length() > 1)
				temp = temp.substring(0, 1);
			word = word.concat(temp);
		}
		return word;
	}
	
	/**
	 * Sets the 12 th string after check.
	 *
	 * @throws BadLocationException the bad location exception
	 */
	public void set12thStringAfterCheck() throws BadLocationException {
		if(check12thString()==true)
		for (int i = 0; i < 12; i++) {
			grid[12][i].setEditable(false);
			grid[12][i].setForeground(Color.red);
		}
	}
	
	/**
	 * Check 1 st string.
	 *
	 * @return true, if successful
	 * @throws BadLocationException the bad location exception
	 */
	public boolean check1stString() throws BadLocationException {
		String word = get1stString();
		if(word.contentEquals("HAMMERHEAD"))
			return true;
		else
			return false;
		
	}
	
	/**
	 * Check 2 nd string.
	 *
	 * @return true, if successful
	 * @throws BadLocationException the bad location exception
	 */
	public boolean check2ndString() throws BadLocationException {
		String word = get2ndString();
		if(word.contentEquals("MAKO"))
			return true;
		else
			return false;
		
	}
	
	/**
	 * Check 3 rd string.
	 *
	 * @return true, if successful
	 * @throws BadLocationException the bad location exception
	 */
	public boolean check3rdString() throws BadLocationException {
		String word = get3rdString();
		if(word.contentEquals("TIGER"))
			return true;
		else
			return false;
		
	}
	
	/**
	 * Check 4 th string.
	 *
	 * @return true, if successful
	 * @throws BadLocationException the bad location exception
	 */
	public boolean check4thStringDown() throws BadLocationException {
		String word = get4thStringDown();
		if(word.contentEquals("GREATWHITE"))
			return true;
		else
			return false;
		
	}
	public boolean check4thStringAcross() throws BadLocationException {
		String word = get4thStringAcross();
		if(word.contentEquals("GOBLIN"))
			return true;
		else
			return false;
		
	}
	
	/**
	 * Check 5 th string.
	 *
	 * @return true, if successful
	 * @throws BadLocationException the bad location exception
	 */
	public boolean check5thString() throws BadLocationException {
		String word = get5thString();
		if(word.contentEquals("BULL"))
			return true;
		else
			return false;
		
	}
	
	/**
	 * Check 6 th string.
	 *
	 * @return true, if successful
	 * @throws BadLocationException the bad location exception
	 */
	public boolean check6thString() throws BadLocationException {
		String word = get6thString();
		if(word.contentEquals("TEETH"))
			return true;
		else
			return false;
		
	}
	
	/**
	 * Check 7 th string.
	 *
	 * @return true, if successful
	 * @throws BadLocationException the bad location exception
	 */
	public boolean check7thString() throws BadLocationException {
		String word = get7thString();
		if(word.contentEquals("THRESHER"))
			return true;
		else
			return false;
		
	}
	
	/**
	 * Check 8 th string across.
	 *
	 * @return true, if successful
	 * @throws BadLocationException the bad location exception
	 */
	public boolean check8thStringAcross() throws BadLocationException {
		String word = get8thStringAcross();
		if(word.contentEquals("PLANKTON"))
			return true;
		else
			return false;
		
	}
	
	/**
	 * Check 8 th string down.
	 *
	 * @return true, if successful
	 * @throws BadLocationException the bad location exception
	 */
	public boolean check8thStringDown() throws BadLocationException {
		String word = get8thStringDown();
		if(word.contentEquals("PUP"))
			return true;
		else
			return false;
		
	}
	
	/**
	 * Check 9 th string.
	 *
	 * @return true, if successful
	 * @throws BadLocationException the bad location exception
	 */
	public boolean check9thString() throws BadLocationException {
		String word = get9thString();
		if(word.contentEquals("SMELL"))
			return true;
		else
			return false;
		
	}
	
	/**
	 * Check 10 th string.
	 *
	 * @return true, if successful
	 * @throws BadLocationException the bad location exception
	 */
	public boolean check10thString() throws BadLocationException {
		String word = get10thString();
		if(word.contentEquals("WHALE"))
			return true;
		else
			return false;
		
	}
	
	/**
	 * Check 11 th string.
	 *
	 * @return true, if successful
	 * @throws BadLocationException the bad location exception
	 */
	public boolean check11thString() throws BadLocationException {
		String word = get11thString();
		if(word.contentEquals("THREE"))
			return true;
		else
			return false;
		
	}
	
	/**
	 * Check 12 th string.
	 *
	 * @return true, if successful
	 * @throws BadLocationException the bad location exception
	 */
	public boolean check12thString() throws BadLocationException {
		String word = get12thString();
		if(word.contentEquals("COOKIECUTTER"))
			return true;
		else
			return false;
		
	}

	
	/**
	 * Sets the check button action listener.
	 *
	 * @param a the new check button action listener
	 */
	public void setCheckButtonActionListener(ActionListener a) {
		btnCheck.addActionListener(a);
	}
	
	/**
	 * Sets the hint 1 button action listener.
	 *
	 * @param a the new hint 1 button action listener
	 */
	public void setHint1ButtonActionListener(ActionListener a) {
		btnHint1.addActionListener(a);
	}
	
	/**
	 * Sets the hint 2 button action listener.
	 *
	 * @param a the new hint 2 button action listener
	 */
	public void setHint2ButtonActionListener(ActionListener a) {
		btnHint2.addActionListener(a);
	}
	
	/**
	 * Sets the hint 3 button action listener.
	 *
	 * @param a the new hint 3 button action listener
	 */
	public void setHint3ButtonActionListener(ActionListener a) {
		btnHint3.addActionListener(a);
	}
	
	/**
	 * Sets the hint 4 button action listener.
	 *
	 * @param a the new hint 4 button action listener
	 */
	public void setHint4ButtonActionListener(ActionListener a) {
		btnHint4.addActionListener(a);
	}
	
	/**
	 * Sets the hint 5 button action listener.
	 *
	 * @param a the new hint 5 button action listener
	 */
	public void setHint5ButtonActionListener(ActionListener a) {
		btnHint5.addActionListener(a);
	}
	
	/**
	 * Sets the hint 6 button action listener.
	 *
	 * @param a the new hint 6 button action listener
	 */
	public void setHint6ButtonActionListener(ActionListener a) {
		btnHint6.addActionListener(a);
	}
	
	/**
	 * Sets the hint 7 button action listener.
	 *
	 * @param a the new hint 7 button action listener
	 */
	public void setHint7ButtonActionListener(ActionListener a) {
		btnHint7.addActionListener(a);
	}
	
	/**
	 * Sets the hint 8 button action listener.
	 *
	 * @param a the new hint 8 button action listener
	 */
	public void setHint8ButtonActionListener(ActionListener a) {
		btnHint8.addActionListener(a);
	}
	
	/**
	 * Sets the hint 9 button action listener.
	 *
	 * @param a the new hint 9 button action listener
	 */
	public void setHint9ButtonActionListener(ActionListener a) {
		btnHint9.addActionListener(a);
	}
	
	/**
	 * Sets the hint 10 button action listener.
	 *
	 * @param a the new hint 10 button action listener
	 */
	public void setHint10ButtonActionListener(ActionListener a) {
		btnHint10.addActionListener(a);
	}
	
	/**
	 * Sets the hint 11 button action listener.
	 *
	 * @param a the new hint 11 button action listener
	 */
	public void setHint11ButtonActionListener(ActionListener a) {
		btnHint11.addActionListener(a);
	}
	
	/**
	 * Sets the hint 12 button action listener.
	 *
	 * @param a the new hint 12 button action listener
	 */
	public void setHint12ButtonActionListener(ActionListener a) {
		btnHint12.addActionListener(a);
	}
	
	/**
	 * Sets the secret.
	 *
	 * @param a the new secret
	 */
	public void setSecret(MouseListener a) {
		grid[0][0].addMouseListener(a);
	}
	public boolean setWin() throws BadLocationException
	{
		if(check1stString()== true && check2ndString()==true && check3rdString()==true &&
				check4thStringDown()==true && check4thStringAcross()==true && check5thString()==true && check6thString()==true && check7thString()==true &&
				check8thStringDown()==true && check8thStringAcross()==true && check9thString()==true
				&& check10thString()==true && check11thString()==true && check12thString()==true)
		{
			return true;
		}
		else
			return false;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_ENTER)
			{
			try {			
				set8thStringDownAfterCheck();
				set8thStringAcrossAfterCheck();
				set1stStringAfterCheck();
				set2ndStringAfterCheck();
				set3rdStringAfterCheck();
				set4thStringAcrossAfterCheck();
				set4thStringDownAfterCheck();
				set5thStringAfterCheck();
				set6thStringAfterCheck();
				set7thStringAfterCheck();
				set9thStringAfterCheck();
				set10thStringAfterCheck();
				set11thStringAfterCheck();
				set12thStringAfterCheck();
				if(setWin()==true)
				{
					JOptionPane.showMessageDialog(null, "You Won");
					System.exit(0);
				}
				
		} catch (BadLocationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
			}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}