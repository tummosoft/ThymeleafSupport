package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class guessmynumber_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _handle(RemoteObject __ref,RemoteObject _req,RemoteObject _resp) throws Exception{
try {
		Debug.PushSubsStack("Handle (guessmynumber) ","guessmynumber",2,__ref.getField(false, "ba"),__ref,9);
if (RapidSub.canDelegate("handle")) { return __ref.runUserSub(false, "guessmynumber","handle", __ref, _req, _resp);}
RemoteObject _mynumber = RemoteObject.createImmutable(0);
RemoteObject _n = RemoteObject.createImmutable("");
Debug.locals.put("req", _req);
Debug.locals.put("resp", _resp);
 BA.debugLineNum = 9;BA.debugLine="Sub Handle(req As ServletRequest, resp As ServletR";
Debug.ShouldStop(256);
 BA.debugLineNum = 10;BA.debugLine="Try";
Debug.ShouldStop(512);
try { BA.debugLineNum = 11;BA.debugLine="If req.GetSession.HasAttribute(\"myNumber\") = Fal";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_req.runMethod(false,"GetSession").runMethod(true,"HasAttribute",(Object)(RemoteObject.createImmutable("myNumber"))),guessmynumber.__c.getField(true,"False"))) { 
 BA.debugLineNum = 12;BA.debugLine="req.GetSession.SetAttribute(\"myNumber\", Rnd(0,";
Debug.ShouldStop(2048);
_req.runMethod(false,"GetSession").runVoidMethod ("SetAttribute",(Object)(BA.ObjectToString("myNumber")),(Object)((guessmynumber.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 101))))));
 };
 BA.debugLineNum = 14;BA.debugLine="Dim myNumber As Int = req.GetSession.GetAttribut";
Debug.ShouldStop(8192);
_mynumber = BA.numberCast(int.class, _req.runMethod(false,"GetSession").runMethod(false,"GetAttribute",(Object)(RemoteObject.createImmutable("myNumber"))));Debug.locals.put("myNumber", _mynumber);Debug.locals.put("myNumber", _mynumber);
 BA.debugLineNum = 15;BA.debugLine="Dim n As String = req.GetParameter(\"number\")";
Debug.ShouldStop(16384);
_n = _req.runMethod(true,"GetParameter",(Object)(RemoteObject.createImmutable("number")));Debug.locals.put("n", _n);Debug.locals.put("n", _n);
 BA.debugLineNum = 16;BA.debugLine="If IsNumber(n) = False Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",guessmynumber.__c.runMethod(true,"IsNumber",(Object)(_n)),guessmynumber.__c.getField(true,"False"))) { 
 BA.debugLineNum = 17;BA.debugLine="resp.Write(\"Please enter a valid number.\")";
Debug.ShouldStop(65536);
_resp.runVoidMethod ("Write",(Object)(RemoteObject.createImmutable("Please enter a valid number.")));
 }else {
 BA.debugLineNum = 19;BA.debugLine="If n > myNumber Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _n),BA.numberCast(double.class, _mynumber))) { 
 BA.debugLineNum = 20;BA.debugLine="resp.Write(\"My number is smaller.\")";
Debug.ShouldStop(524288);
_resp.runVoidMethod ("Write",(Object)(RemoteObject.createImmutable("My number is smaller.")));
 }else 
{ BA.debugLineNum = 21;BA.debugLine="Else If n < myNumber Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("<",BA.numberCast(double.class, _n),BA.numberCast(double.class, _mynumber))) { 
 BA.debugLineNum = 22;BA.debugLine="resp.Write(\"My number is larger.\")";
Debug.ShouldStop(2097152);
_resp.runVoidMethod ("Write",(Object)(RemoteObject.createImmutable("My number is larger.")));
 }else {
 BA.debugLineNum = 24;BA.debugLine="resp.Write(\"Well done!!!\")";
Debug.ShouldStop(8388608);
_resp.runVoidMethod ("Write",(Object)(RemoteObject.createImmutable("Well done!!!")));
 }}
;
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e19) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e19.toString()); BA.debugLineNum = 28;BA.debugLine="resp.SendError(500, \"error....\")";
Debug.ShouldStop(134217728);
_resp.runVoidMethodAndSync ("SendError",(Object)(BA.numberCast(int.class, 500)),(Object)(RemoteObject.createImmutable("error....")));
 };
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("Initialize (guessmynumber) ","guessmynumber",2,__ref.getField(false, "ba"),__ref,5);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "guessmynumber","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 5;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(16);
 BA.debugLineNum = 7;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}