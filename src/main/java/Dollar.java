public class Dollar extends Currency {
  public Dollar(int count) {
    super("Dollar", 1, count);
  }

  public Dollar() {
    super("Dollar", 1);
  }

  @Override
  public String printValue() {
    return String.format("$%d.00", this.getCount());
  }
}
