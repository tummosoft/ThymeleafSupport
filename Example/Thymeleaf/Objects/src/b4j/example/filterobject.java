package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class filterobject extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.filterobject", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.filterobject.class).invoke(this, new Object[] {null});
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
public String  _class_globals(b4j.example.filterobject __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="filterobject";
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="End Sub";
return "";
}
public boolean  _filter(b4j.example.filterobject __ref,anywheresoftware.b4j.object.JServlet.ServletRequestWrapper _req,anywheresoftware.b4j.object.JServlet.ServletResponseWrapper _resp) throws Exception{
__ref = this;
RDebugUtils.currentModule="filterobject";
if (Debug.shouldDelegate(ba, "filter", false))
	 {return ((Boolean) Debug.delegate(ba, "filter", new Object[] {_req,_resp}));}
b4j.example.infodata _info = null;
com.tummosoft.ThymeleafSupport _thymeleaf = null;
String _thymeleaftemplate = "";
String _html = "";
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Public Sub Filter(req As ServletRequest, resp As S";
RDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="Dim info As infoData";
_info = new b4j.example.infodata();
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="info.Initialize";
_info._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1835011;
 //BA.debugLineNum = 1835011;BA.debugLine="info.Name = \"DAVID\"";
_info._setname /*String*/ (null,"DAVID");
RDebugUtils.currentLine=1835012;
 //BA.debugLineNum = 1835012;BA.debugLine="info.Age = \"25\"";
_info._setage /*String*/ (null,"25");
RDebugUtils.currentLine=1835014;
 //BA.debugLineNum = 1835014;BA.debugLine="req.GetSession.SetAttribute(\"author\", info)";
_req.GetSession().SetAttribute("author",(Object)(_info));
RDebugUtils.currentLine=1835016;
 //BA.debugLineNum = 1835016;BA.debugLine="Dim Thymeleaf As ThymeleafSupport";
_thymeleaf = new com.tummosoft.ThymeleafSupport();
RDebugUtils.currentLine=1835017;
 //BA.debugLineNum = 1835017;BA.debugLine="Dim ThymeleafTemplate As String = File.Combine(Fi";
_thymeleaftemplate = __c.File.Combine(__c.File.getDirApp()+"/www/templates","");
RDebugUtils.currentLine=1835019;
 //BA.debugLineNum = 1835019;BA.debugLine="Thymeleaf.Initialize";
_thymeleaf.Initialize();
RDebugUtils.currentLine=1835020;
 //BA.debugLineNum = 1835020;BA.debugLine="Thymeleaf.Encoding = \"UTF-8\"";
_thymeleaf.setEncoding("UTF-8");
RDebugUtils.currentLine=1835021;
 //BA.debugLineNum = 1835021;BA.debugLine="Thymeleaf.Cacheable = True";
_thymeleaf.setCacheable(__c.True);
RDebugUtils.currentLine=1835023;
 //BA.debugLineNum = 1835023;BA.debugLine="Thymeleaf.CacheTTLMs = 1200000";
_thymeleaf.setCacheTTLMs((long) (1200000));
RDebugUtils.currentLine=1835024;
 //BA.debugLineNum = 1835024;BA.debugLine="Thymeleaf.Prefix = ThymeleafTemplate";
_thymeleaf.setPrefix(_thymeleaftemplate);
RDebugUtils.currentLine=1835025;
 //BA.debugLineNum = 1835025;BA.debugLine="Thymeleaf.Suffix = \".html\"";
_thymeleaf.setSuffix(".html");
RDebugUtils.currentLine=1835027;
 //BA.debugLineNum = 1835027;BA.debugLine="Dim html As String = Thymeleaf.toHTML(\"/SessionOb";
_html = _thymeleaf.toHTML("/SessionObject.html");
RDebugUtils.currentLine=1835030;
 //BA.debugLineNum = 1835030;BA.debugLine="resp.CharacterEncoding = \"UTF-8\"";
_resp.setCharacterEncoding("UTF-8");
RDebugUtils.currentLine=1835031;
 //BA.debugLineNum = 1835031;BA.debugLine="resp.Write(html)";
_resp.Write(_html);
RDebugUtils.currentLine=1835032;
 //BA.debugLineNum = 1835032;BA.debugLine="End Sub";
return false;
}
public String  _initialize(b4j.example.filterobject __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="filterobject";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="End Sub";
return "";
}
}