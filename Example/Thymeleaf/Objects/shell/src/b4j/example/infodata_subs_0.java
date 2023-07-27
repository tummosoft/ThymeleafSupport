package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class infodata_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Dim xname As String";
infodata._xname = RemoteObject.createImmutable("");__ref.setField("_xname",infodata._xname);
 //BA.debugLineNum = 3;BA.debugLine="Dim xemail As String";
infodata._xemail = RemoteObject.createImmutable("");__ref.setField("_xemail",infodata._xemail);
 //BA.debugLineNum = 4;BA.debugLine="Dim xage As String";
infodata._xage = RemoteObject.createImmutable("");__ref.setField("_xage",infodata._xage);
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _getage(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getAge (infodata) ","infodata",3,__ref.getField(false, "ba"),__ref,25);
if (RapidSub.canDelegate("getage")) { return __ref.runUserSub(false, "infodata","getage", __ref);}
 BA.debugLineNum = 25;BA.debugLine="Public Sub getAge() As String";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 26;BA.debugLine="Return xage";
Debug.ShouldStop(33554432);
if (true) return __ref.getField(true,"_xage" /*RemoteObject*/ );
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getname(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getName (infodata) ","infodata",3,__ref.getField(false, "ba"),__ref,17);
if (RapidSub.canDelegate("getname")) { return __ref.runUserSub(false, "infodata","getname", __ref);}
 BA.debugLineNum = 17;BA.debugLine="Public Sub getName() As String";
Debug.ShouldStop(65536);
 BA.debugLineNum = 18;BA.debugLine="Return xname";
Debug.ShouldStop(131072);
if (true) return __ref.getField(true,"_xname" /*RemoteObject*/ );
 BA.debugLineNum = 19;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("Initialize (infodata) ","infodata",3,__ref.getField(false, "ba"),__ref,7);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "infodata","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 7;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(64);
 BA.debugLineNum = 8;BA.debugLine="xname = \"\"";
Debug.ShouldStop(128);
__ref.setField ("_xname" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 9;BA.debugLine="xemail = \"\"";
Debug.ShouldStop(256);
__ref.setField ("_xemail" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 10;BA.debugLine="xage = \"\"";
Debug.ShouldStop(512);
__ref.setField ("_xage" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 11;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _roles(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Roles (infodata) ","infodata",3,__ref.getField(false, "ba"),__ref,33);
if (RapidSub.canDelegate("roles")) { return __ref.runUserSub(false, "infodata","roles", __ref);}
 BA.debugLineNum = 33;BA.debugLine="Public Sub Roles() As String";
Debug.ShouldStop(1);
 BA.debugLineNum = 34;BA.debugLine="Return \"775\"";
Debug.ShouldStop(2);
if (true) return BA.ObjectToString("775");
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setage(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("setAge (infodata) ","infodata",3,__ref.getField(false, "ba"),__ref,21);
if (RapidSub.canDelegate("setage")) { return __ref.runUserSub(false, "infodata","setage", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 21;BA.debugLine="Public Sub setAge(value As String)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 22;BA.debugLine="xage = value";
Debug.ShouldStop(2097152);
__ref.setField ("_xage" /*RemoteObject*/ ,_value);
 BA.debugLineNum = 23;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setname(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("setName (infodata) ","infodata",3,__ref.getField(false, "ba"),__ref,13);
if (RapidSub.canDelegate("setname")) { return __ref.runUserSub(false, "infodata","setname", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 13;BA.debugLine="Public Sub setName(value As String)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 14;BA.debugLine="xname = value";
Debug.ShouldStop(8192);
__ref.setField ("_xname" /*RemoteObject*/ ,_value);
 BA.debugLineNum = 15;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _user(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("User (infodata) ","infodata",3,__ref.getField(false, "ba"),__ref,29);
if (RapidSub.canDelegate("user")) { return __ref.runUserSub(false, "infodata","user", __ref);}
 BA.debugLineNum = 29;BA.debugLine="Public Sub User() As String";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 30;BA.debugLine="Return \"BAJ\"";
Debug.ShouldStop(536870912);
if (true) return BA.ObjectToString("BAJ");
 BA.debugLineNum = 31;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}