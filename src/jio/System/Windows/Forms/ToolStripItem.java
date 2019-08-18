package jio.System.Windows.Forms;

import Common.Activation;
import static Common.JavonetHelper.Convert;
import static Common.JavonetHelper.getGetObjectName;
import static Common.JavonetHelper.getReturnObjectName;
import static Common.JavonetHelper.ConvertToConcreteInterfaceImplementation;
import Common.JavonetHelper;
import Common.MethodTypeAnnotation;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.lang.*;
import jio.System.ComponentModel.*;
import jio.System.*;
import jio.System.Windows.Forms.*;
import jio.System.Reflection.*;
import Accessibility.*;

public abstract class ToolStripItem extends Component
    implements IComponent, IDisposable, IDropTarget {
  protected NObject javonetHandle;

  public ToolStripItem(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnDragEnter(DragEventArgs dragEvent) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Windows.Forms.IDropTarget")
          .invoke("OnDragEnter", dragEvent);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnDragLeave(EventArgs e) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Windows.Forms.IDropTarget")
          .invoke("OnDragLeave", e);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnDragDrop(DragEventArgs dragEvent) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Windows.Forms.IDropTarget")
          .invoke("OnDragDrop", dragEvent);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnDragOver(DragEventArgs dragEvent) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Windows.Forms.IDropTarget")
          .invoke("OnDragOver", dragEvent);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public static class ToolStripItemAccessibleObject extends AccessibleObject
      implements IReflect, IAccessible {
    protected NObject javonetHandle;

    public ToolStripItemAccessibleObject(ToolStripItem ownerItem) {
      super((NObject) null);
      try {
        javonetHandle =
            Javonet.New(
                "System.Windows.Forms.ToolStripItem+ToolStripItemAccessibleObject", ownerItem);
        super.setJavonetHandle(javonetHandle);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public ToolStripItemAccessibleObject(NObject handle) {
      super(handle);
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
