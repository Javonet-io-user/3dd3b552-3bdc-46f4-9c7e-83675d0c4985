package MaterialSkin;

public enum TextShade {
  BLACK(2171169L),
  WHITE(16777215L),
  ;
  private long numVal;

  TextShade(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
