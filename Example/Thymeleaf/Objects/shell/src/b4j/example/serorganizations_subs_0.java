package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class serorganizations_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Dim mysqlite As SQL";
serorganizations._mysqlite = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL");__ref.setField("_mysqlite",serorganizations._mysqlite);
 //BA.debugLineNum = 3;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _findbyid(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("FindByID (serorganizations) ","serorganizations",1,__ref.getField(false, "ba"),__ref,9);
if (RapidSub.canDelegate("findbyid")) { return __ref.runUserSub(false, "serorganizations","findbyid", __ref, _id);}
RemoteObject _kq = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cursor = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _rs = RemoteObject.declareNull("b4j.example.infodata");
Debug.locals.put("id", _id);
 BA.debugLineNum = 9;BA.debugLine="Public Sub FindByID(id As String) As List";
Debug.ShouldStop(256);
 BA.debugLineNum = 10;BA.debugLine="Dim kq As List";
Debug.ShouldStop(512);
_kq = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("kq", _kq);
 BA.debugLineNum = 11;BA.debugLine="kq.Initialize";
Debug.ShouldStop(1024);
_kq.runVoidMethod ("Initialize");
 BA.debugLineNum = 13;BA.debugLine="Dim Cursor As ResultSet";
Debug.ShouldStop(4096);
_cursor = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");Debug.locals.put("Cursor", _cursor);
 BA.debugLineNum = 14;BA.debugLine="Cursor = mysqlite.ExecQuery(\"SELECT * FROM organi";
Debug.ShouldStop(8192);
_cursor = __ref.getField(false,"_mysqlite" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM organizations")));Debug.locals.put("Cursor", _cursor);
 BA.debugLineNum = 15;BA.debugLine="Do While Cursor.NextRow";
Debug.ShouldStop(16384);
while (_cursor.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 16;BA.debugLine="Dim rs As infoData";
Debug.ShouldStop(32768);
_rs = RemoteObject.createNew ("b4j.example.infodata");Debug.locals.put("rs", _rs);
 BA.debugLineNum = 17;BA.debugLine="rs.Initialize";
Debug.ShouldStop(65536);
_rs.runClassMethod (b4j.example.infodata.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 18;BA.debugLine="rs.Name = Cursor.GetString(\"Name\")";
Debug.ShouldStop(131072);
_rs.runClassMethod (b4j.example.infodata.class, "_setname" /*RemoteObject*/ ,_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Name"))));
 BA.debugLineNum = 19;BA.debugLine="rs.xemail = Cursor.GetString(\"Website\")";
Debug.ShouldStop(262144);
_rs.setField ("_xemail" /*RemoteObject*/ ,_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Website"))));
 BA.debugLineNum = 21;BA.debugLine="kq.Add(rs)";
Debug.ShouldStop(1048576);
_kq.runVoidMethod ("Add",(Object)((_rs)));
 }
;
 BA.debugLineNum = 24;BA.debugLine="Return kq";
Debug.ShouldStop(8388608);
if (true) return _kq;
 BA.debugLineNum = 25;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (serorganizations) ","serorganizations",1,__ref.getField(false, "ba"),__ref,5);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "serorganizations","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 5;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(16);
 BA.debugLineNum = 6;BA.debugLine="mysqlite.InitializeSQLite(File.DirApp & \"\\www\", \"";
Debug.ShouldStop(32);
__ref.getField(false,"_mysqlite" /*RemoteObject*/ ).runVoidMethod ("InitializeSQLite",(Object)(RemoteObject.concat(serorganizations.__c.getField(false,"File").runMethod(true,"getDirApp"),RemoteObject.createImmutable("\\www"))),(Object)(BA.ObjectToString("database.db")),(Object)(serorganizations.__c.getField(true,"False")));
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