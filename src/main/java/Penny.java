public class Penny extends Currency {
  public Penny(int count) {
    super("Penny", 0.01, count);
  }

  public Penny() {
    super("Penny", 0.01);
  }

  @Override
  public String printValue() {
    return String.format("%d %s", this.getCount(), this.getName());
  }
}
