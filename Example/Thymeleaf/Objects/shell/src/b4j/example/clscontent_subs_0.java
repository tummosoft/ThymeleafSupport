package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class clscontent_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _footer(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Footer (clscontent) ","clscontent",5,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("footer")) { return __ref.runUserSub(false, "clscontent","footer", __ref);}
 BA.debugLineNum = 10;BA.debugLine="Public Sub Footer() As String";
Debug.ShouldStop(512);
 BA.debugLineNum = 11;BA.debugLine="Return $\"<div class=\"footer\">This is a footer</di";
Debug.ShouldStop(1024);
if (true) return (RemoteObject.createImmutable("<div class=\"footer\">This is a footer</div>"));
 BA.debugLineNum = 12;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("Initialize (clscontent) ","clscontent",5,__ref.getField(false, "ba"),__ref,6);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "clscontent","initialize", __ref, _ba);}
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