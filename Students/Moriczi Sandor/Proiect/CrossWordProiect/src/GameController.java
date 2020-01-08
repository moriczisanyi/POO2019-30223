import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;
import javax.swing.text.BadLocationException;

// TODO: Auto-generated Javadoc
/**
 * The Class GameController.
 */
public class GameController {
	
	/** The frame. */
	public GameFrame frame;
	/**
	 * Instantiates a new game controller.
	 *
	 * @param frame the frame
	 */
	public GameController(GameFrame frame)
	{
		this.frame=frame;
		frame.setCheckButtonActionListener(new CheckButtonActionListener());
		frame.setHint1ButtonActionListener( new Hint1ButtonActionListener());
		frame.setHint2ButtonActionListener( new Hint2ButtonActionListener());
		frame.setHint3ButtonActionListener( new Hint3ButtonActionListener());
		frame.setHint4ButtonActionListener( new Hint4ButtonActionListener());
		frame.setHint5ButtonActionListener( new Hint5ButtonActionListener());
		frame.setHint6ButtonActionListener( new Hint6ButtonActionListener());
		frame.setHint7ButtonActionListener( new Hint7ButtonActionListener());
		frame.setHint8ButtonActionListener( new Hint8ButtonActionListener());
		frame.setHint9ButtonActionListener( new Hint9ButtonActionListener());
		frame.setHint10ButtonActionListener( new Hint10ButtonActionListener());
		frame.setHint11ButtonActionListener( new Hint11ButtonActionListener());
		frame.setHint12ButtonActionListener( new Hint12ButtonActionListener());
		frame.setSecret(new Secret());
		
	}
	
	/**
	 * The listener interface for receiving checkButtonAction events.
	 * The class that is interested in processing a checkButtonAction
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addCheckButtonActionListener<code> method. When
	 * the checkButtonAction event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see CheckButtonActionEvent
	 */
	private class CheckButtonActionListener implements ActionListener {
		
		/**
		 * Action performed.
		 *
		 * @param e the e
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
			try {			
					frame.set8thStringDownAfterCheck();
					frame.set8thStringAcrossAfterCheck();
					frame.set1stStringAfterCheck();
					frame.set2ndStringAfterCheck();
					frame.set3rdStringAfterCheck();
					frame.set4thStringAcrossAfterCheck();
					frame.set4thStringDownAfterCheck();
					frame.set5thStringAfterCheck();
					frame.set6thStringAfterCheck();
					frame.set7thStringAfterCheck();
					frame.set9thStringAfterCheck();
					frame.set10thStringAfterCheck();
					frame.set11thStringAfterCheck();
					frame.set12thStringAfterCheck();
					if(frame.setWin()==true)
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
private class AddEnter implements KeyListener {

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==e.VK_ENTER)
		System.out.println("egy");
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
		
		
	}
	
	/**
	 * The Class Secret.
	 */
	private class Secret implements MouseListener {
		
		/**
		 * Mouse clicked.
		 *
		 * @param e the e
		 */
		public void mouseClicked(MouseEvent e) {
			JOptionPane.showMessageDialog(null, "Hint1: 'HAMMERHEAD' | Hint2: 'MAKO' | Hint3: 'TIGER' |"
					+ " Hint4A: 'GOBLIN' |  Hint4D: GREATWHITE  | Hint5: 'BULL' | Hint6: 'TEETH' | Hint7: 'THRESHER' |"
					+ " Hint8D: 'PUP' | Hint8A: 'PLANKTON' | Hint9: 'SMELL' | Hint10: 'WHALE' |"
					+ " Hint11: 'THREE' | Hint12: 'COOKIECUTTER'");
			
		}

		/**
		 * Mouse pressed.
		 *
		 * @param e the e
		 */
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		/**
		 * Mouse released.
		 *
		 * @param e the e
		 */
		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		/**
		 * Mouse entered.
		 *
		 * @param e the e
		 */
		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		/**
		 * Mouse exited.
		 *
		 * @param e the e
		 */
		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	
	/**
	 * The listener interface for receiving hint1ButtonAction events.
	 * The class that is interested in processing a hint1ButtonAction
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addHint1ButtonActionListener<code> method. When
	 * the hint1ButtonAction event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see Hint1ButtonActionEvent
	 */
	private class Hint1ButtonActionListener implements ActionListener {
		
		/**
		 * Action performed.
		 *
		 * @param e the e
		 */
		@Override
		public void actionPerformed(ActionEvent e) {						
				JOptionPane.showMessageDialog(null, "This shark has eyes and nostrils as far as a yard apart to help it sniff out lunch");							
			}
	}
	
	/**
	 * The listener interface for receiving hint2ButtonAction events.
	 * The class that is interested in processing a hint2ButtonAction
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addHint2ButtonActionListener<code> method. When
	 * the hint2ButtonAction event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see Hint2ButtonActionEvent
	 */
	private class Hint2ButtonActionListener implements ActionListener {
		
		/**
		 * Action performed.
		 *
		 * @param e the e
		 */
		@Override
		public void actionPerformed(ActionEvent e) {						
				JOptionPane.showMessageDialog(null, "This shark is the fastest swimmer at about 43 miles per hour");							
			}
	}
	
	/**
	 * The listener interface for receiving hint3ButtonAction events.
	 * The class that is interested in processing a hint3ButtonAction
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addHint3ButtonActionListener<code> method. When
	 * the hint3ButtonAction event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see Hint3ButtonActionEvent
	 */
	private class Hint3ButtonActionListener implements ActionListener {
		
