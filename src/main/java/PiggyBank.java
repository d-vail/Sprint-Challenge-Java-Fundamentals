import java.util.ArrayList;

public class PiggyBank {
  private ArrayList<Currency> bank;
  private double value;

  public PiggyBank() {
    this.bank = new ArrayList<>();
    this.value = 0.00;
  }

  public void add(Currency currency) {
    bank.add(currency);
    value += (currency.getValue() * currency.getCount());
  }

  public void printBankroll() {
    bank.forEach(c -> System.out.println(c.printValue()));
  }

  public void printValue() {
    System.out.println(String.format("The piggy bank holds $%.2f", value));
  }
}
