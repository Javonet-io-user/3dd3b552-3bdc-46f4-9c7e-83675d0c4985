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

public class TabControl extends Control
    implements IComponent,
        IDisposable,
        IDropTarget,
        ISynchronizeInvoke,
        IWin32Window,
        IBindableComponent {
  protected NObject javonetHandle;

  public TabControl() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Windows.Forms.TabControl");
      super.construct(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TabControl(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }

  public static class TabPageCollection
      implements IList, ICollection, IEnumerable, Iterable<Object> {
    protected NObject javonetHandle;

    @Override
    public Iterator<Object> iterator() {
      return (Iterator<Object>) this.IEnumerable_GetEnumerator();
    }

    public TabPageCollection(TabControl owner) {
      try {
        javonetHandle = Javonet.New("System.Windows.Forms.TabControl+TabPageCollection", owner);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public TabPageCollection(NObject handle) {
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
    /** ExplicitSetProperty */

    @MethodTypeAnnotation(type = "Method")
    public Object getItem(java.lang.Integer index) {
      try {
        Object res =
            javonetHandle
                .explicitInterface("jio.System.Collections.IList")
                .invoke("get_Item", index);
        if (res == null) return null;
        return ConvertToConcreteInterfaceImplementation(res);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }
    /** ExplicitSetProperty */

    @MethodTypeAnnotation(type = "Method")
    public void setItem(java.lang.Integer index, Object value) {
      try {
        javonetHandle
            .explicitInterface("jio.System.Collections.IList")
            .invoke("set_Item", index, value);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** Method */

    @MethodTypeAnnotation(type = "Method")
    public java.lang.Integer Add(Object value) {
      try {
        java.lang.Integer res =
            javonetHandle.explicitInterface("jio.System.Collections.IList").invoke("Add", value);
        if (res == null) return 0;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return 0;
      }
    }
    /** Method */

    @MethodTypeAnnotation(type = "Method")
    public java.lang.Boolean Contains(Object page) {
      try {
        java.lang.Boolean res =
            javonetHandle
                .explicitInterface("jio.System.Collections.IList")
                .invoke("Contains", page);
        if (res == null) return false;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return false;
      }
    }
    /** ExplicitSetProperty */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.Boolean getIsFixedSize() {
      try {
        java.lang.Boolean res =
            javonetHandle
                .explicitInterface("jio.System.Collections.IList")
                .invoke("get_IsFixedSize");
        if (res == null) return false;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return false;
      }
    }
    /** Method */

    @MethodTypeAnnotation(type = "Method")
    public java.lang.Integer IndexOf(Object page) {
      try {
        java.lang.Integer res =
            javonetHandle.explicitInterface("jio.System.Collections.IList").invoke("IndexOf", page);
        if (res == null) return 0;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return 0;
      }
    }
    /** Method */

    @MethodTypeAnnotation(type = "Method")
    public void Insert(java.lang.Integer index, Object tabPage) {
      try {
        javonetHandle
            .explicitInterface("jio.System.Collections.IList")
            .invoke("Insert", index, tabPage);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** Method */

    @MethodTypeAnnotation(type = "Method")
    public void Remove(Object value) {
      try {
        javonetHandle.explicitInterface("jio.System.Collections.IList").invoke("Remove", value);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** Method */

    @MethodTypeAnnotation(type = "Method")
    public void CopyTo(java.lang.reflect.Array dest, java.lang.Integer index) {
      try {
        javonetHandle
            .explicitInterface("jio.System.Collections.ICollection")
            .invoke("CopyTo", dest, index);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** ExplicitSetProperty */

    @MethodTypeAnnotation(type = "GetField")
    public Object getSyncRoot() {
      try {
        Object res =
            javonetHandle
                .explicitInterface("jio.System.Collections.ICollection")
                .invoke("get_SyncRoot");
        if (res == null) return null;
        return ConvertToConcreteInterfaceImplementation(res);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }
    /** ExplicitSetProperty */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.Boolean getIsSynchronized() {
      try {
        java.lang.Boolean res =
            javonetHandle
                .explicitInterface("jio.System.Collections.ICollection")
                .invoke("get_IsSynchronized");
        if (res == null) return false;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return false;
      }
    }
  }

  public static class ControlCollection extends Control.ControlCollection
      implements IList, ICollection, IEnumerable, ICloneable, Iterable<Object> {
    protected NObject javonetHandle;

    @Override
    public Iterator<Object> iterator() {
      return (Iterator<Object>) this.IEnumerable_GetEnumerator();
    }

    public ControlCollection(TabControl owner) {
      super((NObject) null);
      try {
        javonetHandle = Javonet.New("System.Windows.Forms.TabControl+ControlCollection", owner);
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
