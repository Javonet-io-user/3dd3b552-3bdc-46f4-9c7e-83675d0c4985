package jio.System.Windows.Forms;

public enum DragAction {
  Continue(0L),
  Drop(1L),
  Cancel(2L),
  ;
  private long numVal;

  DragAction(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
