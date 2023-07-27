package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class testobjectclass extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.testobjectclass", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.testobjectclass.class).invoke(this, new Object[] {null});
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
public String  _class_globals(b4j.example.testobjectclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="testobjectclass";
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="End Sub";
return "";
}
public String  _handle(b4j.example.testobjectclass __ref,anywheresoftware.b4j.object.JServlet.ServletRequestWrapper _req,anywheresoftware.b4j.object.JServlet.ServletResponseWrapper _resp) throws Exception{
__ref = this;
RDebugUtils.currentModule="testobjectclass";
if (Debug.shouldDelegate(ba, "handle", false))
	 {return ((String) Debug.delegate(ba, "handle", new Object[] {_req,_resp}));}
com.tummosoft.ThymeleafSupport _thymeleaf = null;
String _thymeleaftemplate = "";
String _html = "";
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Sub Handle(req As ServletRequest, resp As ServletR";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="Dim Thymeleaf As ThymeleafSupport";
_thymeleaf = new com.tummosoft.ThymeleafSupport();
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="Dim ThymeleafTemplate As String = File.Combine(Fi";
_thymeleaftemplate = __c.File.Combine(__c.File.getDirApp()+"/www/templates","");
RDebugUtils.currentLine=1638404;
 //BA.debugLineNum = 1638404;BA.debugLine="Thymeleaf.Initialize";
_thymeleaf.Initialize();
RDebugUtils.currentLine=1638405;
 //BA.debugLineNum = 1638405;BA.debugLine="Thymeleaf.Encoding = \"UTF-8\"";
_thymeleaf.setEncoding("UTF-8");
RDebugUtils.currentLine=1638406;
 //BA.debugLineNum = 1638406;BA.debugLine="Thymeleaf.Cacheable = True";
_thymeleaf.setCacheable(__c.True);
RDebugUtils.currentLine=1638408;
 //BA.debugLineNum = 1638408;BA.debugLine="Thymeleaf.CacheTTLMs = 1200000";
_thymeleaf.setCacheTTLMs((long) (1200000));
RDebugUtils.currentLine=1638409;
 //BA.debugLineNum = 1638409;BA.debugLine="Thymeleaf.Prefix = ThymeleafTemplate";
_thymeleaf.setPrefix(_thymeleaftemplate);
RDebugUtils.currentLine=1638410;
 //BA.debugLineNum = 1638410;BA.debugLine="Thymeleaf.Suffix = \".html\"";
_thymeleaf.setSuffix(".html");
RDebugUtils.currentLine=1638412;
 //BA.debugLineNum = 1638412;BA.debugLine="Dim html As String = Thymeleaf.toHTML(\"/SessionOb";
_html = _thymeleaf.toHTML("/SessionObject.html");
RDebugUtils.currentLine=1638415;
 //BA.debugLineNum = 1638415;BA.debugLine="resp.CharacterEncoding = \"UTF-8\"";
_resp.setCharacterEncoding("UTF-8");
RDebugUtils.currentLine=1638416;
 //BA.debugLineNum = 1638416;BA.debugLine="resp.Write(html)";
_resp.Write(_html);
RDebugUtils.currentLine=1638417;
 //BA.debugLineNum = 1638417;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.testobjectclass __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="testobjectclass";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="End Sub";
return "";
}
}