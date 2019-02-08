public class Quarter extends Currency {
  public Quarter(int count) {
    super("Quarter", 0.25, count);
  }

  public Quarter() {
    super("Quarter", 0.25);
  }

  @Override
  public String printValue() {
    return String.format("%d %s", this.getCount(), this.getName());
  }
}