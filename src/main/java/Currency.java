/**
 * Currency is an abstract base class for currency types (coins, bills, etc.)
 */
public abstract class Currency {
  /**
   * The description of the currency amount. Example:
   * <code>"Quarter"</code>
   */
  private double denomination;

  /**
   * The name for the currency amount. Example:
   * <code>0.25</code>
   */
  private String name;

  /**
   * The number of monies in this currency object. Example:
   * <code>2</code>
   */
  private int count;

  /**
   * Constructor
   *
   * Constructs the specified currency object with a given count.
   *
   * @param name          The name for the currency amount. Example:
   *                      <code>"Quarter"</code>
   * @param denomination  The description of the currency amount. Example:
   *                      <code>0.25</code>
   * @param count         The number of monies being held in this currency object. Example:
   *                      <code>2</code>
   */
  public Currency(String name, double denomination, int count) {
    this.name = name;
    this.denomination = denomination;
    this.count = count;
  }

  /**
   * Constructor
   *
   * Constructs the specified currency object with a default count of 1.
   *
   * @param name          The name for the currency amount. Example:
   *                      <code>"Quarter"</code>
   * @param denomination  The description of the currency amount. Example:
   *                      <code>0.25</code>
   */
  public Currency(String name, double denomination) {
    this.name = name;
    this.denomination = denomination;
    count = 1;
  }

  /**
   * Getter for the denomination.
   * @return  The denomination set by the constructor.
   * @link    Currency#denomination
   */
  public double getDenomination() {
    return denomination;
  }

  /**
   * Getter for the name.
   * @return  The name set by the constructor.
   * @link    Currency#name
   */
  public String getName() {
    return name;
  }

  /**
   * Getter for the count.
   * @return  The count set by the constructor.
   * @link    Currency#count
   */
  public int getCount() {
    return count;
  }

  /**
   * Print the value of the currency object.
   * @return  A string describing the value of the currency object.
   */
  public abstract String printValue();
}
