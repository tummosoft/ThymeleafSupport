package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class guessmynumber extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.guessmynumber", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.guessmynumber.class).invoke(this, new Object[] {null});
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
public b4j.example.main _main = null;
public String  _class_globals(b4j.example.guessmynumber __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="guessmynumber";
RDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=327681;
 //BA.debugLineNum = 327681;BA.debugLine="End Sub";
return "";
}
public String  _handle(b4j.example.guessmynumber __ref,anywheresoftware.b4j.object.JServlet.ServletRequestWrapper _req,anywheresoftware.b4j.object.JServlet.ServletResponseWrapper _resp) throws Exception{
__ref = this;
RDebugUtils.currentModule="guessmynumber";
if (Debug.shouldDelegate(ba, "handle", false))
	 {return ((String) Debug.delegate(ba, "handle", new Object[] {_req,_resp}));}
int _mynumber = 0;
String _n = "";
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Sub Handle(req As ServletRequest, resp As ServletR";
RDebugUtils.currentLine=458753;
 //BA.debugLineNum = 458753;BA.debugLine="Try";
try {RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="If req.GetSession.HasAttribute(\"myNumber\") = Fal";
if (_req.GetSession().HasAttribute("myNumber")==__c.False) { 
RDebugUtils.currentLine=458755;
 //BA.debugLineNum = 458755;BA.debugLine="req.GetSession.SetAttribute(\"myNumber\", Rnd(0,";
_req.GetSession().SetAttribute("myNumber",(Object)(__c.Rnd((int) (0),(int) (101))));
 };
RDebugUtils.currentLine=458757;
 //BA.debugLineNum = 458757;BA.debugLine="Dim myNumber As Int = req.GetSession.GetAttribut";
_mynumber = (int)(BA.ObjectToNumber(_req.GetSession().GetAttribute("myNumber")));
RDebugUtils.currentLine=458758;
 //BA.debugLineNum = 458758;BA.debugLine="Dim n As String = req.GetParameter(\"number\")";
_n = _req.GetParameter("number");
RDebugUtils.currentLine=458759;
 //BA.debugLineNum = 458759;BA.debugLine="If IsNumber(n) = False Then";
if (__c.IsNumber(_n)==__c.False) { 
RDebugUtils.currentLine=458760;
 //BA.debugLineNum = 458760;BA.debugLine="resp.Write(\"Please enter a valid number.\")";
_resp.Write("Please enter a valid number.");
 }else {
RDebugUtils.currentLine=458762;
 //BA.debugLineNum = 458762;BA.debugLine="If n > myNumber Then";
if ((double)(Double.parseDouble(_n))>_mynumber) { 
RDebugUtils.currentLine=458763;
 //BA.debugLineNum = 458763;BA.debugLine="resp.Write(\"My number is smaller.\")";
_resp.Write("My number is smaller.");
 }else 
{RDebugUtils.currentLine=458764;
 //BA.debugLineNum = 458764;BA.debugLine="Else If n < myNumber Then";
if ((double)(Double.parseDouble(_n))<_mynumber) { 
RDebugUtils.currentLine=458765;
 //BA.debugLineNum = 458765;BA.debugLine="resp.Write(\"My number is larger.\")";
_resp.Write("My number is larger.");
 }else {
RDebugUtils.currentLine=458767;
 //BA.debugLineNum = 458767;BA.debugLine="resp.Write(\"Well done!!!\")";
_resp.Write("Well done!!!");
 }}
;
 };
 } 
       catch (Exception e19) {
			ba.setLastException(e19);RDebugUtils.currentLine=458771;
 //BA.debugLineNum = 458771;BA.debugLine="resp.SendError(500, \"error....\")";
_resp.SendError((int) (500),"error....");
 };
RDebugUtils.currentLine=458773;
 //BA.debugLineNum = 458773;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.guessmynumber __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="guessmynumber";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="End Sub";
return "";
}
}