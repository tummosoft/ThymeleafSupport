package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wsguessmynumber extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.wsguessmynumber", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.wsguessmynumber.class).invoke(this, new Object[] {null});
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
public int _mynumber = 0;
public anywheresoftware.b4a.objects.Timer _timer1 = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _txtnumber = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _result = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _servertime = null;
public b4j.example.main _main = null;
public String  _btnguess_click(b4j.example.wsguessmynumber __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="wsguessmynumber";
if (Debug.shouldDelegate(ba, "btnguess_click", false))
	 {return ((String) Debug.delegate(ba, "btnguess_click", new Object[] {_params}));}
long _s = 0L;
String _number = "";
int _n = 0;
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Sub btnGuess_Click (Params As Map)";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="Log(ws.Secure)";
__c.LogImpl("0983041",BA.ObjectToString(__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getSecure()),0);
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="Dim s As Long = DateTime.Now";
_s = __c.DateTime.getNow();
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="Dim number As String = TxtNumber.GetVal.Value";
_number = BA.ObjectToString(__ref._txtnumber /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .GetVal().getValue());
RDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="If IsNumber(number) Then";
if (__c.IsNumber(_number)) { 
RDebugUtils.currentLine=983045;
 //BA.debugLineNum = 983045;BA.debugLine="Dim n As Int = number";
_n = (int)(Double.parseDouble(_number));
RDebugUtils.currentLine=983046;
 //BA.debugLineNum = 983046;BA.debugLine="If n > myNumber Then";
if (_n>__ref._mynumber /*int*/ ) { 
RDebugUtils.currentLine=983047;
 //BA.debugLineNum = 983047;BA.debugLine="Result.SetHtml(\"My number is smaller.\")";
__ref._result /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml("My number is smaller.");
 }else 
{RDebugUtils.currentLine=983048;
 //BA.debugLineNum = 983048;BA.debugLine="Else If n < myNumber Then";
if (_n<__ref._mynumber /*int*/ ) { 
RDebugUtils.currentLine=983049;
 //BA.debugLineNum = 983049;BA.debugLine="Result.SetHtml(\"My number is larger.\")";
__ref._result /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml("My number is larger.");
 }else {
RDebugUtils.currentLine=983051;
 //BA.debugLineNum = 983051;BA.debugLine="Result.SetHtml(\"<b>Well done!!!</b>\")";
__ref._result /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml("<b>Well done!!!</b>");
 }}
;
 }else {
RDebugUtils.currentLine=983054;
 //BA.debugLineNum = 983054;BA.debugLine="Result.SetHtml(\"Please enter a valid number.\")";
__ref._result /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml("Please enter a valid number.");
 };
RDebugUtils.currentLine=983056;
 //BA.debugLineNum = 983056;BA.debugLine="TxtNumber.RunMethod(\"select\", Null)";
__ref._txtnumber /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .RunMethod("select",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
RDebugUtils.currentLine=983057;
 //BA.debugLineNum = 983057;BA.debugLine="Log(ws.UpgradeRequest.RemoteAddress & \": \" & (Dat";
__c.LogImpl("0983057",__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .getUpgradeRequest().getRemoteAddress()+": "+BA.NumberToString((__c.DateTime.getNow()-_s)),0);
RDebugUtils.currentLine=983058;
 //BA.debugLineNum = 983058;BA.debugLine="End Sub";
return "";
}
public String  _btnreset_click(b4j.example.wsguessmynumber __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="wsguessmynumber";
if (Debug.shouldDelegate(ba, "btnreset_click", false))
	 {return ((String) Debug.delegate(ba, "btnreset_click", new Object[] {_params}));}
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Sub btnReset_Click (Params As Map)";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="myNumber = Rnd(1, 101)";
__ref._mynumber /*int*/  = __c.Rnd((int) (1),(int) (101));
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.wsguessmynumber __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="wsguessmynumber";
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="Private ws As WebSocket";
_ws = new anywheresoftware.b4j.object.WebSocket();
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="Private myNumber As Int";
_mynumber = 0;
RDebugUtils.currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="Private timer1 As Timer";
_timer1 = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=720901;
 //BA.debugLineNum = 720901;BA.debugLine="Private TxtNumber As JQueryElement 'matches an el";
_txtnumber = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=720902;
 //BA.debugLineNum = 720902;BA.debugLine="Private Result As JQueryElement";
_result = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=720903;
 //BA.debugLineNum = 720903;BA.debugLine="Private ServerTime As JQueryElement";
_servertime = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=720904;
 //BA.debugLineNum = 720904;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.wsguessmynumber __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="wsguessmynumber";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="myNumber = Rnd(1, 101)";
__ref._mynumber /*int*/  = __c.Rnd((int) (1),(int) (101));
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="End Sub";
return "";
}
public String  _timer1_tick(b4j.example.wsguessmynumber __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="wsguessmynumber";
if (Debug.shouldDelegate(ba, "timer1_tick", false))
	 {return ((String) Debug.delegate(ba, "timer1_tick", null));}
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Sub Timer1_Tick";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="ServerTime.SetHtml(\"Server time: \" & DateTime.Tim";
__ref._servertime /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml("Server time: "+__c.DateTime.Time(__c.DateTime.getNow()));
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="ws.Flush 'required here as this is a server event";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Flush();
RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="End Sub";
return "";
}
public String  _txtnumber_keyup(b4j.example.wsguessmynumber __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="wsguessmynumber";
if (Debug.shouldDelegate(ba, "txtnumber_keyup", false))
	 {return ((String) Debug.delegate(ba, "txtnumber_keyup", new Object[] {_params}));}
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Sub txtNumber_KeyUp(Params As Map)";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="If 13 = Params.Get(\"which\") Then";
if (13==(double)(BA.ObjectToNumber(_params.Get((Object)("which"))))) { 
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="btnGuess_Click (Null)";
__ref._btnguess_click /*String*/ (null,(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__c.Null)));
 };
RDebugUtils.currentLine=1114116;
 //BA.debugLineNum = 1114116;BA.debugLine="End Sub";
return "";
}
public String  _websocket_connected(b4j.example.wsguessmynumber __ref,anywheresoftware.b4j.object.WebSocket _websocket1) throws Exception{
__ref = this;
RDebugUtils.currentModule="wsguessmynumber";
if (Debug.shouldDelegate(ba, "websocket_connected", false))
	 {return ((String) Debug.delegate(ba, "websocket_connected", new Object[] {_websocket1}));}
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="ws = WebSocket1";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/  = _websocket1;
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="timer1.Initialize(\"timer1\", 1000)";
__ref._timer1 /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"timer1",(long) (1000));
RDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="timer1.Enabled = True";
__ref._timer1 /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=851972;
 //BA.debugLineNum = 851972;BA.debugLine="End Sub";
return "";
}
public String  _websocket_disconnected(b4j.example.wsguessmynumber __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="wsguessmynumber";
if (Debug.shouldDelegate(ba, "websocket_disconnected", false))
	 {return ((String) Debug.delegate(ba, "websocket_disconnected", null));}
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Private Sub WebSocket_Disconnected";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="timer1.Enabled = False";
__ref._timer1 /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="End Sub";
return "";
}
}