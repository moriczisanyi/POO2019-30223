
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;

///////////////////////////////////////////////////// clasa DragBallPanel
/**
 * La apelul ascultatorului mousePressed se testeaza pozitia pentru a vedea daca
 * este in zona mingii. Daca este, (1) _canDrag este setat la true cu
 * semnificatia "atentie la evenimentele MouseDragged". (2) se înregistreaza
 * unde în minge (relative la coordonatele din stânga sus) a fost dat clic,
 * fiindca arata cel mai bine daca o târâm de acolo.
 */
public class DragBallPanel extends JPanel implements MouseListener, MouseMotionListener, ActionListener {
	private static final int BALL_DIAMETER = 40; // Diametrul mingii
	// --- variabile instanta
	/**
	 * Coordonatele mingii. Modificate de ascultatori. Folosite de paintComponent.
	 */
	private int _ballX = 50; // x coord – setata din târâre
	private int _ballY = 50; // y coord - setata din târâre

	/**
	 * Pozitia în minge a unei apasari pe mouse pentru a afce târârea sa arate mai
	 * bine
	 */
	private int _dragFromX = 0; // apasat atât in interiorul
	private int _dragFromY = 0; // dreptunghiului mingii.

	/** true inseamna ca mouse a fost apasat in minge si înca in panou. */
	private boolean _canDrag = false;
	private Timer t;
	Boolean wall=false;
	Random rand= new Random();

	// =============================================================
//constructor
	/**
	 * Constructorul seteaza marimea, culorile si adauga ascultatori de mouse.
	 */
	public DragBallPanel() {
		setPreferredSize(new Dimension(300, 300));
		setBackground(Color.blue);
		setForeground(Color.yellow);
		// --- Add the mouse listeners.
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		t = new Timer(100, this);
		t.start();
	}// endconstructor

	// ============================================= metoda paintComponent
	/**
	 * Mingea este desenata la ultimele coordinate înregistrate de ascultator
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g); // Required for background.
		g.fillOval(_ballX, _ballY, BALL_DIAMETER, BALL_DIAMETER);
		String s;
		Integer x = _ballX;
		s = x.toString();
		String s2;
		Integer y = _ballY;
		s2 = y.toString();
		s = s.concat(" ").concat(s2);

		g.drawString(s, 10, 10);
	}// end paintComponent
//============================================== method mousePressed

	/**
	 * Seteaza _canDrag daca clic este în minge (sau în dreptunghiul care o
	 * margineste, ceea ce este destul de bun pentru acest program). Pastrati
	 * deplasamentul (dragFromX si Y) in minge ca sa-l folositi ca punct relativ de
	 * afisare în timpul tâtârii.
	 */
	public void mousePressed(MouseEvent e) {
		int x = e.getX(); // Save the x coord of the click
		int y = e.getY(); // Save the y coord of the click

		if (x >= _ballX && x <= (_ballX + BALL_DIAMETER) && y >= _ballY && y <= (_ballY + BALL_DIAMETER)) {
			_canDrag = true;
			_dragFromX = x - _ballX; // how far from left
			_dragFromY = y - _ballY; // how far from top
		} else {
			_canDrag = false;
		}
	}// end mousePressed

//============================================ metoda mouseDragged
	/** Seteaza pozitia x,y a mouse si redeseneaza. */
	public void mouseDragged(MouseEvent e) {
		if (_canDrag) { // True doar la apasare in interiorul mingii.
//--- Pozitia mingii din mouse si deplasament click original
			_ballX = e.getX() - _dragFromX;
			_ballY = e.getY() - _dragFromY;

//--- Nu muta mingea in afara marginilor ecranului
			_ballX = Math.max(_ballX, 0);
			_ballX = Math.min(_ballX, getWidth() - BALL_DIAMETER);

//--- Nu muta mingea pest marginile de sus sau jos
			_ballY = Math.max(_ballY, 0);
			_ballY = Math.min(_ballY, getHeight() - BALL_DIAMETER);

			this.repaint(); // Redeseneaza – s-a schimbat pozitia
		}
	}// end mouseDragged
//================================================ metoda mouseExited

	/** Dezactiveaza târârea daca mouse iese din panou. */
	public void mouseExited(MouseEvent e) {
		_canDrag = false;
	}// end mouseExited
//===================================== Ignora alte evenimente mouse.

	public void mouseMoved(MouseEvent e) {
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseClicked(MouseEvent e) {
		Random rand = new Random();
		_ballX = rand.nextInt(250);
		_ballY = rand.nextInt(250);

//--- Nu muta mingea in afara marginilor ecranului
		_ballX = Math.max(_ballX, 0);
		_ballX = Math.min(_ballX, getWidth() - BALL_DIAMETER);

//--- Nu muta mingea pest marginile de sus sau jos
		_ballY = Math.max(_ballY, 0);
		_ballY = Math.min(_ballY, getHeight() - BALL_DIAMETER);

		this.repaint(); // Redeseneaza – s-a schimbat pozitia
	}

	public int get_ballX() {
		return _ballX;
	}

	public void set_ballX(int _ballX) {
		this._ballX = _ballX;
	}

	public int get_ballY() {
		return _ballY;
	}

	public void set_ballY(int _ballY) {
		this._ballY = _ballY;
	}

	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (wall==false) {
			this._ballX = this._ballX + rand.nextInt(5);
			this._ballY = this._ballY + rand.nextInt(5);
			if(_ballX>Math.min(_ballX, getWidth() - BALL_DIAMETER) || _ballY>Math.min(_ballY, getHeight() - BALL_DIAMETER))
			{
				_ballX=Math.min(_ballX, getWidth() - BALL_DIAMETER);
				_ballY=Math.min(_ballY, getHeight() - BALL_DIAMETER);
				wall=true;
			}
		}
		else
		{
			this._ballX = this._ballX - rand.nextInt(5);
			this._ballY = this._ballY - rand.nextInt(5);
			if(_ballX<0 || _ballY<0)
			{
				_ballX=0;
				_ballY=0;
				wall=false;
			}
		}
		this.repaint();

	}

}// endclass DragBallPanel
