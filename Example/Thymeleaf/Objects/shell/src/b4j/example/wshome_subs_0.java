package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class wshome_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private ws As WebSocket";
wshome._ws = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket");__ref.setField("_ws",wshome._ws);
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (wshome) ","wshome",4,__ref.getField(false, "ba"),__ref,6);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "wshome","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 6;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(32);
 BA.debugLineNum = 8;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("WebSocket_Connected (wshome) ","wshome",4,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("websocket_connected")) { return __ref.runUserSub(false, "wshome","websocket_connected", __ref, _websocket1);}
Debug.locals.put("WebSocket1", _websocket1);
 BA.debugLineNum = 10;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
Debug.ShouldStop(512);
 BA.debugLineNum = 11;BA.debugLine="ws = WebSocket1";
Debug.ShouldStop(1024);
__ref.setField ("_ws" /*RemoteObject*/ ,_websocket1);
 BA.debugLineNum = 13;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("WebSocket_Disconnected (wshome) ","wshome",4,__ref.getField(false, "ba"),__ref,15);
if (RapidSub.canDelegate("websocket_disconnected")) { return __ref.runUserSub(false, "wshome","websocket_disconnected", __ref);}
 BA.debugLineNum = 15;BA.debugLine="Private Sub WebSocket_Disconnected";
Debug.ShouldStop(16384);
 BA.debugLineNum = 17;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}