package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class hhome extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.hhome", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.hhome.class).invoke(this, new Object[] {null});
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
public b4j.example.infodata _myuser = null;
public b4j.example.clscontent _clsvalue = null;
public b4j.example.main _main = null;
public String  _class_globals(b4j.example.hhome __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="hhome";
RDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="Dim myUser As infoData";
_myuser = new b4j.example.infodata();
RDebugUtils.currentLine=327683;
 //BA.debugLineNum = 327683;BA.debugLine="Dim clsValue As clsContent";
_clsvalue = new b4j.example.clscontent();
RDebugUtils.currentLine=327684;
 //BA.debugLineNum = 327684;BA.debugLine="End Sub";
return "";
}
public String  _handle(b4j.example.hhome __ref,anywheresoftware.b4j.object.JServlet.ServletRequestWrapper _req,anywheresoftware.b4j.object.JServlet.ServletResponseWrapper _resp) throws Exception{
__ref = this;
RDebugUtils.currentModule="hhome";
if (Debug.shouldDelegate(ba, "handle", false))
	 {return ((String) Debug.delegate(ba, "handle", new Object[] {_req,_resp}));}
com.tummosoft.ThymeleafSupport _thymeleaf = null;
String _thymeleaftemplate = "";
anywheresoftware.b4a.objects.collections.Map _variable = null;
anywheresoftware.b4a.objects.collections.Map _map2 = null;
int _x1 = 0;
int _x2 = 0;
String[] _arr = null;
String _html = "";
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Sub Handle(req As ServletRequest, resp As ServletR";
RDebugUtils.currentLine=458753;
 //BA.debugLineNum = 458753;BA.debugLine="Dim Thymeleaf As ThymeleafSupport";
_thymeleaf = new com.tummosoft.ThymeleafSupport();
RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="Dim ThymeleafTemplate As String = File.Combine(Fi";
_thymeleaftemplate = __c.File.Combine(__c.File.getDirApp()+"/www/templates","");
RDebugUtils.currentLine=458755;
 //BA.debugLineNum = 458755;BA.debugLine="Dim variable As Map";
_variable = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="variable.Initialize";
_variable.Initialize();
RDebugUtils.currentLine=458757;
 //BA.debugLineNum = 458757;BA.debugLine="variable.Put(\"date\", DateTime.Date(DateTime.Now))";
_variable.Put((Object)("date"),(Object)(__c.DateTime.Date(__c.DateTime.getNow())));
RDebugUtils.currentLine=458758;
 //BA.debugLineNum = 458758;BA.debugLine="variable.Put(\"uri\", \"https://tummosoft.com\")";
_variable.Put((Object)("uri"),(Object)("https://tummosoft.com"));
RDebugUtils.currentLine=458759;
 //BA.debugLineNum = 458759;BA.debugLine="variable.Put(\"user\", myUser.User)";
_variable.Put((Object)("user"),(Object)(__ref._myuser /*b4j.example.infodata*/ ._user /*String*/ (null)));
RDebugUtils.currentLine=458760;
 //BA.debugLineNum = 458760;BA.debugLine="variable.Put(\"roles\", myUser.Roles)";
_variable.Put((Object)("roles"),(Object)(__ref._myuser /*b4j.example.infodata*/ ._roles /*String*/ (null)));
RDebugUtils.currentLine=458761;
 //BA.debugLineNum = 458761;BA.debugLine="variable.Put(\"logout\", \"/logout.do\")";
_variable.Put((Object)("logout"),(Object)("/logout.do"));
RDebugUtils.currentLine=458763;
 //BA.debugLineNum = 458763;BA.debugLine="Thymeleaf.Initialize";
_thymeleaf.Initialize();
RDebugUtils.currentLine=458764;
 //BA.debugLineNum = 458764;BA.debugLine="Thymeleaf.Encoding = \"UTF-8\"";
_thymeleaf.setEncoding("UTF-8");
RDebugUtils.currentLine=458765;
 //BA.debugLineNum = 458765;BA.debugLine="Thymeleaf.Cacheable = True";
_thymeleaf.setCacheable(__c.True);
RDebugUtils.currentLine=458767;
 //BA.debugLineNum = 458767;BA.debugLine="Thymeleaf.CacheTTLMs = 1200000";
_thymeleaf.setCacheTTLMs((long) (1200000));
RDebugUtils.currentLine=458768;
 //BA.debugLineNum = 458768;BA.debugLine="Thymeleaf.Prefix = ThymeleafTemplate";
_thymeleaf.setPrefix(_thymeleaftemplate);
RDebugUtils.currentLine=458769;
 //BA.debugLineNum = 458769;BA.debugLine="Thymeleaf.Suffix = \".html\"";
_thymeleaf.setSuffix(".html");
RDebugUtils.currentLine=458770;
 //BA.debugLineNum = 458770;BA.debugLine="Thymeleaf.Variables = variable";
_thymeleaf.setVariables(_variable);
RDebugUtils.currentLine=458772;
 //BA.debugLineNum = 458772;BA.debugLine="Thymeleaf.setVariable(\"pagetitle\",\"Hello world\")";
_thymeleaf.setVariable("pagetitle",(Object)("Hello world"));
RDebugUtils.currentLine=458773;
 //BA.debugLineNum = 458773;BA.debugLine="Thymeleaf.setVariable(\"des\",\"单词意思是灵活的意思\")";
_thymeleaf.setVariable("des",(Object)("单词意思是灵活的意思"));
RDebugUtils.currentLine=458774;
 //BA.debugLineNum = 458774;BA.debugLine="Thymeleaf.setVariable(\"canonical\",\"http://127.0.0";
_thymeleaf.setVariable("canonical",(Object)("http://127.0.0.1/home"));
RDebugUtils.currentLine=458775;
 //BA.debugLineNum = 458775;BA.debugLine="Thymeleaf.setVariable(\"vietnamese\",\"Xin chào các";
_thymeleaf.setVariable("vietnamese",(Object)("Xin chào các bạn!!!"));
RDebugUtils.currentLine=458777;
 //BA.debugLineNum = 458777;BA.debugLine="Dim map2 As Map";
_map2 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=458778;
 //BA.debugLineNum = 458778;BA.debugLine="map2.Initialize";
_map2.Initialize();
RDebugUtils.currentLine=458780;
 //BA.debugLineNum = 458780;BA.debugLine="Dim x1 As Int = 3";
_x1 = (int) (3);
RDebugUtils.currentLine=458781;
 //BA.debugLineNum = 458781;BA.debugLine="Dim x2 As Int = 4";
_x2 = (int) (4);
RDebugUtils.currentLine=458783;
 //BA.debugLineNum = 458783;BA.debugLine="map2.Put(\"h1\", \"This is h1 tag\")";
_map2.Put((Object)("h1"),(Object)("This is h1 tag"));
RDebugUtils.currentLine=458784;
 //BA.debugLineNum = 458784;BA.debugLine="map2.Put(\"is_caculator\", True)";
_map2.Put((Object)("is_caculator"),(Object)(__c.True));
RDebugUtils.currentLine=458785;
 //BA.debugLineNum = 458785;BA.debugLine="map2.Put(\"x1\", x1)";
_map2.Put((Object)("x1"),(Object)(_x1));
RDebugUtils.currentLine=458786;
 //BA.debugLineNum = 458786;BA.debugLine="map2.Put(\"x2\", x2)";
_map2.Put((Object)("x2"),(Object)(_x2));
RDebugUtils.currentLine=458789;
 //BA.debugLineNum = 458789;BA.debugLine="Thymeleaf.Variables = map2";
_thymeleaf.setVariables(_map2);
RDebugUtils.currentLine=458791;
 //BA.debugLineNum = 458791;BA.debugLine="Dim arr() As String = Array As String (\"Monday\",\"";
_arr = new String[]{"Monday","Tuesday","Wednesday","Thursday","Friday"};
RDebugUtils.currentLine=458792;
 //BA.debugLineNum = 458792;BA.debugLine="Thymeleaf.setVariable(\"myarrs\", arr)";
_thymeleaf.setVariable("myarrs",(Object)(_arr));
RDebugUtils.currentLine=458794;
 //BA.debugLineNum = 458794;BA.debugLine="Thymeleaf.setVariable(\"id\", 15666666)";
_thymeleaf.setVariable("id",(Object)(15666666));
RDebugUtils.currentLine=458796;
 //BA.debugLineNum = 458796;BA.debugLine="Dim html As String = Thymeleaf.toHTML(\"/template1";
_html = _thymeleaf.toHTML("/template1.html");
RDebugUtils.currentLine=458799;
 //BA.debugLineNum = 458799;BA.debugLine="resp.CharacterEncoding = \"UTF-8\"";
_resp.setCharacterEncoding("UTF-8");
RDebugUtils.currentLine=458800;
 //BA.debugLineNum = 458800;BA.debugLine="resp.Write(html)";
_resp.Write(_html);
RDebugUtils.currentLine=458802;
 //BA.debugLineNum = 458802;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.hhome __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="hhome";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="clsValue.Initialize";
__ref._clsvalue /*b4j.example.clscontent*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=393219;
 //BA.debugLineNum = 393219;BA.debugLine="myUser.Initialize";
__ref._myuser /*b4j.example.infodata*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=393220;
 //BA.debugLineNum = 393220;BA.debugLine="End Sub";
return "";
}
}