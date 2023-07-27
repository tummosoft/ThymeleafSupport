package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wshome extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.wshome", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wshome.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.object.WebSocket _ws = null;
public b4j.example.main _main = null;
public String  _class_globals(b4j.example.wshome __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="wshome";
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="Private ws As WebSocket";
_ws = new anywheresoftware.b4j.object.WebSocket();
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.wshome __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="wshome";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="End Sub";
return "";
}
public String  _websocket_connected(b4j.example.wshome __ref,anywheresoftware.b4j.object.WebSocket _websocket1) throws Exception{
__ref = this;
RDebugUtils.currentModule="wshome";
if (Debug.shouldDelegate(ba, "websocket_connected", false))
	 {return ((String) Debug.delegate(ba, "websocket_connected", new Object[] {_websocket1}));}
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="ws = WebSocket1";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/  = _websocket1;
RDebugUtils.currentLine=1179651;
 //BA.debugLineNum = 1179651;BA.debugLine="End Sub";
return "";
}
public String  _websocket_disconnected(b4j.example.wshome __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="wshome";
if (Debug.shouldDelegate(ba, "websocket_disconnected", false))
	 {return ((String) Debug.delegate(ba, "websocket_disconnected", null));}
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Private Sub WebSocket_Disconnected";
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="End Sub";
return "";
}
}