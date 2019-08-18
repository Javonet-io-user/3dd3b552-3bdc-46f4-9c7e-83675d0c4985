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
import jio.System.Drawing.*;
import jio.System.*;
import jio.System.ComponentModel.*;

public class ToolStripMenuItem extends ToolStripDropDownItem
    implements IComponent, IDisposable, IDropTarget {
  protected NObject javonetHandle;

  public ToolStripMenuItem() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Windows.Forms.ToolStripMenuItem");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ToolStripMenuItem(java.lang.String text) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Windows.Forms.ToolStripMenuItem", text);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ToolStripMenuItem(Image image) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Windows.Forms.ToolStripMenuItem", image);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ToolStripMenuItem(java.lang.String text, Image image) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Windows.Forms.ToolStripMenuItem", text, image);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ToolStripMenuItem(java.lang.String text, Image image, EventHandler onClick) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Windows.Forms.ToolStripMenuItem", text, image, onClick);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ToolStripMenuItem(
      java.lang.String text, Image image, EventHandler onClick, java.lang.String name) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("System.Windows.Forms.ToolStripMenuItem", text, image, onClick, name);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ToolStripMenuItem(java.lang.String text, Image image, ToolStripItem[] dropDownItems) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Windows.Forms.ToolStripMenuItem", text, image, new Object[] {dropDownItems});
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ToolStripMenuItem(
      java.lang.String text, Image image, EventHandler onClick, Keys shortcutKeys) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Windows.Forms.ToolStripMenuItem",
              text,
              image,
              onClick,
              NEnum.fromJavaEnum(shortcutKeys));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ToolStripMenuItem(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
