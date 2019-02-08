public abstract class Currency {
  private double value;
  private String name;
  private int count;

  public Currency(int count) {
    this.count = count;
  }

  public Currency() {
    count = 1;
  }

  public double getValue() {
    return value;
  }

  public String getName() {
    return name;
  }

  public int getCount() {
    return count;
  }

  public abstract String printValue();
}
