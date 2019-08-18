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
import MaterialSkin.*;
import jio.System.ComponentModel.*;

public class MaterialSingleLineTextField extends Control
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
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setText(java.lang.String value) {
    try {
      javonetHandle.set("Text", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getText() {
    try {
      java.lang.String res = javonetHandle.get("Text");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setTag(Object value) {
    try {
      javonetHandle.set("Tag", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Object getTag() {
    try {
      Object res = javonetHandle.<NObject>get("Tag");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setSelectedText(java.lang.String value) {
    try {
      javonetHandle.set("SelectedText", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getSelectedText() {
    try {
      java.lang.String res = javonetHandle.get("SelectedText");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setHint(java.lang.String value) {
    try {
      javonetHandle.set("Hint", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getHint() {
    try {
      java.lang.String res = javonetHandle.get("Hint");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setSelectionStart(java.lang.Integer value) {
    try {
      javonetHandle.set("SelectionStart", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getSelectionStart() {
    try {
      java.lang.Integer res = javonetHandle.get("SelectionStart");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setSelectionLength(java.lang.Integer value) {
    try {
      javonetHandle.set("SelectionLength", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getSelectionLength() {
    try {
      java.lang.Integer res = javonetHandle.get("SelectionLength");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getTextLength() {
    try {
      java.lang.Integer res = javonetHandle.get("TextLength");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setUseSystemPasswordChar(java.lang.Boolean value) {
    try {
      javonetHandle.set("UseSystemPasswordChar", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getUseSystemPasswordChar() {
    try {
      java.lang.Boolean res = javonetHandle.get("UseSystemPasswordChar");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setPasswordChar(java.lang.Character value) {
    try {
      javonetHandle.set("PasswordChar", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Character getPasswordChar() {
    try {
      java.lang.Character res = javonetHandle.get("PasswordChar");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public MaterialSingleLineTextField() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("MaterialSkin.Controls.MaterialSingleLineTextField");
      super.construct(javonetHandle);
      javonetHandle.addEventListener(
          "AcceptsTabChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler handler : _AcceptsTabChangedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AutoSizeChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler handler : _AutoSizeChangedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BackgroundImageChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler handler : _BackgroundImageChangedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BackgroundImageLayoutChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler handler : _BackgroundImageLayoutChangedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BindingContextChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler handler : _BindingContextChangedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BorderStyleChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler handler : _BorderStyleChangedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CausesValidationChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler handler : _CausesValidationChangedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ChangeUICues",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (UICuesEventHandler handler : _ChangeUICuesListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], UICuesEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "Click",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler handler : _ClickListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ClientSizeChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler handler : _ClientSizeChangedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ContextMenuChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler handler : _ContextMenuChangedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ContextMenuStripChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler handler : _ContextMenuStripChangedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ControlAdded",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ControlEventHandler handler : _ControlAddedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], ControlEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ControlRemoved",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ControlEventHandler handler : _ControlRemovedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], ControlEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CursorChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler handler : _CursorChangedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "Disposed",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler handler : _DisposedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DockChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler handler : _DockChangedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DoubleClick",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler handler : _DoubleClickListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DragDrop",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DragEventHandler handler : _DragDropListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], DragEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DragEnter",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DragEventHandler handler : _DragEnterListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], DragEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DragLeave",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler handler : _DragLeaveListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DragOver",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DragEventHandler handler : _DragOverListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], DragEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "EnabledChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler handler : _EnabledChangedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "Enter",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler handler : _EnterListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "FontChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler handler : _FontChangedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ForeColorChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler handler : _ForeColorChangedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GiveFeedback",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (GiveFeedbackEventHandler handler : _GiveFeedbackListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GiveFeedbackEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GotFocus",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler handler : _GotFocusListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "HandleCreated",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler handler : _HandleCreatedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "HandleDestroyed",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler handler : _HandleDestroyedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "HelpRequested",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (HelpEventHandler handler : _HelpRequestedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], HelpEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "HideSelectionChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler handler : _HideSelectionChangedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ImeModeChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler handler : _ImeModeChangedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "Invalidated",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (InvalidateEventHandler handler : _InvalidatedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], InvalidateEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "KeyDown",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (KeyEventHandler handler : _KeyDownListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], KeyEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "KeyPress",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (KeyPressEventHandler handler : _KeyPressListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], KeyPressEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "KeyUp",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (KeyEventHandler handler : _KeyUpListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], KeyEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "Layout",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (LayoutEventHandler handler : _LayoutListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], LayoutEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "Leave",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler handler : _LeaveListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "LocationChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler handler : _LocationChangedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "LostFocus",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler handler : _LostFocusListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "MarginChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler handler : _MarginChangedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ModifiedChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler handler : _ModifiedChangedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "MouseCaptureChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler handler : _MouseCaptureChangedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "MouseClick",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (MouseEventHandler handler : _MouseClickListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], MouseEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "MouseDoubleClick",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (MouseEventHandler handler : _MouseDoubleClickListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], MouseEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "MouseDown",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (MouseEventHandler handler : _MouseDownListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], MouseEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "MouseEnter",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler handler : _MouseEnterListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "MouseHover",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler handler : _MouseHoverListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "MouseLeave",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler handler : _MouseLeaveListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
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
      javonetHandle.addEventListener(
          "MouseUp",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (MouseEventHandler handler : _MouseUpListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], MouseEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "MouseWheel",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (MouseEventHandler handler : _MouseWheelListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], MouseEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "Move",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler handler : _MoveListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "MultilineChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler handler : _MultilineChangedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PaddingChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler handler : _PaddingChangedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "Paint",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (PaintEventHandler handler : _PaintListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], PaintEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ParentChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler handler : _ParentChangedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PreviewKeyDown",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (PreviewKeyDownEventHandler handler : _PreviewKeyDownListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PreviewKeyDownEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "QueryAccessibilityHelp",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (QueryAccessibilityHelpEventHandler handler : _QueryAccessibilityHelpListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], QueryAccessibilityHelpEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "QueryContinueDrag",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (QueryContinueDragEventHandler handler : _QueryContinueDragListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], QueryContinueDragEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ReadOnlyChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler handler : _ReadOnlyChangedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RegionChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler handler : _RegionChangedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "Resize",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler handler : _ResizeListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "RightToLeftChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler handler : _RightToLeftChangedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SizeChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler handler : _SizeChangedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "StyleChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler handler : _StyleChangedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "SystemColorsChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler handler : _SystemColorsChangedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "TabIndexChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler handler : _TabIndexChangedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "TabStopChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler handler : _TabStopChangedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "TextAlignChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler handler : _TextAlignChangedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "TextChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler handler : _TextChangedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "Validated",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler handler : _ValidatedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "Validating",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (CancelEventHandler handler : _ValidatingListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], CancelEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "VisibleChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler handler : _VisibleChangedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public MaterialSingleLineTextField(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SelectAll() {
    try {
      javonetHandle.invoke("SelectAll");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Clear() {
    try {
      javonetHandle.invoke("Clear");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
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
  /** Event */

  private java.util.ArrayList<EventHandler> _AcceptsTabChangedListeners =
      new java.util.ArrayList<EventHandler>();

  public void addAcceptsTabChanged(EventHandler toAdd) {
    _AcceptsTabChangedListeners.add(toAdd);
  }

  public void removeAcceptsTabChanged(EventHandler toRemove) {
    _AcceptsTabChangedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler> _AutoSizeChangedListeners =
      new java.util.ArrayList<EventHandler>();

  public void addAutoSizeChanged(EventHandler toAdd) {
    _AutoSizeChangedListeners.add(toAdd);
  }

  public void removeAutoSizeChanged(EventHandler toRemove) {
    _AutoSizeChangedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler> _BackgroundImageChangedListeners =
      new java.util.ArrayList<EventHandler>();

  public void addBackgroundImageChanged(EventHandler toAdd) {
    _BackgroundImageChangedListeners.add(toAdd);
  }

  public void removeBackgroundImageChanged(EventHandler toRemove) {
    _BackgroundImageChangedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler> _BackgroundImageLayoutChangedListeners =
      new java.util.ArrayList<EventHandler>();

  public void addBackgroundImageLayoutChanged(EventHandler toAdd) {
    _BackgroundImageLayoutChangedListeners.add(toAdd);
  }

  public void removeBackgroundImageLayoutChanged(EventHandler toRemove) {
    _BackgroundImageLayoutChangedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler> _BindingContextChangedListeners =
      new java.util.ArrayList<EventHandler>();

  public void addBindingContextChanged(EventHandler toAdd) {
    _BindingContextChangedListeners.add(toAdd);
  }

  public void removeBindingContextChanged(EventHandler toRemove) {
    _BindingContextChangedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler> _BorderStyleChangedListeners =
      new java.util.ArrayList<EventHandler>();

  public void addBorderStyleChanged(EventHandler toAdd) {
    _BorderStyleChangedListeners.add(toAdd);
  }

  public void removeBorderStyleChanged(EventHandler toRemove) {
    _BorderStyleChangedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler> _CausesValidationChangedListeners =
      new java.util.ArrayList<EventHandler>();

  public void addCausesValidationChanged(EventHandler toAdd) {
    _CausesValidationChangedListeners.add(toAdd);
  }

  public void removeCausesValidationChanged(EventHandler toRemove) {
    _CausesValidationChangedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<UICuesEventHandler> _ChangeUICuesListeners =
      new java.util.ArrayList<UICuesEventHandler>();

  public void addChangeUICues(UICuesEventHandler toAdd) {
    _ChangeUICuesListeners.add(toAdd);
  }

  public void removeChangeUICues(UICuesEventHandler toRemove) {
    _ChangeUICuesListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler> _ClickListeners =
      new java.util.ArrayList<EventHandler>();

  public void addClick(EventHandler toAdd) {
    _ClickListeners.add(toAdd);
  }

  public void removeClick(EventHandler toRemove) {
    _ClickListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler> _ClientSizeChangedListeners =
      new java.util.ArrayList<EventHandler>();

  public void addClientSizeChanged(EventHandler toAdd) {
    _ClientSizeChangedListeners.add(toAdd);
  }

  public void removeClientSizeChanged(EventHandler toRemove) {
    _ClientSizeChangedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler> _ContextMenuChangedListeners =
      new java.util.ArrayList<EventHandler>();

  public void addContextMenuChanged(EventHandler toAdd) {
    _ContextMenuChangedListeners.add(toAdd);
  }

  public void removeContextMenuChanged(EventHandler toRemove) {
    _ContextMenuChangedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler> _ContextMenuStripChangedListeners =
      new java.util.ArrayList<EventHandler>();

  public void addContextMenuStripChanged(EventHandler toAdd) {
    _ContextMenuStripChangedListeners.add(toAdd);
  }

  public void removeContextMenuStripChanged(EventHandler toRemove) {
    _ContextMenuStripChangedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<ControlEventHandler> _ControlAddedListeners =
      new java.util.ArrayList<ControlEventHandler>();

  public void addControlAdded(ControlEventHandler toAdd) {
    _ControlAddedListeners.add(toAdd);
  }

  public void removeControlAdded(ControlEventHandler toRemove) {
    _ControlAddedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<ControlEventHandler> _ControlRemovedListeners =
      new java.util.ArrayList<ControlEventHandler>();

  public void addControlRemoved(ControlEventHandler toAdd) {
    _ControlRemovedListeners.add(toAdd);
  }

  public void removeControlRemoved(ControlEventHandler toRemove) {
    _ControlRemovedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler> _CursorChangedListeners =
      new java.util.ArrayList<EventHandler>();

  public void addCursorChanged(EventHandler toAdd) {
    _CursorChangedListeners.add(toAdd);
  }

  public void removeCursorChanged(EventHandler toRemove) {
    _CursorChangedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler> _DisposedListeners =
      new java.util.ArrayList<EventHandler>();

  public void addDisposed(EventHandler toAdd) {
    _DisposedListeners.add(toAdd);
  }

  public void removeDisposed(EventHandler toRemove) {
    _DisposedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler> _DockChangedListeners =
      new java.util.ArrayList<EventHandler>();

  public void addDockChanged(EventHandler toAdd) {
    _DockChangedListeners.add(toAdd);
  }

  public void removeDockChanged(EventHandler toRemove) {
    _DockChangedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler> _DoubleClickListeners =
      new java.util.ArrayList<EventHandler>();

  public void addDoubleClick(EventHandler toAdd) {
    _DoubleClickListeners.add(toAdd);
  }

  public void removeDoubleClick(EventHandler toRemove) {
    _DoubleClickListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<DragEventHandler> _DragDropListeners =
      new java.util.ArrayList<DragEventHandler>();

  public void addDragDrop(DragEventHandler toAdd) {
    _DragDropListeners.add(toAdd);
  }

  public void removeDragDrop(DragEventHandler toRemove) {
    _DragDropListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<DragEventHandler> _DragEnterListeners =
      new java.util.ArrayList<DragEventHandler>();

  public void addDragEnter(DragEventHandler toAdd) {
    _DragEnterListeners.add(toAdd);
  }

  public void removeDragEnter(DragEventHandler toRemove) {
    _DragEnterListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler> _DragLeaveListeners =
      new java.util.ArrayList<EventHandler>();

  public void addDragLeave(EventHandler toAdd) {
    _DragLeaveListeners.add(toAdd);
  }

  public void removeDragLeave(EventHandler toRemove) {
    _DragLeaveListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<DragEventHandler> _DragOverListeners =
      new java.util.ArrayList<DragEventHandler>();

  public void addDragOver(DragEventHandler toAdd) {
    _DragOverListeners.add(toAdd);
  }

  public void removeDragOver(DragEventHandler toRemove) {
    _DragOverListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler> _EnabledChangedListeners =
      new java.util.ArrayList<EventHandler>();

  public void addEnabledChanged(EventHandler toAdd) {
    _EnabledChangedListeners.add(toAdd);
  }

  public void removeEnabledChanged(EventHandler toRemove) {
    _EnabledChangedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler> _EnterListeners =
      new java.util.ArrayList<EventHandler>();

  public void addEnter(EventHandler toAdd) {
    _EnterListeners.add(toAdd);
  }

  public void removeEnter(EventHandler toRemove) {
    _EnterListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler> _FontChangedListeners =
      new java.util.ArrayList<EventHandler>();

  public void addFontChanged(EventHandler toAdd) {
    _FontChangedListeners.add(toAdd);
  }

  public void removeFontChanged(EventHandler toRemove) {
    _FontChangedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler> _ForeColorChangedListeners =
      new java.util.ArrayList<EventHandler>();

  public void addForeColorChanged(EventHandler toAdd) {
    _ForeColorChangedListeners.add(toAdd);
  }

  public void removeForeColorChanged(EventHandler toRemove) {
    _ForeColorChangedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<GiveFeedbackEventHandler> _GiveFeedbackListeners =
      new java.util.ArrayList<GiveFeedbackEventHandler>();

  public void addGiveFeedback(GiveFeedbackEventHandler toAdd) {
    _GiveFeedbackListeners.add(toAdd);
  }

  public void removeGiveFeedback(GiveFeedbackEventHandler toRemove) {
    _GiveFeedbackListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler> _GotFocusListeners =
      new java.util.ArrayList<EventHandler>();

  public void addGotFocus(EventHandler toAdd) {
    _GotFocusListeners.add(toAdd);
  }

  public void removeGotFocus(EventHandler toRemove) {
    _GotFocusListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler> _HandleCreatedListeners =
      new java.util.ArrayList<EventHandler>();

  public void addHandleCreated(EventHandler toAdd) {
    _HandleCreatedListeners.add(toAdd);
  }

  public void removeHandleCreated(EventHandler toRemove) {
    _HandleCreatedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler> _HandleDestroyedListeners =
      new java.util.ArrayList<EventHandler>();

  public void addHandleDestroyed(EventHandler toAdd) {
    _HandleDestroyedListeners.add(toAdd);
  }

  public void removeHandleDestroyed(EventHandler toRemove) {
    _HandleDestroyedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<HelpEventHandler> _HelpRequestedListeners =
      new java.util.ArrayList<HelpEventHandler>();

  public void addHelpRequested(HelpEventHandler toAdd) {
    _HelpRequestedListeners.add(toAdd);
  }

  public void removeHelpRequested(HelpEventHandler toRemove) {
    _HelpRequestedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler> _HideSelectionChangedListeners =
      new java.util.ArrayList<EventHandler>();

  public void addHideSelectionChanged(EventHandler toAdd) {
    _HideSelectionChangedListeners.add(toAdd);
  }

  public void removeHideSelectionChanged(EventHandler toRemove) {
    _HideSelectionChangedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler> _ImeModeChangedListeners =
      new java.util.ArrayList<EventHandler>();

  public void addImeModeChanged(EventHandler toAdd) {
    _ImeModeChangedListeners.add(toAdd);
  }

  public void removeImeModeChanged(EventHandler toRemove) {
    _ImeModeChangedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<InvalidateEventHandler> _InvalidatedListeners =
      new java.util.ArrayList<InvalidateEventHandler>();

  public void addInvalidated(InvalidateEventHandler toAdd) {
    _InvalidatedListeners.add(toAdd);
  }

  public void removeInvalidated(InvalidateEventHandler toRemove) {
    _InvalidatedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<KeyEventHandler> _KeyDownListeners =
      new java.util.ArrayList<KeyEventHandler>();

  public void addKeyDown(KeyEventHandler toAdd) {
    _KeyDownListeners.add(toAdd);
  }

  public void removeKeyDown(KeyEventHandler toRemove) {
    _KeyDownListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<KeyPressEventHandler> _KeyPressListeners =
      new java.util.ArrayList<KeyPressEventHandler>();

  public void addKeyPress(KeyPressEventHandler toAdd) {
    _KeyPressListeners.add(toAdd);
  }

  public void removeKeyPress(KeyPressEventHandler toRemove) {
    _KeyPressListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<KeyEventHandler> _KeyUpListeners =
      new java.util.ArrayList<KeyEventHandler>();

  public void addKeyUp(KeyEventHandler toAdd) {
    _KeyUpListeners.add(toAdd);
  }

  public void removeKeyUp(KeyEventHandler toRemove) {
    _KeyUpListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<LayoutEventHandler> _LayoutListeners =
      new java.util.ArrayList<LayoutEventHandler>();

  public void addLayout(LayoutEventHandler toAdd) {
    _LayoutListeners.add(toAdd);
  }

  public void removeLayout(LayoutEventHandler toRemove) {
    _LayoutListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler> _LeaveListeners =
      new java.util.ArrayList<EventHandler>();

  public void addLeave(EventHandler toAdd) {
    _LeaveListeners.add(toAdd);
  }

  public void removeLeave(EventHandler toRemove) {
    _LeaveListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler> _LocationChangedListeners =
      new java.util.ArrayList<EventHandler>();

  public void addLocationChanged(EventHandler toAdd) {
    _LocationChangedListeners.add(toAdd);
  }

  public void removeLocationChanged(EventHandler toRemove) {
    _LocationChangedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler> _LostFocusListeners =
      new java.util.ArrayList<EventHandler>();

  public void addLostFocus(EventHandler toAdd) {
    _LostFocusListeners.add(toAdd);
  }

  public void removeLostFocus(EventHandler toRemove) {
    _LostFocusListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler> _MarginChangedListeners =
      new java.util.ArrayList<EventHandler>();

  public void addMarginChanged(EventHandler toAdd) {
    _MarginChangedListeners.add(toAdd);
  }

  public void removeMarginChanged(EventHandler toRemove) {
    _MarginChangedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler> _ModifiedChangedListeners =
      new java.util.ArrayList<EventHandler>();

  public void addModifiedChanged(EventHandler toAdd) {
    _ModifiedChangedListeners.add(toAdd);
  }

  public void removeModifiedChanged(EventHandler toRemove) {
    _ModifiedChangedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler> _MouseCaptureChangedListeners =
      new java.util.ArrayList<EventHandler>();

  public void addMouseCaptureChanged(EventHandler toAdd) {
    _MouseCaptureChangedListeners.add(toAdd);
  }

  public void removeMouseCaptureChanged(EventHandler toRemove) {
    _MouseCaptureChangedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<MouseEventHandler> _MouseClickListeners =
      new java.util.ArrayList<MouseEventHandler>();

  public void addMouseClick(MouseEventHandler toAdd) {
    _MouseClickListeners.add(toAdd);
  }

  public void removeMouseClick(MouseEventHandler toRemove) {
    _MouseClickListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<MouseEventHandler> _MouseDoubleClickListeners =
      new java.util.ArrayList<MouseEventHandler>();

  public void addMouseDoubleClick(MouseEventHandler toAdd) {
    _MouseDoubleClickListeners.add(toAdd);
  }

  public void removeMouseDoubleClick(MouseEventHandler toRemove) {
    _MouseDoubleClickListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<MouseEventHandler> _MouseDownListeners =
      new java.util.ArrayList<MouseEventHandler>();

  public void addMouseDown(MouseEventHandler toAdd) {
    _MouseDownListeners.add(toAdd);
  }

  public void removeMouseDown(MouseEventHandler toRemove) {
    _MouseDownListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler> _MouseEnterListeners =
      new java.util.ArrayList<EventHandler>();

  public void addMouseEnter(EventHandler toAdd) {
    _MouseEnterListeners.add(toAdd);
  }

  public void removeMouseEnter(EventHandler toRemove) {
    _MouseEnterListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler> _MouseHoverListeners =
      new java.util.ArrayList<EventHandler>();

  public void addMouseHover(EventHandler toAdd) {
    _MouseHoverListeners.add(toAdd);
  }

  public void removeMouseHover(EventHandler toRemove) {
    _MouseHoverListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler> _MouseLeaveListeners =
      new java.util.ArrayList<EventHandler>();

  public void addMouseLeave(EventHandler toAdd) {
    _MouseLeaveListeners.add(toAdd);
  }

  public void removeMouseLeave(EventHandler toRemove) {
    _MouseLeaveListeners.remove(toRemove);
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
  /** Event */

  private java.util.ArrayList<MouseEventHandler> _MouseUpListeners =
      new java.util.ArrayList<MouseEventHandler>();

  public void addMouseUp(MouseEventHandler toAdd) {
    _MouseUpListeners.add(toAdd);
  }

  public void removeMouseUp(MouseEventHandler toRemove) {
    _MouseUpListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<MouseEventHandler> _MouseWheelListeners =
      new java.util.ArrayList<MouseEventHandler>();

  public void addMouseWheel(MouseEventHandler toAdd) {
    _MouseWheelListeners.add(toAdd);
  }

  public void removeMouseWheel(MouseEventHandler toRemove) {
    _MouseWheelListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler> _MoveListeners =
      new java.util.ArrayList<EventHandler>();

  public void addMove(EventHandler toAdd) {
    _MoveListeners.add(toAdd);
  }

  public void removeMove(EventHandler toRemove) {
    _MoveListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler> _MultilineChangedListeners =
      new java.util.ArrayList<EventHandler>();

  public void addMultilineChanged(EventHandler toAdd) {
    _MultilineChangedListeners.add(toAdd);
  }

  public void removeMultilineChanged(EventHandler toRemove) {
    _MultilineChangedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler> _PaddingChangedListeners =
      new java.util.ArrayList<EventHandler>();

  public void addPaddingChanged(EventHandler toAdd) {
    _PaddingChangedListeners.add(toAdd);
  }

  public void removePaddingChanged(EventHandler toRemove) {
    _PaddingChangedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<PaintEventHandler> _PaintListeners =
      new java.util.ArrayList<PaintEventHandler>();

  public void addPaint(PaintEventHandler toAdd) {
    _PaintListeners.add(toAdd);
  }

  public void removePaint(PaintEventHandler toRemove) {
    _PaintListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler> _ParentChangedListeners =
      new java.util.ArrayList<EventHandler>();

  public void addParentChanged(EventHandler toAdd) {
    _ParentChangedListeners.add(toAdd);
  }

  public void removeParentChanged(EventHandler toRemove) {
    _ParentChangedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<PreviewKeyDownEventHandler> _PreviewKeyDownListeners =
      new java.util.ArrayList<PreviewKeyDownEventHandler>();

  public void addPreviewKeyDown(PreviewKeyDownEventHandler toAdd) {
    _PreviewKeyDownListeners.add(toAdd);
  }

  public void removePreviewKeyDown(PreviewKeyDownEventHandler toRemove) {
    _PreviewKeyDownListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<QueryAccessibilityHelpEventHandler> _QueryAccessibilityHelpListeners =
      new java.util.ArrayList<QueryAccessibilityHelpEventHandler>();

  public void addQueryAccessibilityHelp(QueryAccessibilityHelpEventHandler toAdd) {
    _QueryAccessibilityHelpListeners.add(toAdd);
  }

  public void removeQueryAccessibilityHelp(QueryAccessibilityHelpEventHandler toRemove) {
    _QueryAccessibilityHelpListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<QueryContinueDragEventHandler> _QueryContinueDragListeners =
      new java.util.ArrayList<QueryContinueDragEventHandler>();

  public void addQueryContinueDrag(QueryContinueDragEventHandler toAdd) {
    _QueryContinueDragListeners.add(toAdd);
  }

  public void removeQueryContinueDrag(QueryContinueDragEventHandler toRemove) {
    _QueryContinueDragListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler> _ReadOnlyChangedListeners =
      new java.util.ArrayList<EventHandler>();

  public void addReadOnlyChanged(EventHandler toAdd) {
    _ReadOnlyChangedListeners.add(toAdd);
  }

  public void removeReadOnlyChanged(EventHandler toRemove) {
    _ReadOnlyChangedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler> _RegionChangedListeners =
      new java.util.ArrayList<EventHandler>();

  public void addRegionChanged(EventHandler toAdd) {
    _RegionChangedListeners.add(toAdd);
  }

  public void removeRegionChanged(EventHandler toRemove) {
    _RegionChangedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler> _ResizeListeners =
      new java.util.ArrayList<EventHandler>();

  public void addResize(EventHandler toAdd) {
    _ResizeListeners.add(toAdd);
  }

  public void removeResize(EventHandler toRemove) {
    _ResizeListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler> _RightToLeftChangedListeners =
      new java.util.ArrayList<EventHandler>();

  public void addRightToLeftChanged(EventHandler toAdd) {
    _RightToLeftChangedListeners.add(toAdd);
  }

  public void removeRightToLeftChanged(EventHandler toRemove) {
    _RightToLeftChangedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler> _SizeChangedListeners =
      new java.util.ArrayList<EventHandler>();

  public void addSizeChanged(EventHandler toAdd) {
    _SizeChangedListeners.add(toAdd);
  }

  public void removeSizeChanged(EventHandler toRemove) {
    _SizeChangedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler> _StyleChangedListeners =
      new java.util.ArrayList<EventHandler>();

  public void addStyleChanged(EventHandler toAdd) {
    _StyleChangedListeners.add(toAdd);
  }

  public void removeStyleChanged(EventHandler toRemove) {
    _StyleChangedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler> _SystemColorsChangedListeners =
      new java.util.ArrayList<EventHandler>();

  public void addSystemColorsChanged(EventHandler toAdd) {
    _SystemColorsChangedListeners.add(toAdd);
  }

  public void removeSystemColorsChanged(EventHandler toRemove) {
    _SystemColorsChangedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler> _TabIndexChangedListeners =
      new java.util.ArrayList<EventHandler>();

  public void addTabIndexChanged(EventHandler toAdd) {
    _TabIndexChangedListeners.add(toAdd);
  }

  public void removeTabIndexChanged(EventHandler toRemove) {
    _TabIndexChangedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler> _TabStopChangedListeners =
      new java.util.ArrayList<EventHandler>();

  public void addTabStopChanged(EventHandler toAdd) {
    _TabStopChangedListeners.add(toAdd);
  }

  public void removeTabStopChanged(EventHandler toRemove) {
    _TabStopChangedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler> _TextAlignChangedListeners =
      new java.util.ArrayList<EventHandler>();

  public void addTextAlignChanged(EventHandler toAdd) {
    _TextAlignChangedListeners.add(toAdd);
  }

  public void removeTextAlignChanged(EventHandler toRemove) {
    _TextAlignChangedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler> _TextChangedListeners =
      new java.util.ArrayList<EventHandler>();

  public void addTextChanged(EventHandler toAdd) {
    _TextChangedListeners.add(toAdd);
  }

  public void removeTextChanged(EventHandler toRemove) {
    _TextChangedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler> _ValidatedListeners =
      new java.util.ArrayList<EventHandler>();

  public void addValidated(EventHandler toAdd) {
    _ValidatedListeners.add(toAdd);
  }

  public void removeValidated(EventHandler toRemove) {
    _ValidatedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<CancelEventHandler> _ValidatingListeners =
      new java.util.ArrayList<CancelEventHandler>();

  public void addValidating(CancelEventHandler toAdd) {
    _ValidatingListeners.add(toAdd);
  }

  public void removeValidating(CancelEventHandler toRemove) {
    _ValidatingListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler> _VisibleChangedListeners =
      new java.util.ArrayList<EventHandler>();

  public void addVisibleChanged(EventHandler toAdd) {
    _VisibleChangedListeners.add(toAdd);
  }

  public void removeVisibleChanged(EventHandler toRemove) {
    _VisibleChangedListeners.remove(toRemove);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
