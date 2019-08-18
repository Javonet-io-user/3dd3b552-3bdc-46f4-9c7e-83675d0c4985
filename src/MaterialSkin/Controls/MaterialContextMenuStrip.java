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
import jio.System.*;
import MaterialSkin.Controls.*;
import MaterialSkin.*;
import jio.System.ComponentModel.*;

public class MaterialContextMenuStrip extends ContextMenuStrip
    implements IComponent,
        IDisposable,
        IDropTarget,
        ISynchronizeInvoke,
        IWin32Window,
        IBindableComponent {
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

  public MaterialContextMenuStrip() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("MaterialSkin.Controls.MaterialContextMenuStrip");
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "OnItemClickStart",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (MaterialContextMenuStrip.ItemClickStart handler : _OnItemClickStartListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ToolStripItemClickedEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public MaterialContextMenuStrip(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
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
  /** Event */

  private java.util.ArrayList<MaterialContextMenuStrip.ItemClickStart> _OnItemClickStartListeners =
      new java.util.ArrayList<MaterialContextMenuStrip.ItemClickStart>();

  public void addOnItemClickStart(MaterialContextMenuStrip.ItemClickStart toAdd) {
    _OnItemClickStartListeners.add(toAdd);
  }

  public void removeOnItemClickStart(MaterialContextMenuStrip.ItemClickStart toRemove) {
    _OnItemClickStartListeners.remove(toRemove);
  }

  public interface ItemClickStart {
    /** Method */
    @MethodTypeAnnotation(type = "DelegateMethod")
    public void Invoke(Object sender, ToolStripItemClickedEventArgs e);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
