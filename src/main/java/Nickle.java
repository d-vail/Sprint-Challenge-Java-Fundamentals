public class Nickle extends Currency {
  public Nickle(int count) {
    super("Nickle", 0.05, count);
  }

  public Nickle() {
    super("Nickle", 0.05);
  }

  @Override
  public String printValue() {
    return String.format("%d %s", this.getCount(), this.getName());
  }
}
