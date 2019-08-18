package MaterialSkin.Controls;

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
import MaterialSkin.Controls.*;
import jio.System.*;
import jio.System.Runtime.InteropServices.*;
import MaterialSkin.*;
import jio.System.ComponentModel.*;

public class MaterialForm extends Form
    implements IComponent,
        IDisposable,
        IDropTarget,
        ISynchronizeInvoke,
        IWin32Window,
        IBindableComponent,
        IContainerControl {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setDepth(java.lang.Integer value) {
    try {
      javonetHandle.set("Depth", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getDepth() {
    try {
      java.lang.Integer res = javonetHandle.get("Depth");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public MaterialSkinManager getSkinManager() {
    try {
      Object res = javonetHandle.<NObject>get("SkinManager");
      if (res == null) return null;
      return new MaterialSkinManager((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setMouseState(MouseState value) {
    try {
      javonetHandle.set("MouseState", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public MouseState getMouseState() {
    try {
      Object res = javonetHandle.<NEnum>get("MouseState");
      if (res == null) return null;
      return MouseState.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setFormBorderStyle(FormBorderStyle value) {
    try {
      javonetHandle.set("FormBorderStyle", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public FormBorderStyle getFormBorderStyle() {
    try {
      Object res = javonetHandle.<NEnum>get("FormBorderStyle");
      if (res == null) return null;
      return FormBorderStyle.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setSizable(java.lang.Boolean value) {
    try {
      javonetHandle.set("Sizable", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getSizable() {
    try {
      java.lang.Boolean res = javonetHandle.get("Sizable");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Integer getWM_NCLBUTTONDOWN() {
    try {
      java.lang.Integer res =
          Javonet.getType("MaterialSkin.Controls.MaterialForm").get("WM_NCLBUTTONDOWN");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setWM_NCLBUTTONDOWN(java.lang.Integer param) {
    try {
      Javonet.getType("MaterialSkin.Controls.MaterialForm").set("WM_NCLBUTTONDOWN", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Integer getHT_CAPTION() {
    try {
      java.lang.Integer res =
          Javonet.getType("MaterialSkin.Controls.MaterialForm").get("HT_CAPTION");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setHT_CAPTION(java.lang.Integer param) {
    try {
      Javonet.getType("MaterialSkin.Controls.MaterialForm").set("HT_CAPTION", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Integer getWM_MOUSEMOVE() {
    try {
      java.lang.Integer res =
          Javonet.getType("MaterialSkin.Controls.MaterialForm").get("WM_MOUSEMOVE");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setWM_MOUSEMOVE(java.lang.Integer param) {
    try {
      Javonet.getType("MaterialSkin.Controls.MaterialForm").set("WM_MOUSEMOVE", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Integer getWM_LBUTTONDOWN() {
    try {
      java.lang.Integer res =
          Javonet.getType("MaterialSkin.Controls.MaterialForm").get("WM_LBUTTONDOWN");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setWM_LBUTTONDOWN(java.lang.Integer param) {
    try {
      Javonet.getType("MaterialSkin.Controls.MaterialForm").set("WM_LBUTTONDOWN", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Integer getWM_LBUTTONUP() {
    try {
      java.lang.Integer res =
          Javonet.getType("MaterialSkin.Controls.MaterialForm").get("WM_LBUTTONUP");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setWM_LBUTTONUP(java.lang.Integer param) {
    try {
      Javonet.getType("MaterialSkin.Controls.MaterialForm").set("WM_LBUTTONUP", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Integer getWM_LBUTTONDBLCLK() {
    try {
      java.lang.Integer res =
          Javonet.getType("MaterialSkin.Controls.MaterialForm").get("WM_LBUTTONDBLCLK");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setWM_LBUTTONDBLCLK(java.lang.Integer param) {
    try {
      Javonet.getType("MaterialSkin.Controls.MaterialForm").set("WM_LBUTTONDBLCLK", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Integer getWM_RBUTTONDOWN() {
    try {
      java.lang.Integer res =
          Javonet.getType("MaterialSkin.Controls.MaterialForm").get("WM_RBUTTONDOWN");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setWM_RBUTTONDOWN(java.lang.Integer param) {
    try {
      Javonet.getType("MaterialSkin.Controls.MaterialForm").set("WM_RBUTTONDOWN", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public MaterialForm() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("MaterialSkin.Controls.MaterialForm");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public MaterialForm(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer SendMessage(
      IntPtr hWnd, java.lang.Integer Msg, java.lang.Integer wParam, java.lang.Integer lParam) {
    try {
      java.lang.Integer res =
          Javonet.getType("MaterialSkin.Controls.MaterialForm")
              .invoke("SendMessage", hWnd, Msg, wParam, lParam);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean ReleaseCapture() {
    try {
      java.lang.Boolean res =
          Javonet.getType("MaterialSkin.Controls.MaterialForm").invoke("ReleaseCapture");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer TrackPopupMenuEx(
      IntPtr hmenu,
      java.lang.Long fuFlags,
      java.lang.Integer x,
      java.lang.Integer y,
      IntPtr hwnd,
      IntPtr lptpm) {
    try {
      java.lang.Integer res =
          Javonet.getType("MaterialSkin.Controls.MaterialForm")
              .invoke("TrackPopupMenuEx", hmenu, fuFlags, x, y, hwnd, lptpm);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static IntPtr GetSystemMenu(IntPtr hWnd, java.lang.Boolean bRevert) {
    try {
      Object res =
          Javonet.getType("MaterialSkin.Controls.MaterialForm")
              .invoke("GetSystemMenu", hWnd, bRevert);
      if (res == null) return null;
      return (jio.System.IntPtr) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static IntPtr MonitorFromWindow(IntPtr hwnd, java.lang.Long dwFlags) {
    try {
      Object res =
          Javonet.getType("MaterialSkin.Controls.MaterialForm")
              .invoke("MonitorFromWindow", hwnd, dwFlags);
      if (res == null) return null;
      return (jio.System.IntPtr) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean GetMonitorInfo(
      HandleRef hmonitor, MaterialForm.MONITORINFOEX info) {
    try {
      java.lang.Boolean res =
          Javonet.getType("MaterialSkin.Controls.MaterialForm")
              .invoke("GetMonitorInfo", hmonitor, info);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Dispose() {
    try {
      javonetHandle.invoke("Dispose");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public static class MONITORINFOEX {
    protected NObject javonetHandle;
    /** GetFiled */
    @MethodTypeAnnotation(type = "GetField")
    public java.lang.Integer getcbSize() {
      try {
        java.lang.Integer res = javonetHandle.get("cbSize");
        if (res == null) return 0;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return 0;
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setcbSize(java.lang.Integer param) {
      try {
        javonetHandle.set("cbSize", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public RECT getrcMonitor() {
      try {
        Object res = javonetHandle.<NObject>get("rcMonitor");
        if (res == null) return null;
        return new RECT((NObject) res);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setrcMonitor(RECT param) {
      try {
        javonetHandle.set("rcMonitor", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public RECT getrcWork() {
      try {
        Object res = javonetHandle.<NObject>get("rcWork");
        if (res == null) return null;
        return new RECT((NObject) res);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setrcWork(RECT param) {
      try {
        javonetHandle.set("rcWork", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.Integer getdwFlags() {
      try {
        java.lang.Integer res = javonetHandle.get("dwFlags");
        if (res == null) return 0;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return 0;
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setdwFlags(java.lang.Integer param) {
      try {
        javonetHandle.set("dwFlags", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.Character[] getszDevice(Class<?> returnArrayType) {
      try {
        Object[] res = javonetHandle.<NObject[]>get("szDevice");
        if (res == null) return null;
        return (java.lang.Character[])
            JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setszDevice(java.lang.Character[] param) {
      try {
        javonetHandle.set("szDevice", new Object[] {param});
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public MONITORINFOEX() {
      try {
        javonetHandle = Javonet.New("MaterialSkin.Controls.MaterialForm+MONITORINFOEX");
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public MONITORINFOEX(NObject handle) {
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
  }

  public static class RECT extends ValueType {
    protected NObject javonetHandle;
    /** GetFiled */
    @MethodTypeAnnotation(type = "GetField")
    public java.lang.Integer getleft() {
      try {
        java.lang.Integer res = javonetHandle.get("left");
        if (res == null) return 0;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return 0;
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setleft(java.lang.Integer param) {
      try {
        javonetHandle.set("left", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.Integer gettop() {
      try {
        java.lang.Integer res = javonetHandle.get("top");
        if (res == null) return 0;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return 0;
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void settop(java.lang.Integer param) {
      try {
        javonetHandle.set("top", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.Integer getright() {
      try {
        java.lang.Integer res = javonetHandle.get("right");
        if (res == null) return 0;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return 0;
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setright(java.lang.Integer param) {
      try {
        javonetHandle.set("right", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.Integer getbottom() {
      try {
        java.lang.Integer res = javonetHandle.get("bottom");
        if (res == null) return 0;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return 0;
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setbottom(java.lang.Integer param) {
      try {
        javonetHandle.set("bottom", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public RECT(NObject handle) {
      super(handle);
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
    /** Method */

    @MethodTypeAnnotation(type = "Method")
    public java.lang.Integer Width() {
      try {
        java.lang.Integer res = javonetHandle.invoke("Width");
        if (res == null) return 0;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return 0;
      }
    }
    /** Method */

    @MethodTypeAnnotation(type = "Method")
    public java.lang.Integer Height() {
      try {
        java.lang.Integer res = javonetHandle.invoke("Height");
        if (res == null) return 0;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return 0;
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
