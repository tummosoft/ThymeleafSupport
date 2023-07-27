package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class infodata extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.infodata", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.infodata.class).invoke(this, new Object[] {null});
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
public String _xname = "";
public String _xemail = "";
public String _xage = "";
public b4j.example.main _main = null;
public String  _initialize(b4j.example.infodata __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="infodata";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="xname = \"\"";
__ref._xname /*String*/  = "";
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="xemail = \"\"";
__ref._xemail /*String*/  = "";
RDebugUtils.currentLine=589827;
 //BA.debugLineNum = 589827;BA.debugLine="xage = \"\"";
__ref._xage /*String*/  = "";
RDebugUtils.currentLine=589828;
 //BA.debugLineNum = 589828;BA.debugLine="End Sub";
return "";
}
public String  _setname(b4j.example.infodata __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="infodata";
if (Debug.shouldDelegate(ba, "setname", false))
	 {return ((String) Debug.delegate(ba, "setname", new Object[] {_value}));}
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Public Sub setName(value As String)";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="xname = value";
__ref._xname /*String*/  = _value;
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="End Sub";
return "";
}
public String  _user(b4j.example.infodata __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="infodata";
if (Debug.shouldDelegate(ba, "user", false))
	 {return ((String) Debug.delegate(ba, "user", null));}
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Public Sub User() As String";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="Return \"BAJ\"";
if (true) return "BAJ";
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="End Sub";
return "";
}
public String  _roles(b4j.example.infodata __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="infodata";
if (Debug.shouldDelegate(ba, "roles", false))
	 {return ((String) Debug.delegate(ba, "roles", null));}
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Public Sub Roles() As String";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="Return \"775\"";
if (true) return "775";
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.infodata __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="infodata";
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=524289;
 //BA.debugLineNum = 524289;BA.debugLine="Dim xname As String";
_xname = "";
RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="Dim xemail As String";
_xemail = "";
RDebugUtils.currentLine=524291;
 //BA.debugLineNum = 524291;BA.debugLine="Dim xage As String";
_xage = "";
RDebugUtils.currentLine=524292;
 //BA.debugLineNum = 524292;BA.debugLine="End Sub";
return "";
}
public String  _getage(b4j.example.infodata __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="infodata";
if (Debug.shouldDelegate(ba, "getage", false))
	 {return ((String) Debug.delegate(ba, "getage", null));}
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Public Sub getAge() As String";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="Return xage";
if (true) return __ref._xage /*String*/ ;
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="End Sub";
return "";
}
public String  _getname(b4j.example.infodata __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="infodata";
if (Debug.shouldDelegate(ba, "getname", false))
	 {return ((String) Debug.delegate(ba, "getname", null));}
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Public Sub getName() As String";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="Return xname";
if (true) return __ref._xname /*String*/ ;
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="End Sub";
return "";
}
public String  _setage(b4j.example.infodata __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="infodata";
if (Debug.shouldDelegate(ba, "setage", false))
	 {return ((String) Debug.delegate(ba, "setage", new Object[] {_value}));}
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Public Sub setAge(value As String)";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="xage = value";
__ref._xage /*String*/  = _value;
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="End Sub";
return "";
}
}