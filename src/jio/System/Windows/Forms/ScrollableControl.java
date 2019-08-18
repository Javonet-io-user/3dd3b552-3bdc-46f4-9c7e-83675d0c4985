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
import jio.System.Windows.Forms.*;
import jio.System.ComponentModel.*;
import jio.System.*;

public class ScrollableControl extends Control
    implements IComponent,
        IDisposable,
        IDropTarget,
        ISynchronizeInvoke,
        IWin32Window,
        IBindableComponent {
  protected NObject javonetHandle;

  public ScrollableControl() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Windows.Forms.ScrollableControl");
      super.construct(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ScrollableControl(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }

  public static class DockPaddingEdges implements ICloneable {
    protected NObject javonetHandle;

    public DockPaddingEdges(NObject handle) {
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
    /** Method */

    @MethodTypeAnnotation(type = "Method")
    public Object Clone() {
      try {
        Object res = javonetHandle.explicitInterface("jio.System.ICloneable").invoke("Clone");
        if (res == null) return null;
        return ConvertToConcreteInterfaceImplementation(res);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }
  }

  public static class DockPaddingEdgesConverter extends TypeConverter {
    public NObject javonetHandle;

    public DockPaddingEdgesConverter() {
      super((NObject) null);
      try {
        javonetHandle =
            Javonet.New("System.Windows.Forms.ScrollableControl+DockPaddingEdgesConverter");
        super.setJavonetHandle(javonetHandle);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public DockPaddingEdgesConverter(NObject handle) {
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
