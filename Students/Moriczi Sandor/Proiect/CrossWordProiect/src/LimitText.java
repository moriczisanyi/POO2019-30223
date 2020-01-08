import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

// TODO: Auto-generated Javadoc
/**
 * The Class LimitText.
 */
public class LimitText extends PlainDocument {
  
  /** The limit. */
  private int limit;
  
  /**
   * Instantiates a new limit text.
   *
   * @param limit the limit
   */
  public LimitText(int limit) {
    super();
    this.limit = limit;
  }

  /**
   * Instantiates a new limit text.
   *
   * @param limit the limit
   * @param upper the upper
   */
  LimitText(int limit, boolean upper) {
    super();
    this.limit = limit;
  }

  /**
   * Insert string.
   *
   * @param offset the offset
   * @param str the str
   * @param attr the attr
   * @throws BadLocationException the bad location exception
   */
  public void insertString(int offset, String str, javax.swing.text.AttributeSet attr) throws BadLocationException {
    if (str == null)
      return;

    if ((getLength() + str.length()) <= limit) {
      super.insertString(offset, str, attr);
    }
  }
}