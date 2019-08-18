package MaterialSkin;

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
import MaterialSkin.*;
import jio.System.Drawing.*;

public class ColorScheme {
  protected NObject javonetHandle;
  /** GetFiled */
  @MethodTypeAnnotation(type = "GetField")
  public Color getPrimaryColor() {
    try {
      Object res = javonetHandle.<NObject>get("PrimaryColor");
      if (res == null) return null;
      return new Color((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setPrimaryColor(Color param) {
    try {
      javonetHandle.set("PrimaryColor", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public Color getDarkPrimaryColor() {
    try {
      Object res = javonetHandle.<NObject>get("DarkPrimaryColor");
      if (res == null) return null;
      return new Color((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setDarkPrimaryColor(Color param) {
    try {
      javonetHandle.set("DarkPrimaryColor", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public Color getLightPrimaryColor() {
    try {
      Object res = javonetHandle.<NObject>get("LightPrimaryColor");
      if (res == null) return null;
      return new Color((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setLightPrimaryColor(Color param) {
    try {
      javonetHandle.set("LightPrimaryColor", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public Color getAccentColor() {
    try {
      Object res = javonetHandle.<NObject>get("AccentColor");
      if (res == null) return null;
      return new Color((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setAccentColor(Color param) {
    try {
      javonetHandle.set("AccentColor", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public Color getTextColor() {
    try {
      Object res = javonetHandle.<NObject>get("TextColor");
      if (res == null) return null;
      return new Color((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setTextColor(Color param) {
    try {
      javonetHandle.set("TextColor", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public Pen getPrimaryPen() {
    try {
      Object res = javonetHandle.<NObject>get("PrimaryPen");
      if (res == null) return null;
      return new Pen((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setPrimaryPen(Pen param) {
    try {
      javonetHandle.set("PrimaryPen", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public Pen getDarkPrimaryPen() {
    try {
      Object res = javonetHandle.<NObject>get("DarkPrimaryPen");
      if (res == null) return null;
      return new Pen((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setDarkPrimaryPen(Pen param) {
    try {
      javonetHandle.set("DarkPrimaryPen", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public Pen getLightPrimaryPen() {
    try {
      Object res = javonetHandle.<NObject>get("LightPrimaryPen");
      if (res == null) return null;
      return new Pen((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setLightPrimaryPen(Pen param) {
    try {
      javonetHandle.set("LightPrimaryPen", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public Pen getAccentPen() {
    try {
      Object res = javonetHandle.<NObject>get("AccentPen");
      if (res == null) return null;
      return new Pen((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setAccentPen(Pen param) {
    try {
      javonetHandle.set("AccentPen", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public Pen getTextPen() {
    try {
      Object res = javonetHandle.<NObject>get("TextPen");
      if (res == null) return null;
      return new Pen((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setTextPen(Pen param) {
    try {
      javonetHandle.set("TextPen", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public Brush getPrimaryBrush() {
    try {
      Object res = javonetHandle.<NObject>get("PrimaryBrush");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setPrimaryBrush(Brush param) {
    try {
      javonetHandle.set("PrimaryBrush", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public Brush getDarkPrimaryBrush() {
    try {
      Object res = javonetHandle.<NObject>get("DarkPrimaryBrush");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setDarkPrimaryBrush(Brush param) {
    try {
      javonetHandle.set("DarkPrimaryBrush", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public Brush getLightPrimaryBrush() {
    try {
      Object res = javonetHandle.<NObject>get("LightPrimaryBrush");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setLightPrimaryBrush(Brush param) {
    try {
      javonetHandle.set("LightPrimaryBrush", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public Brush getAccentBrush() {
    try {
      Object res = javonetHandle.<NObject>get("AccentBrush");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setAccentBrush(Brush param) {
    try {
      javonetHandle.set("AccentBrush", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public Brush getTextBrush() {
    try {
      Object res = javonetHandle.<NObject>get("TextBrush");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setTextBrush(Brush param) {
    try {
      javonetHandle.set("TextBrush", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ColorScheme(
      Primary primary,
      Primary darkPrimary,
      Primary lightPrimary,
      Accent accent,
      TextShade textShade) {
    try {
      javonetHandle =
          Javonet.New(
              "MaterialSkin.ColorScheme",
              NEnum.fromJavaEnum(primary),
              NEnum.fromJavaEnum(darkPrimary),
              NEnum.fromJavaEnum(lightPrimary),
              NEnum.fromJavaEnum(accent),
              NEnum.fromJavaEnum(textShade));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ColorScheme(NObject handle) {
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
