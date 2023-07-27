package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class testobjectclass_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _handle(RemoteObject __ref,RemoteObject _req,RemoteObject _resp) throws Exception{
try {
		Debug.PushSubsStack("Handle (testobjectclass) ","testobjectclass",6,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("handle")) { return __ref.runUserSub(false, "testobjectclass","handle", __ref, _req, _resp);}
RemoteObject _thymeleaf = RemoteObject.declareNull("com.tummosoft.ThymeleafSupport");
RemoteObject _thymeleaftemplate = RemoteObject.createImmutable("");
RemoteObject _html = RemoteObject.createImmutable("");
Debug.locals.put("req", _req);
Debug.locals.put("resp", _resp);
 BA.debugLineNum = 10;BA.debugLine="Sub Handle(req As ServletRequest, resp As ServletR";
Debug.ShouldStop(512);
 BA.debugLineNum = 11;BA.debugLine="Dim Thymeleaf As ThymeleafSupport";
Debug.ShouldStop(1024);
_thymeleaf = RemoteObject.createNew ("com.tummosoft.ThymeleafSupport");Debug.locals.put("Thymeleaf", _thymeleaf);
 BA.debugLineNum = 12;BA.debugLine="Dim ThymeleafTemplate As String = File.Combine(Fi";
Debug.ShouldStop(2048);
_thymeleaftemplate = testobjectclass.__c.getField(false,"File").runMethod(true,"Combine",(Object)(RemoteObject.concat(testobjectclass.__c.getField(false,"File").runMethod(true,"getDirApp"),RemoteObject.createImmutable("/www/templates"))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("ThymeleafTemplate", _thymeleaftemplate);Debug.locals.put("ThymeleafTemplate", _thymeleaftemplate);
 BA.debugLineNum = 14;BA.debugLine="Thymeleaf.Initialize";
Debug.ShouldStop(8192);
_thymeleaf.runVoidMethod ("Initialize");
 BA.debugLineNum = 15;BA.debugLine="Thymeleaf.Encoding = \"UTF-8\"";
Debug.ShouldStop(16384);
_thymeleaf.runVoidMethod ("setEncoding",BA.ObjectToString("UTF-8"));
 BA.debugLineNum = 16;BA.debugLine="Thymeleaf.Cacheable = True";
Debug.ShouldStop(32768);
_thymeleaf.runVoidMethod ("setCacheable",testobjectclass.__c.getField(true,"True"));
 BA.debugLineNum = 18;BA.debugLine="Thymeleaf.CacheTTLMs = 1200000";
Debug.ShouldStop(131072);
_thymeleaf.runVoidMethod ("setCacheTTLMs",BA.numberCast(long.class, 1200000));
 BA.debugLineNum = 19;BA.debugLine="Thymeleaf.Prefix = ThymeleafTemplate";
Debug.ShouldStop(262144);
_thymeleaf.runVoidMethod ("setPrefix",_thymeleaftemplate);
 BA.debugLineNum = 20;BA.debugLine="Thymeleaf.Suffix = \".html\"";
Debug.ShouldStop(524288);
_thymeleaf.runVoidMethod ("setSuffix",BA.ObjectToString(".html"));
 BA.debugLineNum = 22;BA.debugLine="Dim html As String = Thymeleaf.toHTML(\"/SessionOb";
Debug.ShouldStop(2097152);
_html = _thymeleaf.runMethod(true,"toHTML",(Object)(RemoteObject.createImmutable("/SessionObject.html")));Debug.locals.put("html", _html);Debug.locals.put("html", _html);
 BA.debugLineNum = 25;BA.debugLine="resp.CharacterEncoding = \"UTF-8\"";
Debug.ShouldStop(16777216);
_resp.runMethod(true,"setCharacterEncoding",BA.ObjectToString("UTF-8"));
 BA.debugLineNum = 26;BA.debugLine="resp.Write(html)";
Debug.ShouldStop(33554432);
_resp.runVoidMethod ("Write",(Object)(_html));
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (testobjectclass) ","testobjectclass",6,__ref.getField(false, "ba"),__ref,6);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "testobjectclass","initialize", __ref, _ba);}
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