package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class wsguessmynumber_subs_0 {


public static RemoteObject  _btnguess_click(RemoteObject __ref,RemoteObject _params) throws Exception{
try {
		Debug.PushSubsStack("btnGuess_Click (wsguessmynumber) ","wsguessmynumber",4,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("btnguess_click")) { return __ref.runUserSub(false, "wsguessmynumber","btnguess_click", __ref, _params);}
RemoteObject _s = RemoteObject.createImmutable(0L);
RemoteObject _number = RemoteObject.createImmutable("");
RemoteObject _n = RemoteObject.createImmutable(0);
Debug.locals.put("Params", _params);
 BA.debugLineNum = 26;BA.debugLine="Sub btnGuess_Click (Params As Map)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 27;BA.debugLine="Log(ws.Secure)";
Debug.ShouldStop(67108864);
wsguessmynumber.__c.runVoidMethod ("LogImpl","0983041",BA.ObjectToString(__ref.getField(false,"_ws" /*RemoteObject*/ ).runMethod(true,"getSecure")),0);
 BA.debugLineNum = 28;BA.debugLine="Dim s As Long = DateTime.Now";
Debug.ShouldStop(134217728);
_s = wsguessmynumber.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("s", _s);Debug.locals.put("s", _s);
 BA.debugLineNum = 29;BA.debugLine="Dim number As String = TxtNumber.GetVal.Value";
Debug.ShouldStop(268435456);
_number = BA.ObjectToString(__ref.getField(false,"_txtnumber" /*RemoteObject*/ ).runMethod(false,"GetVal").runMethod(false,"getValue"));Debug.locals.put("number", _number);Debug.locals.put("number", _number);
 BA.debugLineNum = 30;BA.debugLine="If IsNumber(number) Then";
Debug.ShouldStop(536870912);
if (wsguessmynumber.__c.runMethod(true,"IsNumber",(Object)(_number)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 31;BA.debugLine="Dim n As Int = number";
Debug.ShouldStop(1073741824);
_n = BA.numberCast(int.class, _number);Debug.locals.put("n", _n);Debug.locals.put("n", _n);
 BA.debugLineNum = 32;BA.debugLine="If n > myNumber Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean(">",_n,BA.numberCast(double.class, __ref.getField(true,"_mynumber" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 33;BA.debugLine="Result.SetHtml(\"My number is smaller.\")";
Debug.ShouldStop(1);
__ref.getField(false,"_result" /*RemoteObject*/ ).runVoidMethod ("SetHtml",(Object)(RemoteObject.createImmutable("My number is smaller.")));
 }else 
{ BA.debugLineNum = 34;BA.debugLine="Else If n < myNumber Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("<",_n,BA.numberCast(double.class, __ref.getField(true,"_mynumber" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 35;BA.debugLine="Result.SetHtml(\"My number is larger.\")";
Debug.ShouldStop(4);
__ref.getField(false,"_result" /*RemoteObject*/ ).runVoidMethod ("SetHtml",(Object)(RemoteObject.createImmutable("My number is larger.")));
 }else {
 BA.debugLineNum = 37;BA.debugLine="Result.SetHtml(\"<b>Well done!!!</b>\")";
Debug.ShouldStop(16);
__ref.getField(false,"_result" /*RemoteObject*/ ).runVoidMethod ("SetHtml",(Object)(RemoteObject.createImmutable("<b>Well done!!!</b>")));
 }}
;
 }else {
 BA.debugLineNum = 40;BA.debugLine="Result.SetHtml(\"Please enter a valid number.\")";
Debug.ShouldStop(128);
__ref.getField(false,"_result" /*RemoteObject*/ ).runVoidMethod ("SetHtml",(Object)(RemoteObject.createImmutable("Please enter a valid number.")));
 };
 BA.debugLineNum = 42;BA.debugLine="TxtNumber.RunMethod(\"select\", Null)";
Debug.ShouldStop(512);
__ref.getField(false,"_txtnumber" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("select")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), wsguessmynumber.__c.getField(false,"Null")));
 BA.debugLineNum = 43;BA.debugLine="Log(ws.UpgradeRequest.RemoteAddress & \": \" & (Dat";
Debug.ShouldStop(1024);
wsguessmynumber.__c.runVoidMethod ("LogImpl","0983057",RemoteObject.concat(__ref.getField(false,"_ws" /*RemoteObject*/ ).runMethod(false,"getUpgradeRequest").runMethod(true,"getRemoteAddress"),RemoteObject.createImmutable(": "),(RemoteObject.solve(new RemoteObject[] {wsguessmynumber.__c.getField(false,"DateTime").runMethod(true,"getNow"),_s}, "-",1, 2))),0);
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnreset_click(RemoteObject __ref,RemoteObject _params) throws Exception{
try {
		Debug.PushSubsStack("btnReset_Click (wsguessmynumber) ","wsguessmynumber",4,__ref.getField(false, "ba"),__ref,57);
if (RapidSub.canDelegate("btnreset_click")) { return __ref.runUserSub(false, "wsguessmynumber","btnreset_click", __ref, _params);}
Debug.locals.put("Params", _params);
 BA.debugLineNum = 57;BA.debugLine="Sub btnReset_Click (Params As Map)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 58;BA.debugLine="myNumber = Rnd(1, 101)";
Debug.ShouldStop(33554432);
__ref.setField ("_mynumber" /*RemoteObject*/ ,wsguessmynumber.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 101))));
 BA.debugLineNum = 59;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private ws As WebSocket";
wsguessmynumber._ws = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket");__ref.setField("_ws",wsguessmynumber._ws);
 //BA.debugLineNum = 4;BA.debugLine="Private myNumber As Int";
wsguessmynumber._mynumber = RemoteObject.createImmutable(0);__ref.setField("_mynumber",wsguessmynumber._mynumber);
 //BA.debugLineNum = 5;BA.debugLine="Private timer1 As Timer";
wsguessmynumber._timer1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");__ref.setField("_timer1",wsguessmynumber._timer1);
 //BA.debugLineNum = 7;BA.debugLine="Private TxtNumber As JQueryElement 'matches an el";
wsguessmynumber._txtnumber = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_txtnumber",wsguessmynumber._txtnumber);
 //BA.debugLineNum = 8;BA.debugLine="Private Result As JQueryElement";
wsguessmynumber._result = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_result",wsguessmynumber._result);
 //BA.debugLineNum = 9;BA.debugLine="Private ServerTime As JQueryElement";
wsguessmynumber._servertime = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_servertime",wsguessmynumber._servertime);
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (wsguessmynumber) ","wsguessmynumber",4,__ref.getField(false, "ba"),__ref,12);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "wsguessmynumber","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(2048);
 BA.debugLineNum = 13;BA.debugLine="myNumber = Rnd(1, 101)";
Debug.ShouldStop(4096);
__ref.setField ("_mynumber" /*RemoteObject*/ ,wsguessmynumber.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 101))));
 BA.debugLineNum = 14;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _timer1_tick(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Timer1_Tick (wsguessmynumber) ","wsguessmynumber",4,__ref.getField(false, "ba"),__ref,46);
if (RapidSub.canDelegate("timer1_tick")) { return __ref.runUserSub(false, "wsguessmynumber","timer1_tick", __ref);}
 BA.debugLineNum = 46;BA.debugLine="Sub Timer1_Tick";
Debug.ShouldStop(8192);
 BA.debugLineNum = 47;BA.debugLine="ServerTime.SetHtml(\"Server time: \" & DateTime.Tim";
Debug.ShouldStop(16384);
__ref.getField(false,"_servertime" /*RemoteObject*/ ).runVoidMethod ("SetHtml",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Server time: "),wsguessmynumber.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(wsguessmynumber.__c.getField(false,"DateTime").runMethod(true,"getNow"))))));
 BA.debugLineNum = 48;BA.debugLine="ws.Flush 'required here as this is a server event";
Debug.ShouldStop(32768);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Flush");
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _txtnumber_keyup(RemoteObject __ref,RemoteObject _params) throws Exception{
try {
		Debug.PushSubsStack("txtNumber_KeyUp (wsguessmynumber) ","wsguessmynumber",4,__ref.getField(false, "ba"),__ref,51);
if (RapidSub.canDelegate("txtnumber_keyup")) { return __ref.runUserSub(false, "wsguessmynumber","txtnumber_keyup", __ref, _params);}
Debug.locals.put("Params", _params);
 BA.debugLineNum = 51;BA.debugLine="Sub txtNumber_KeyUp(Params As Map)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 52;BA.debugLine="If 13 = Params.Get(\"which\") Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(13),BA.numberCast(double.class, _params.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("which"))))))) { 
 BA.debugLineNum = 53;BA.debugLine="btnGuess_Click (Null)";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4j.example.wsguessmynumber.class, "_btnguess_click" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), wsguessmynumber.__c.getField(false,"Null")));
 };
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _websocket_connected(RemoteObject __ref,RemoteObject _websocket1) throws Exception{
try {
		Debug.PushSubsStack("WebSocket_Connected (wsguessmynumber) ","wsguessmynumber",4,__ref.getField(false, "ba"),__ref,16);
if (RapidSub.canDelegate("websocket_connected")) { return __ref.runUserSub(false, "wsguessmynumber","websocket_connected", __ref, _websocket1);}
Debug.locals.put("WebSocket1", _websocket1);
 BA.debugLineNum = 16;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
Debug.ShouldStop(32768);
 BA.debugLineNum = 17;BA.debugLine="ws = WebSocket1";
Debug.ShouldStop(65536);
__ref.setField ("_ws" /*RemoteObject*/ ,_websocket1);
 BA.debugLineNum = 18;BA.debugLine="timer1.Initialize(\"timer1\", 1000)";
Debug.ShouldStop(131072);
__ref.getField(false,"_timer1" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("timer1")),(Object)(BA.numberCast(long.class, 1000)));
 BA.debugLineNum = 19;BA.debugLine="timer1.Enabled = True";
Debug.ShouldStop(262144);
__ref.getField(false,"_timer1" /*RemoteObject*/ ).runMethod(true,"setEnabled",wsguessmynumber.__c.getField(true,"True"));
 BA.debugLineNum = 20;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _websocket_disconnected(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("WebSocket_Disconnected (wsguessmynumber) ","wsguessmynumber",4,__ref.getField(false, "ba"),__ref,22);
if (RapidSub.canDelegate("websocket_disconnected")) { return __ref.runUserSub(false, "wsguessmynumber","websocket_disconnected", __ref);}
 BA.debugLineNum = 22;BA.debugLine="Private Sub WebSocket_Disconnected";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 23;BA.debugLine="timer1.Enabled = False";
Debug.ShouldStop(4194304);
__ref.getField(false,"_timer1" /*RemoteObject*/ ).runMethod(true,"setEnabled",wsguessmynumber.__c.getField(true,"False"));
 BA.debugLineNum = 24;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}