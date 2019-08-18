package MaterialSkin;

public enum MouseState {
  HOVER(0L),
  DOWN(1L),
  OUT(2L),
  ;
  private long numVal;

  MouseState(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
