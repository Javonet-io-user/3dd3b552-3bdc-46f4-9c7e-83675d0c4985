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
import jio.System.Collections.*;

public class Form extends ContainerControl
    implements IComponent,
        IDisposable,
        IDropTarget,
        ISynchronizeInvoke,
        IWin32Window,
        IBindableComponent,
        IContainerControl {
  protected NObject javonetHandle;

  public Form() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Windows.Forms.Form");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Form(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }

  public static class ControlCollection extends Control.ControlCollection
      implements IList, ICollection, IEnumerable, ICloneable, Iterable<Object> {
    protected NObject javonetHandle;

    @Override
    public Iterator<Object> iterator() {
      return (Iterator<Object>) this.IEnumerable_GetEnumerator();
    }

    public ControlCollection(Form owner) {
      super((NObject) null);
      try {
        javonetHandle = Javonet.New("System.Windows.Forms.Form+ControlCollection", owner);
        super.setJavonetHandle(javonetHandle);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public ControlCollection(NObject handle) {
      super(handle);
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
    /** Method */

    @MethodTypeAnnotation(type = "Method")
    public IEnumerator IEnumerable_GetEnumerator() {
      try {
        Object res =
            javonetHandle
                .explicitInterface("jio.System.Collections.IEnumerable")
                .invoke("GetEnumerator");
        if (res == null) return null;
        return ConvertToConcreteInterfaceImplementation(res);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
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
