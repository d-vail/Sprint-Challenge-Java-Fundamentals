public abstract class Currency {
  private double value;
  private String name;
  private int count;

  public Currency(String name, double value, int count) {
    this.name = name;
    this.value = value;
    this.count = count;
  }

  public Currency(String name, double value) {
    this.name = name;
    this.value = value;
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
