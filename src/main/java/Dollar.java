/**
 * The Dollar class represents a one dollar bill currency type. It extends the Currency class.
 *
 * @see Currency
 */
public class Dollar extends Currency {
  /**
   * Constructor
   *
   * Constructs a dollar object with a given count.
   *
   * @param count   The number of monies being held in this currency object. Example:
   *                <code>2</code>
   * @see           Currency#Currency(String, double, int)
   */
  public Dollar(int count) {
    super("Dollar", 1, count);
  }

  /**
   * Constructor
   *
   * Constructs a dollar object with a default count of 1.
   *
   * @see           Currency#Currency(String, double)
   */
  public Dollar() {
    super("Dollar", 1);
  }

  /**
   * Print the value of the dollar object.
   * @return  A string describing the value stored in this dollar object.
   */
  @Override
  public String printValue() {
    return String.format("$%d.00", this.getCount());
  }
}
