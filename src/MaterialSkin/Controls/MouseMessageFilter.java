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
import MaterialSkin.Controls.*;
import jio.System.Windows.Forms.*;
import jio.System.*;

public class MouseMessageFilter implements IMessageFilter {
  protected NObject javonetHandle;

  public MouseMessageFilter() {
    try {
      javonetHandle = Javonet.New("MaterialSkin.Controls.MouseMessageFilter");
      javonetHandle.addEventListener(
          "MouseMove",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (MouseEventHandler handler : _MouseMoveListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], MouseEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public MouseMessageFilter(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean PreFilterMessage(Message m) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("jio.System.Windows.Forms.IMessageFilter")
              .invoke("PreFilterMessage", m);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Event */

  private java.util.ArrayList<MouseEventHandler> _MouseMoveListeners =
      new java.util.ArrayList<MouseEventHandler>();

  public void addMouseMove(MouseEventHandler toAdd) {
    _MouseMoveListeners.add(toAdd);
  }

  public void removeMouseMove(MouseEventHandler toRemove) {
    _MouseMoveListeners.remove(toRemove);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
