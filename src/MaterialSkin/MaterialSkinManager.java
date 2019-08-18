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
import MaterialSkin.Controls.*;

public class MaterialSkinManager {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setTheme(MaterialSkinManager.Themes value) {
    try {
      javonetHandle.set("Theme", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public MaterialSkinManager.Themes getTheme() {
    try {
      Object res = javonetHandle.<NEnum>get("Theme");
      if (res == null) return null;
      return MaterialSkinManager.Themes.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setColorScheme(ColorScheme value) {
    try {
      javonetHandle.set("ColorScheme", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ColorScheme getColorScheme() {
    try {
      Object res = javonetHandle.<NObject>get("ColorScheme");
      if (res == null) return null;
      return new ColorScheme((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static MaterialSkinManager getInstance() {
    try {
      Object res = Javonet.getType("MaterialSkin.MaterialSkinManager").<NObject>get("Instance");
      if (res == null) return null;
      return new MaterialSkinManager((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public Color getACTION_BAR_TEXT() {
    try {
      Object res = javonetHandle.<NObject>get("ACTION_BAR_TEXT");
      if (res == null) return null;
      return new Color((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setACTION_BAR_TEXT(Color param) {
    try {
      javonetHandle.set("ACTION_BAR_TEXT", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public Brush getACTION_BAR_TEXT_BRUSH() {
    try {
      Object res = javonetHandle.<NObject>get("ACTION_BAR_TEXT_BRUSH");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setACTION_BAR_TEXT_BRUSH(Brush param) {
    try {
      javonetHandle.set("ACTION_BAR_TEXT_BRUSH", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public Color getACTION_BAR_TEXT_SECONDARY() {
    try {
      Object res = javonetHandle.<NObject>get("ACTION_BAR_TEXT_SECONDARY");
      if (res == null) return null;
      return new Color((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setACTION_BAR_TEXT_SECONDARY(Color param) {
    try {
      javonetHandle.set("ACTION_BAR_TEXT_SECONDARY", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public Brush getACTION_BAR_TEXT_SECONDARY_BRUSH() {
    try {
      Object res = javonetHandle.<NObject>get("ACTION_BAR_TEXT_SECONDARY_BRUSH");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setACTION_BAR_TEXT_SECONDARY_BRUSH(Brush param) {
    try {
      javonetHandle.set("ACTION_BAR_TEXT_SECONDARY_BRUSH", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public Font getROBOTO_MEDIUM_12() {
    try {
      Object res = javonetHandle.<NObject>get("ROBOTO_MEDIUM_12");
      if (res == null) return null;
      return new Font((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setROBOTO_MEDIUM_12(Font param) {
    try {
      javonetHandle.set("ROBOTO_MEDIUM_12", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public Font getROBOTO_REGULAR_11() {
    try {
      Object res = javonetHandle.<NObject>get("ROBOTO_REGULAR_11");
      if (res == null) return null;
      return new Font((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setROBOTO_REGULAR_11(Font param) {
    try {
      javonetHandle.set("ROBOTO_REGULAR_11", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public Font getROBOTO_MEDIUM_11() {
    try {
      Object res = javonetHandle.<NObject>get("ROBOTO_MEDIUM_11");
      if (res == null) return null;
      return new Font((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setROBOTO_MEDIUM_11(Font param) {
    try {
      javonetHandle.set("ROBOTO_MEDIUM_11", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public Font getROBOTO_MEDIUM_10() {
    try {
      Object res = javonetHandle.<NObject>get("ROBOTO_MEDIUM_10");
      if (res == null) return null;
      return new Font((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setROBOTO_MEDIUM_10(Font param) {
    try {
      javonetHandle.set("ROBOTO_MEDIUM_10", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getFORM_PADDING() {
    try {
      java.lang.Integer res = javonetHandle.get("FORM_PADDING");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setFORM_PADDING(java.lang.Integer param) {
    try {
      javonetHandle.set("FORM_PADDING", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Color getSECONDARY_TEXT_BLACK() {
    try {
      Object res =
          Javonet.getType("MaterialSkin.MaterialSkinManager").<NObject>get("SECONDARY_TEXT_BLACK");
      if (res == null) return null;
      return new Color((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setSECONDARY_TEXT_BLACK(Color param) {
    try {
      Javonet.getType("MaterialSkin.MaterialSkinManager").set("SECONDARY_TEXT_BLACK", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Brush getSECONDARY_TEXT_BLACK_BRUSH() {
    try {
      Object res =
          Javonet.getType("MaterialSkin.MaterialSkinManager")
              .<NObject>get("SECONDARY_TEXT_BLACK_BRUSH");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setSECONDARY_TEXT_BLACK_BRUSH(Brush param) {
    try {
      Javonet.getType("MaterialSkin.MaterialSkinManager").set("SECONDARY_TEXT_BLACK_BRUSH", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Color getSECONDARY_TEXT_WHITE() {
    try {
      Object res =
          Javonet.getType("MaterialSkin.MaterialSkinManager").<NObject>get("SECONDARY_TEXT_WHITE");
      if (res == null) return null;
      return new Color((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setSECONDARY_TEXT_WHITE(Color param) {
    try {
      Javonet.getType("MaterialSkin.MaterialSkinManager").set("SECONDARY_TEXT_WHITE", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Brush getSECONDARY_TEXT_WHITE_BRUSH() {
    try {
      Object res =
          Javonet.getType("MaterialSkin.MaterialSkinManager")
              .<NObject>get("SECONDARY_TEXT_WHITE_BRUSH");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setSECONDARY_TEXT_WHITE_BRUSH(Brush param) {
    try {
      Javonet.getType("MaterialSkin.MaterialSkinManager").set("SECONDARY_TEXT_WHITE_BRUSH", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public MaterialSkinManager(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Color GetMainTextColor() {
    try {
      Object res = javonetHandle.invoke("GetMainTextColor");
      if (res == null) return null;
      return new Color((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Brush GetMainTextBrush() {
    try {
      Object res = javonetHandle.invoke("GetMainTextBrush");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Color GetDisabledOrHintColor() {
    try {
      Object res = javonetHandle.invoke("GetDisabledOrHintColor");
      if (res == null) return null;
      return new Color((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Brush GetDisabledOrHintBrush() {
    try {
      Object res = javonetHandle.invoke("GetDisabledOrHintBrush");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Color GetDividersColor() {
    try {
      Object res = javonetHandle.invoke("GetDividersColor");
      if (res == null) return null;
      return new Color((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Brush GetDividersBrush() {
    try {
      Object res = javonetHandle.invoke("GetDividersBrush");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Color GetCheckboxOffColor() {
    try {
      Object res = javonetHandle.invoke("GetCheckboxOffColor");
      if (res == null) return null;
      return new Color((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Brush GetCheckboxOffBrush() {
    try {
      Object res = javonetHandle.invoke("GetCheckboxOffBrush");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Color GetCheckBoxOffDisabledColor() {
    try {
      Object res = javonetHandle.invoke("GetCheckBoxOffDisabledColor");
      if (res == null) return null;
      return new Color((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Brush GetCheckBoxOffDisabledBrush() {
    try {
      Object res = javonetHandle.invoke("GetCheckBoxOffDisabledBrush");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Brush GetRaisedButtonBackgroundBrush() {
    try {
      Object res = javonetHandle.invoke("GetRaisedButtonBackgroundBrush");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Brush GetRaisedButtonTextBrush(java.lang.Boolean primary) {
    try {
      Object res = javonetHandle.invoke("GetRaisedButtonTextBrush", primary);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Color GetFlatButtonHoverBackgroundColor() {
    try {
      Object res = javonetHandle.invoke("GetFlatButtonHoverBackgroundColor");
      if (res == null) return null;
      return new Color((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Brush GetFlatButtonHoverBackgroundBrush() {
    try {
      Object res = javonetHandle.invoke("GetFlatButtonHoverBackgroundBrush");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Color GetFlatButtonPressedBackgroundColor() {
    try {
      Object res = javonetHandle.invoke("GetFlatButtonPressedBackgroundColor");
      if (res == null) return null;
      return new Color((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Brush GetFlatButtonPressedBackgroundBrush() {
    try {
      Object res = javonetHandle.invoke("GetFlatButtonPressedBackgroundBrush");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Brush GetFlatButtonDisabledTextBrush() {
    try {
      Object res = javonetHandle.invoke("GetFlatButtonDisabledTextBrush");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Brush GetCmsSelectedItemBrush() {
    try {
      Object res = javonetHandle.invoke("GetCmsSelectedItemBrush");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Color GetApplicationBackgroundColor() {
    try {
      Object res = javonetHandle.invoke("GetApplicationBackgroundColor");
      if (res == null) return null;
      return new Color((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void AddFormToManage(MaterialForm materialForm) {
    try {
      javonetHandle.invoke("AddFormToManage", materialForm);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void RemoveFormToManage(MaterialForm materialForm) {
    try {
      javonetHandle.invoke("RemoveFormToManage", materialForm);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public enum Themes {
    LIGHT(0L),
    DARK(1L),
    ;
    private long numVal;

    Themes(long numVal) {
      this.numVal = numVal;
    }

    public long getNumVal() {
      return numVal;
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
