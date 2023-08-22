package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class testobjectclass_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _handle(RemoteObject __ref,RemoteObject _req,RemoteObject _resp) throws Exception{
try {
		Debug.PushSubsStack("Handle (testobjectclass) ","testobjectclass",6,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("handle")) { return __ref.runUserSub(false, "testobjectclass","handle", __ref, _req, _resp);}
Debug.locals.put("req", _req);
Debug.locals.put("resp", _resp);
 BA.debugLineNum = 10;BA.debugLine="Sub Handle(req As ServletRequest, resp As ServletR";
Debug.ShouldStop(512);
 BA.debugLineNum = 12;BA.debugLine="req.GetSession.SetAttribute(\"user\", \"phamanhtuan\"";
Debug.ShouldStop(2048);
_req.runMethod(false,"GetSession").runVoidMethod ("SetAttribute",(Object)(BA.ObjectToString("user")),(Object)((RemoteObject.createImmutable("phamanhtuan"))));
 BA.debugLineNum = 13;BA.debugLine="req.GetSession.SetAttribute(\"pass\", \"12345678\")";
Debug.ShouldStop(4096);
_req.runMethod(false,"GetSession").runVoidMethod ("SetAttribute",(Object)(BA.ObjectToString("pass")),(Object)((RemoteObject.createImmutable("12345678"))));
 BA.debugLineNum = 14;BA.debugLine="resp.SendRedirect(req.FullRequestURI)";
Debug.ShouldStop(8192);
_resp.runVoidMethod ("SendRedirect",(Object)(_req.runMethod(true,"getFullRequestURI")));
 BA.debugLineNum = 15;BA.debugLine="Log(\"Redirect\")";
Debug.ShouldStop(16384);
testobjectclass.__c.runVoidMethod ("LogImpl","51638405",RemoteObject.createImmutable("Redirect"),0);
 BA.debugLineNum = 16;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (testobjectclass) ","testobjectclass",6,__ref.getField(false, "ba"),__ref,6);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "testobjectclass","initialize", __ref, _ba);}
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
}