package convert54;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import ex54.CalcModel;
import ex54.CalcView;

public class ConverterController {
	// ... The Controller needs to interact with both the Model and View.
	private ConverterModel m_model;
	private ConverView m_view;
	private String valut1;
	private String valut2;

	ConverterController(ConverterModel model, ConverView view) {
		m_model = model;
		m_view = view;
		view.addClickListenerlist1(new Click1());
		view.addClickListenerlist2(new Click2());
		view.addConvertListener(new ConvertListener());
		//view.addMultiplyListener(new MultiplyListener());
		//view.addClearListener(new ClearListener());
	}

	class Click1 implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			try {
				//m_view.setTotal(m_view.addtext1());
				valut1=m_view.addtext1();

			} catch (Exception nfex) {
				m_view.showError("Bad input");
				//nfex.getMessage();
			}
			
		}

		public void mousePressed(MouseEvent e) {
			
		}

		public void mouseReleased(MouseEvent e) {
			
		}
		public void mouseEntered(MouseEvent e) {
			
		}
		public void mouseExited(MouseEvent e) {
			
		}
	}
	class Click2 implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			try {
				//m_view.setTotal(m_view.addtext2());
				valut2=m_view.addtext2();

			} catch (Exception nfex) {
				m_view.showError("Bad input");
			}
			
		}

		public void mousePressed(MouseEvent e) {
			
		}

		public void mouseReleased(MouseEvent e) {
			
		}
		public void mouseEntered(MouseEvent e) {
			
		}
		public void mouseExited(MouseEvent e) {
			
		}
	}

	class ConvertListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String userInput = "";
			try {
				userInput = m_view.getUserInput();
				m_model.convert(userInput,valut1,valut2);
				m_view.setTotal(m_model.getValue());

			} catch (NumberFormatException nfex) {
				m_view.showError("Bad input: '" + userInput + "'");
			}
		}
	}
}
