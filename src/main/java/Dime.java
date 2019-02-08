public class Dime extends Currency {
  public Dime(int count) {
    super("Dime", 0.10, count);
  }

  public Dime() {
    super("Dime", 0.10);
  }

  @Override
  public String printValue() {
    return String.format("%d %s", this.getCount(), this.getName());
  }
}
