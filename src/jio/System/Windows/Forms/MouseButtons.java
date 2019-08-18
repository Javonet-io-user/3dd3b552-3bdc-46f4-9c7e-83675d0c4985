package jio.System.Windows.Forms;

public enum MouseButtons {
  None(0L),
  Left(1048576L),
  Right(2097152L),
  Middle(4194304L),
  XButton1(8388608L),
  XButton2(16777216L),
  ;
  private long numVal;

  MouseButtons(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
