/**
 * The Dime class represents a dime coin currency type. It extends the Currency class.
 *
 * @see Currency
 */
public class Dime extends Currency {
  /**
   * Constructor
   *
   * Constructs a Dime object with a given count.
   *
   * @param count   The number of monies being held in this currency object. Example:
   *                <code>2</code>
   * @see           Currency#Currency(String, double, int)
   */
  public Dime(int count) {
    super("Dime", 0.10, count);
  }

  /**
   * Constructor
   *
   * Constructs a Dime object with a default count of 1.
   *
   * @see Currency#Currency(String, double)
   */
  public Dime() {
    super("Dime", 0.10);
  }

  /**
   * Print the value of the dime object.
   *
   * @return  A string describing the value stored in this dime object.
   */
  @Override
  public String printValue() {
    return String.format("%d %s", this.getCount(), this.getName());
  }
}
