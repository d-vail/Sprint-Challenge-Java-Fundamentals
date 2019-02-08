public abstract class Currency {
  private double denomination;
  private String name;
  private int count;

  public Currency(String name, double denomination, int count) {
    this.name = name;
    this.denomination = denomination;
    this.count = count;
  }

  public Currency(String name, double denomination) {
    this.name = name;
    this.denomination = denomination;
    count = 1;
  }

  public double getDenomination() {
    return denomination;
  }

  public String getName() {
    return name;
  }

  public int getCount() {
    return count;
  }

  public abstract String printValue();
}