		/**
		 * Action performed.
		 *
		 * @param e the e
		 */
		@Override
		public void actionPerformed(ActionEvent e) {						
				JOptionPane.showMessageDialog(null, "This shark eats almost anything!");							
			}
	}
	
	/**
	 * The listener interface for receiving hint4ButtonAction events.
	 * The class that is interested in processing a hint4ButtonAction
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addHint4ButtonActionListener<code> method. When
	 * the hint4ButtonAction event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see Hint4ButtonActionEvent
	 */
	private class Hint4ButtonActionListener implements ActionListener {
		
		/**
		 * Action performed.
		 *
		 * @param e the e
		 */
		@Override
		public void actionPerformed(ActionEvent e) {						
				JOptionPane.showMessageDialog(null, "[Down] This shark has attacked people more times than any other  |  [Across] These sharks live in very deep water");							
			}
	}
	
	/**
	 * The listener interface for receiving hint5ButtonAction events.
	 * The class that is interested in processing a hint5ButtonAction
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addHint5ButtonActionListener<code> method. When
	 * the hint5ButtonAction event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see Hint5ButtonActionEvent
	 */
	private class Hint5ButtonActionListener implements ActionListener {
		
		/**
		 * Action performed.
		 *
		 * @param e the e
		 */
		@Override
		public void actionPerformed(ActionEvent e) {						
				JOptionPane.showMessageDialog(null, "This shark can swim in fresh water and salt water");							
			}
	}
	
	/**
	 * The listener interface for receiving hint6ButtonAction events.
	 * The class that is interested in processing a hint6ButtonAction
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addHint6ButtonActionListener<code> method. When
	 * the hint6ButtonAction event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see Hint6ButtonActionEvent
	 */
	private class Hint6ButtonActionListener implements ActionListener {
		
		/**
		 * Action performed.
		 *
		 * @param e the e
		 */
		@Override
		public void actionPerformed(ActionEvent e) {						
				JOptionPane.showMessageDialog(null, "Most common shark fossils");
				
			}
	}
	
	/**
	 * The listener interface for receiving hint7ButtonAction events.
	 * The class that is interested in processing a hint7ButtonAction
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addHint7ButtonActionListener<code> method. When
	 * the hint7ButtonAction event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see Hint7ButtonActionEvent
	 */
	private class Hint7ButtonActionListener implements ActionListener {
		
		/**
		 * Action performed.
		 *
		 * @param e the e
		 */
		@Override
		public void actionPerformed(ActionEvent e) {						
				JOptionPane.showMessageDialog(null, "This shark has a ten foot tail it uses to round up fish");							
			}
	}
	
	/**
	 * The listener interface for receiving hint8ButtonAction events.
	 * The class that is interested in processing a hint8ButtonAction
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addHint8ButtonActionListener<code> method. When
	 * the hint8ButtonAction event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see Hint8ButtonActionEvent
	 */
	private class Hint8ButtonActionListener implements ActionListener {
		
		/**
		 * Action performed.
		 *
		 * @param e the e
		 */
		@Override
		public void actionPerformed(ActionEvent e) {						
			JOptionPane.showMessageDialog(null, "[Down] a baby shark is called a _____ |"
					+ " [Across] Tiny food for big sharks");						
			}
	}
	
	/**
	 * The listener interface for receiving hint9ButtonAction events.
	 * The class that is interested in processing a hint9ButtonAction
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addHint9ButtonActionListener<code> method. When
	 * the hint9ButtonAction event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see Hint9ButtonActionEvent
	 */
	private class Hint9ButtonActionListener implements ActionListener {
		
		/**
		 * Action performed.
		 *
		 * @param e the e
		 */
		@Override
		public void actionPerformed(ActionEvent e) {						
				JOptionPane.showMessageDialog(null, "Two thirds of the sharks brain is dedicated to this sense");							
			}
	}
	
	/**
	 * The listener interface for receiving hint10ButtonAction events.
	 * The class that is interested in processing a hint10ButtonAction
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addHint10ButtonActionListener<code> method. When
	 * the hint10ButtonAction event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see Hint10ButtonActionEvent
	 */
	private class Hint10ButtonActionListener implements ActionListener {
		
		/**
		 * Action performed.
		 *
		 * @param e the e
		 */
		@Override
		public void actionPerformed(ActionEvent e) {						
				JOptionPane.showMessageDialog(null, "The biggest shark in the world is also the biggest fish");							
			}
	}
	
	/**
	 * The listener interface for receiving hint11ButtonAction events.
	 * The class that is interested in processing a hint11ButtonAction
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addHint11ButtonActionListener<code> method. When
	 * the hint11ButtonAction event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see Hint11ButtonActionEvent
	 */
	private class Hint11ButtonActionListener implements ActionListener {
		
		/**
		 * Action performed.
		 *
		 * @param e the e
		 */
		@Override
		public void actionPerformed(ActionEvent e) {						
				JOptionPane.showMessageDialog(null, "Number of eyelids some sharks have");							
			}
	}
	
	/**
	 * The listener interface for receiving hint12ButtonAction events.
	 * The class that is interested in processing a hint12ButtonAction
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addHint12ButtonActionListener<code> method. When
	 * the hint12ButtonAction event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see Hint12ButtonActionEvent
	 */
	private class Hint12ButtonActionListener implements ActionListener {
		
		/**
		 * Action performed.
		 *
		 * @param e the e
		 */
		@Override
		public void actionPerformed(ActionEvent e) {						
				JOptionPane.showMessageDialog(null, "This shark chops round holes from its victims bodies");							
			}
	}
	
} 