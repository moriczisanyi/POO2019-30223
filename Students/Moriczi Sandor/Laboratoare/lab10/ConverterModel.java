package convert54;

import java.math.BigInteger;

public class ConverterModel {
	// ... Constants
	static final String INITIAL_VALUE = "1";

	// ... Member variable defining state of calculator.
	private Double m_total; // The total current value state.

	/** Constructor */
	ConverterModel() {
		reset();
	}

	/** Reset to initial value. */
	public void reset() {
		m_total = new Double(INITIAL_VALUE);
	}

	/**
	 * Multiply current total by a number.
	 * 
	 * @param operand Number (as string) to multiply total by.
	 */
	public void convert(String input, String list1, String list2) {
		m_total=m_total.parseDouble(input);
		if (list1.contentEquals("RON")) {
			if (list2.contentEquals("EUR")) {
				m_total = m_total * 0.2093;
			} else if (list2.contentEquals("USD")) {
				m_total = m_total * 0.2335;
			} else
				m_total = m_total;

		} else if (list1.contentEquals("EUR")) {
			if (list2.contentEquals("RON")) {
				m_total = m_total * 4.7769;
			} else if (list2.contentEquals("USD")) {
				m_total = m_total * 1.1153;
			} else
				m_total = m_total;

		} else if (list1.contentEquals("USD")) {
			if (list2.contentEquals("RON")) {
				m_total = m_total * 4.2831;
			} else if (list2.contentEquals("EUR")) {
				m_total = m_total * 0.8966;
			} else
				m_total = m_total;

		}
		m_total = Double.parseDouble(String.format("%.5f", m_total));
	}

	/**
	 * Set the total value.
	 * 
	 * @param value New value that should be used for the calculator total.
	 */
	public void setValue(String value) {
		m_total = new Double(value);
	}

	/** Return current calculator total. */
	public String getValue() {
		return m_total.toString();
	}
}
