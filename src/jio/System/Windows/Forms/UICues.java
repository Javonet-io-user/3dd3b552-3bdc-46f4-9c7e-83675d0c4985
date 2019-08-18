package jio.System.Windows.Forms;

public enum UICues {
  None(0L),
  ShowFocus(1L),
  ShowKeyboard(2L),
  Shown(3L),
  ChangeFocus(4L),
  ChangeKeyboard(8L),
  Changed(12L),
  ;
  private long numVal;

  UICues(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
