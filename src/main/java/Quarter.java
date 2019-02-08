/**
 * The Quarter class represents a quarter coin currency type. It extends the Currency class.
 *
 * @see Currency
 */
public class Quarter extends Currency {
  /**
   * Constructor
   *
   * Constructs a Quarter object with a given count.
   *
   * @param count   The number of monies being held in this currency object. Example:
   *                <code>2</code>
   * @see           Currency#Currency(String, double, int)
   */
  public Quarter(int count) {
    super("Quarter", 0.25, count);
  }

  /**
   * Constructor
   *
   * Constructs a Quarter object with a default count of 1.
   *
   * @see           Currency#Currency(String, double)
   */
  public Quarter() {
    super("Quarter", 0.25);
  }

  /**
   * Print the value of the quarter object.
   * @return  A string describing the value stored in this quarter object.
   */
  @Override
  public String printValue() {
    return String.format("%d %s", this.getCount(), this.getName());
  }
}