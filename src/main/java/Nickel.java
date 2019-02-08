/**
 * The Nickel class represents a nickel coin currency type. It extends the Currency class.
 *
 * @see Currency
 */
public class Nickel extends Currency {
  /**
   * Constructor
   *
   * Constructs a Nickel object with a given count.
   *
   * @param count   The number of monies being held in this currency object. Example:
   *                <code>2</code>
   * @see           Currency#Currency(String, double, int)
   */
  public Nickel(int count) {
    super("Nickel", 0.05, count);
  }

  /**
   * Constructor
   *
   * Constructs a Nickel object with a default count of 1.
   *
   * @see           Currency#Currency(String, double)
   */
  public Nickel() {
    super("Nickel", 0.05);
  }

  /**
   * Print the value of the nickel object.
   * @return  A string describing the value stored in this nickel object.
   */
  @Override
  public String printValue() {
    return String.format("%d %s", this.getCount(), this.getName());
  }
}
