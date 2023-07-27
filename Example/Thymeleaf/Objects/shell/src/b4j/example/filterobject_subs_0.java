package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class filterobject_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _filter(RemoteObject __ref,RemoteObject _req,RemoteObject _resp) throws Exception{
try {
		Debug.PushSubsStack("Filter (filterobject) ","filterobject",7,__ref.getField(false, "ba"),__ref,11);
if (RapidSub.canDelegate("filter")) { return __ref.runUserSub(false, "filterobject","filter", __ref, _req, _resp);}
RemoteObject _info = RemoteObject.declareNull("b4j.example.infodata");
RemoteObject _thymeleaf = RemoteObject.declareNull("com.tummosoft.ThymeleafSupport");
RemoteObject _thymeleaftemplate = RemoteObject.createImmutable("");
RemoteObject _html = RemoteObject.createImmutable("");
Debug.locals.put("req", _req);
Debug.locals.put("resp", _resp);
 BA.debugLineNum = 11;BA.debugLine="Public Sub Filter(req As ServletRequest, resp As S";
Debug.ShouldStop(1024);
 BA.debugLineNum = 12;BA.debugLine="Dim info As infoData";
Debug.ShouldStop(2048);
_info = RemoteObject.createNew ("b4j.example.infodata");Debug.locals.put("info", _info);
 BA.debugLineNum = 13;BA.debugLine="info.Initialize";
Debug.ShouldStop(4096);
_info.runClassMethod (b4j.example.infodata.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 14;BA.debugLine="info.Name = \"DAVID\"";
Debug.ShouldStop(8192);
_info.runClassMethod (b4j.example.infodata.class, "_setname" /*RemoteObject*/ ,BA.ObjectToString("DAVID"));
 BA.debugLineNum = 15;BA.debugLine="info.Age = \"25\"";
Debug.ShouldStop(16384);
_info.runClassMethod (b4j.example.infodata.class, "_setage" /*RemoteObject*/ ,BA.ObjectToString("25"));
 BA.debugLineNum = 17;BA.debugLine="req.GetSession.SetAttribute(\"author\", info)";
Debug.ShouldStop(65536);
_req.runMethod(false,"GetSession").runVoidMethod ("SetAttribute",(Object)(BA.ObjectToString("author")),(Object)((_info)));
 BA.debugLineNum = 19;BA.debugLine="Dim Thymeleaf As ThymeleafSupport";
Debug.ShouldStop(262144);
_thymeleaf = RemoteObject.createNew ("com.tummosoft.ThymeleafSupport");Debug.locals.put("Thymeleaf", _thymeleaf);
 BA.debugLineNum = 20;BA.debugLine="Dim ThymeleafTemplate As String = File.Combine(Fi";
Debug.ShouldStop(524288);
_thymeleaftemplate = filterobject.__c.getField(false,"File").runMethod(true,"Combine",(Object)(RemoteObject.concat(filterobject.__c.getField(false,"File").runMethod(true,"getDirApp"),RemoteObject.createImmutable("/www/templates"))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("ThymeleafTemplate", _thymeleaftemplate);Debug.locals.put("ThymeleafTemplate", _thymeleaftemplate);
 BA.debugLineNum = 22;BA.debugLine="Thymeleaf.Initialize";
Debug.ShouldStop(2097152);
_thymeleaf.runVoidMethod ("Initialize");
 BA.debugLineNum = 23;BA.debugLine="Thymeleaf.Encoding = \"UTF-8\"";
Debug.ShouldStop(4194304);
_thymeleaf.runVoidMethod ("setEncoding",BA.ObjectToString("UTF-8"));
 BA.debugLineNum = 24;BA.debugLine="Thymeleaf.Cacheable = True";
Debug.ShouldStop(8388608);
_thymeleaf.runVoidMethod ("setCacheable",filterobject.__c.getField(true,"True"));
 BA.debugLineNum = 26;BA.debugLine="Thymeleaf.CacheTTLMs = 1200000";
Debug.ShouldStop(33554432);
_thymeleaf.runVoidMethod ("setCacheTTLMs",BA.numberCast(long.class, 1200000));
 BA.debugLineNum = 27;BA.debugLine="Thymeleaf.Prefix = ThymeleafTemplate";
Debug.ShouldStop(67108864);
_thymeleaf.runVoidMethod ("setPrefix",_thymeleaftemplate);
 BA.debugLineNum = 28;BA.debugLine="Thymeleaf.Suffix = \".html\"";
Debug.ShouldStop(134217728);
_thymeleaf.runVoidMethod ("setSuffix",BA.ObjectToString(".html"));
 BA.debugLineNum = 30;BA.debugLine="Dim html As String = Thymeleaf.toHTML(\"/SessionOb";
Debug.ShouldStop(536870912);
_html = _thymeleaf.runMethod(true,"toHTML",(Object)(RemoteObject.createImmutable("/SessionObject.html")));Debug.locals.put("html", _html);Debug.locals.put("html", _html);
 BA.debugLineNum = 33;BA.debugLine="resp.CharacterEncoding = \"UTF-8\"";
Debug.ShouldStop(1);
_resp.runMethod(true,"setCharacterEncoding",BA.ObjectToString("UTF-8"));
 BA.debugLineNum = 34;BA.debugLine="resp.Write(html)";
Debug.ShouldStop(2);
_resp.runVoidMethod ("Write",(Object)(_html));
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (filterobject) ","filterobject",7,__ref.getField(false, "ba"),__ref,6);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "filterobject","initialize", __ref, _ba);}
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