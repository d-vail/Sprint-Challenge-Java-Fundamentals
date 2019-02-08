import java.util.ArrayList;

/**
 * The PiggyBank class represents a piggy bank object capable of holding multiple types of currency.
 */
public class PiggyBank {
  /**
   * The collection of currencies held in this piggy bank object.
   */
  private ArrayList<Currency> bank;

  /**
   * The monetary value of this piggy bank object.
   */
  private double value;

  /**
   * Constructor
   *
   * Constructs an empty piggy bank with a monetary value of 0.
   */
  public PiggyBank() {
    this.bank = new ArrayList<>();
    this.value = 0.00;
  }

  /**
   * Adds a currency object to the bank collection and increments the monetary value by the
   * amount of currency added.
   *
   * @param currency  A currency type object.
   */
  public void add(Currency currency) {
    bank.add(currency);
    value += (currency.getDenomination() * currency.getCount());
  }

  /**
   * Prints the contents of the piggy bank object.
   */
  public void printBankroll() {
    bank.forEach(c -> System.out.println(c.printValue()));
  }

  /**
   * Prints the monetary value of the piggy bank object.
   */
  public void printValue() {
    System.out.println(String.format("The piggy bank holds $%.2f", value));
  }
}
