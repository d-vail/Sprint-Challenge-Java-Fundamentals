/**
 * The Penny class represents a penny coin currency type. It extends the Currency class.
 *
 * @see Currency
 */
public class Penny extends Currency {
  /**
   * Constructor
   *
   * Constructs a Penny object with a given count.
   *
   * @param count   The number of monies being held in this currency object. Example:
   *                <code>2</code>
   * @see           Currency#Currency(String, double, int)
   */
  public Penny(int count) {
    super("Penny", 0.01, count);
  }

  /**
   * Constructor
   *
   * Constructs a Penny object with a default count of 1.
   *
   * @see Currency#Currency(String, double)
   */
  public Penny() {
    super("Penny", 0.01);
  }

  /**
   * Print the value of the penny object.
   *
   * @return  A string describing the value stored in this penny object.
   */
  @Override
  public String printValue() {
    return String.format("%d %s", this.getCount(), this.getName());
  }
}
