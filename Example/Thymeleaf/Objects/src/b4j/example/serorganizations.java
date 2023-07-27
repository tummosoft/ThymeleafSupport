package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class serorganizations extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.serorganizations", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.serorganizations.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4j.objects.SQL _mysqlite = null;
public b4j.example.main _main = null;
public String  _class_globals(b4j.example.serorganizations __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="serorganizations";
RDebugUtils.currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=131073;
 //BA.debugLineNum = 131073;BA.debugLine="Dim mysqlite As SQL";
_mysqlite = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=131074;
 //BA.debugLineNum = 131074;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _findbyid(b4j.example.serorganizations __ref,String _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="serorganizations";
if (Debug.shouldDelegate(ba, "findbyid", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "findbyid", new Object[] {_id}));}
anywheresoftware.b4a.objects.collections.List _kq = null;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _cursor = null;
b4j.example.infodata _rs = null;
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Public Sub FindByID(id As String) As List";
RDebugUtils.currentLine=262145;
 //BA.debugLineNum = 262145;BA.debugLine="Dim kq As List";
_kq = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=262146;
 //BA.debugLineNum = 262146;BA.debugLine="kq.Initialize";
_kq.Initialize();
RDebugUtils.currentLine=262148;
 //BA.debugLineNum = 262148;BA.debugLine="Dim Cursor As ResultSet";
_cursor = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=262149;
 //BA.debugLineNum = 262149;BA.debugLine="Cursor = mysqlite.ExecQuery(\"SELECT * FROM organi";
_cursor = __ref._mysqlite /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("SELECT * FROM organizations");
RDebugUtils.currentLine=262150;
 //BA.debugLineNum = 262150;BA.debugLine="Do While Cursor.NextRow";
while (_cursor.NextRow()) {
RDebugUtils.currentLine=262151;
 //BA.debugLineNum = 262151;BA.debugLine="Dim rs As infoData";
_rs = new b4j.example.infodata();
RDebugUtils.currentLine=262152;
 //BA.debugLineNum = 262152;BA.debugLine="rs.Initialize";
_rs._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=262153;
 //BA.debugLineNum = 262153;BA.debugLine="rs.Name = Cursor.GetString(\"Name\")";
_rs._setname /*String*/ (null,_cursor.GetString("Name"));
RDebugUtils.currentLine=262154;
 //BA.debugLineNum = 262154;BA.debugLine="rs.xemail = Cursor.GetString(\"Website\")";
_rs._xemail /*String*/  = _cursor.GetString("Website");
RDebugUtils.currentLine=262156;
 //BA.debugLineNum = 262156;BA.debugLine="kq.Add(rs)";
_kq.Add((Object)(_rs));
 }
;
RDebugUtils.currentLine=262159;
 //BA.debugLineNum = 262159;BA.debugLine="Return kq";
if (true) return _kq;
RDebugUtils.currentLine=262160;
 //BA.debugLineNum = 262160;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4j.example.serorganizations __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="serorganizations";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=196609;
 //BA.debugLineNum = 196609;BA.debugLine="mysqlite.InitializeSQLite(File.DirApp & \"\\www\", \"";
__ref._mysqlite /*anywheresoftware.b4j.objects.SQL*/ .InitializeSQLite(__c.File.getDirApp()+"\\www","database.db",__c.False);
RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="End Sub";
return "";
}
}