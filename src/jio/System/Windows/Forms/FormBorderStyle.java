package jio.System.Windows.Forms;

public enum FormBorderStyle {
  None(0L),
  FixedSingle(1L),
  Fixed3D(2L),
  FixedDialog(3L),
  Sizable(4L),
  FixedToolWindow(5L),
  SizableToolWindow(6L),
  ;
  private long numVal;

  FormBorderStyle(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
