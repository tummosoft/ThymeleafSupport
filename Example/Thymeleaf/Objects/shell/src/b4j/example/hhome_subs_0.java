package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class hhome_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Type Animal(id As Int, name As String, action As";
;
 //BA.debugLineNum = 4;BA.debugLine="Dim myUser As infoData";
hhome._myuser = RemoteObject.createNew ("b4j.example.infodata");__ref.setField("_myuser",hhome._myuser);
 //BA.debugLineNum = 5;BA.debugLine="Dim clsValue As clsContent";
hhome._clsvalue = RemoteObject.createNew ("b4j.example.clscontent");__ref.setField("_clsvalue",hhome._clsvalue);
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _handle(RemoteObject __ref,RemoteObject _req,RemoteObject _resp) throws Exception{
try {
		Debug.PushSubsStack("Handle (hhome) ","hhome",2,__ref.getField(false, "ba"),__ref,14);
if (RapidSub.canDelegate("handle")) { return __ref.runUserSub(false, "hhome","handle", __ref, _req, _resp);}
RemoteObject _thymeleaf = RemoteObject.declareNull("com.tummosoft.ThymeleafSupport");
RemoteObject _thymeleaftemplate = RemoteObject.createImmutable("");
RemoteObject _variable = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _map2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _x1 = RemoteObject.createImmutable(0);
RemoteObject _x2 = RemoteObject.createImmutable(0);
RemoteObject _arr = null;
RemoteObject _listanimals = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _myanimal = RemoteObject.declareNull("b4j.example.hhome._animal");
RemoteObject _html = RemoteObject.createImmutable("");
Debug.locals.put("req", _req);
Debug.locals.put("resp", _resp);
 BA.debugLineNum = 14;BA.debugLine="Sub Handle(req As ServletRequest, resp As ServletR";
Debug.ShouldStop(8192);
 BA.debugLineNum = 15;BA.debugLine="Dim Thymeleaf As ThymeleafSupport";
Debug.ShouldStop(16384);
_thymeleaf = RemoteObject.createNew ("com.tummosoft.ThymeleafSupport");Debug.locals.put("Thymeleaf", _thymeleaf);
 BA.debugLineNum = 16;BA.debugLine="Dim ThymeleafTemplate As String = File.Combine(Fi";
Debug.ShouldStop(32768);
_thymeleaftemplate = hhome.__c.getField(false,"File").runMethod(true,"Combine",(Object)(RemoteObject.concat(hhome.__c.getField(false,"File").runMethod(true,"getDirApp"),RemoteObject.createImmutable("/www/templates"))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("ThymeleafTemplate", _thymeleaftemplate);Debug.locals.put("ThymeleafTemplate", _thymeleaftemplate);
 BA.debugLineNum = 17;BA.debugLine="Dim variable As Map";
Debug.ShouldStop(65536);
_variable = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("variable", _variable);
 BA.debugLineNum = 18;BA.debugLine="variable.Initialize";
Debug.ShouldStop(131072);
_variable.runVoidMethod ("Initialize");
 BA.debugLineNum = 19;BA.debugLine="variable.Put(\"date\", DateTime.Date(DateTime.Now))";
Debug.ShouldStop(262144);
_variable.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("date"))),(Object)((hhome.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(hhome.__c.getField(false,"DateTime").runMethod(true,"getNow"))))));
 BA.debugLineNum = 20;BA.debugLine="variable.Put(\"uri\", \"https://tummosoft.com\")";
Debug.ShouldStop(524288);
_variable.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("uri"))),(Object)((RemoteObject.createImmutable("https://tummosoft.com"))));
 BA.debugLineNum = 21;BA.debugLine="variable.Put(\"user\", myUser.User)";
Debug.ShouldStop(1048576);
_variable.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("user"))),(Object)((__ref.getField(false,"_myuser" /*RemoteObject*/ ).runClassMethod (b4j.example.infodata.class, "_user" /*RemoteObject*/ ))));
 BA.debugLineNum = 22;BA.debugLine="variable.Put(\"roles\", myUser.Roles)";
Debug.ShouldStop(2097152);
_variable.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("roles"))),(Object)((__ref.getField(false,"_myuser" /*RemoteObject*/ ).runClassMethod (b4j.example.infodata.class, "_roles" /*RemoteObject*/ ))));
 BA.debugLineNum = 23;BA.debugLine="variable.Put(\"logout\", \"/logout.do\")";
Debug.ShouldStop(4194304);
_variable.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("logout"))),(Object)((RemoteObject.createImmutable("/logout.do"))));
 BA.debugLineNum = 25;BA.debugLine="Thymeleaf.Initialize";
Debug.ShouldStop(16777216);
_thymeleaf.runVoidMethod ("Initialize");
 BA.debugLineNum = 26;BA.debugLine="Thymeleaf.Encoding = \"UTF-8\"";
Debug.ShouldStop(33554432);
_thymeleaf.runVoidMethod ("setEncoding",BA.ObjectToString("UTF-8"));
 BA.debugLineNum = 27;BA.debugLine="Thymeleaf.Cacheable = True";
Debug.ShouldStop(67108864);
_thymeleaf.runVoidMethod ("setCacheable",hhome.__c.getField(true,"True"));
 BA.debugLineNum = 29;BA.debugLine="Thymeleaf.CacheTTLMs = 1200000";
Debug.ShouldStop(268435456);
_thymeleaf.runVoidMethod ("setCacheTTLMs",BA.numberCast(long.class, 1200000));
 BA.debugLineNum = 30;BA.debugLine="Thymeleaf.Prefix = ThymeleafTemplate";
Debug.ShouldStop(536870912);
_thymeleaf.runVoidMethod ("setPrefix",_thymeleaftemplate);
 BA.debugLineNum = 31;BA.debugLine="Thymeleaf.Suffix = \".html\"";
Debug.ShouldStop(1073741824);
_thymeleaf.runVoidMethod ("setSuffix",BA.ObjectToString(".html"));
 BA.debugLineNum = 32;BA.debugLine="Thymeleaf.Variables = variable";
Debug.ShouldStop(-2147483648);
_thymeleaf.runVoidMethod ("setVariables",_variable);
 BA.debugLineNum = 34;BA.debugLine="Thymeleaf.setVariable(\"pagetitle\",\"Hello world\")";
Debug.ShouldStop(2);
_thymeleaf.runVoidMethod ("setVariable",(Object)(BA.ObjectToString("pagetitle")),(Object)((RemoteObject.createImmutable("Hello world"))));
 BA.debugLineNum = 35;BA.debugLine="Thymeleaf.setVariable(\"des\",\"单词意思是灵活的意思\")";
Debug.ShouldStop(4);
_thymeleaf.runVoidMethod ("setVariable",(Object)(BA.ObjectToString("des")),(Object)((RemoteObject.createImmutable("单词意思是灵活的意思"))));
 BA.debugLineNum = 36;BA.debugLine="Thymeleaf.setVariable(\"canonical\",\"http://127.0.0";
Debug.ShouldStop(8);
_thymeleaf.runVoidMethod ("setVariable",(Object)(BA.ObjectToString("canonical")),(Object)((RemoteObject.createImmutable("http://127.0.0.1/home"))));
 BA.debugLineNum = 37;BA.debugLine="Thymeleaf.setVariable(\"vietnamese\",\"Xin chào các";
Debug.ShouldStop(16);
_thymeleaf.runVoidMethod ("setVariable",(Object)(BA.ObjectToString("vietnamese")),(Object)((RemoteObject.createImmutable("Xin chào các bạn!!!"))));
 BA.debugLineNum = 39;BA.debugLine="Dim map2 As Map";
Debug.ShouldStop(64);
_map2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("map2", _map2);
 BA.debugLineNum = 40;BA.debugLine="map2.Initialize";
Debug.ShouldStop(128);
_map2.runVoidMethod ("Initialize");
 BA.debugLineNum = 42;BA.debugLine="Dim x1 As Int = 3";
Debug.ShouldStop(512);
_x1 = BA.numberCast(int.class, 3);Debug.locals.put("x1", _x1);Debug.locals.put("x1", _x1);
 BA.debugLineNum = 43;BA.debugLine="Dim x2 As Int = 4";
Debug.ShouldStop(1024);
_x2 = BA.numberCast(int.class, 4);Debug.locals.put("x2", _x2);Debug.locals.put("x2", _x2);
 BA.debugLineNum = 45;BA.debugLine="map2.Put(\"h1\", \"This is h1 tag\")";
Debug.ShouldStop(4096);
_map2.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("h1"))),(Object)((RemoteObject.createImmutable("This is h1 tag"))));
 BA.debugLineNum = 46;BA.debugLine="map2.Put(\"is_caculator\", True)";
Debug.ShouldStop(8192);
_map2.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("is_caculator"))),(Object)((hhome.__c.getField(true,"True"))));
 BA.debugLineNum = 47;BA.debugLine="map2.Put(\"x1\", x1)";
Debug.ShouldStop(16384);
_map2.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("x1"))),(Object)((_x1)));
 BA.debugLineNum = 48;BA.debugLine="map2.Put(\"x2\", x2)";
Debug.ShouldStop(32768);
_map2.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("x2"))),(Object)((_x2)));
 BA.debugLineNum = 51;BA.debugLine="Thymeleaf.Variables = map2";
Debug.ShouldStop(262144);
_thymeleaf.runVoidMethod ("setVariables",_map2);
 BA.debugLineNum = 53;BA.debugLine="Dim arr() As String = Array As String (\"Monday\",\"";
Debug.ShouldStop(1048576);
_arr = RemoteObject.createNewArray("String",new int[] {5},new Object[] {BA.ObjectToString("Monday"),BA.ObjectToString("Tuesday"),BA.ObjectToString("Wednesday"),BA.ObjectToString("Thursday"),RemoteObject.createImmutable("Friday")});Debug.locals.put("arr", _arr);Debug.locals.put("arr", _arr);
 BA.debugLineNum = 54;BA.debugLine="Thymeleaf.setVariable(\"myarrs\", arr)";
Debug.ShouldStop(2097152);
_thymeleaf.runVoidMethod ("setVariable",(Object)(BA.ObjectToString("myarrs")),(Object)((_arr)));
 BA.debugLineNum = 56;BA.debugLine="Thymeleaf.setVariable(\"id\", 15666666)";
Debug.ShouldStop(8388608);
_thymeleaf.runVoidMethod ("setVariable",(Object)(BA.ObjectToString("id")),(Object)(RemoteObject.createImmutable((15666666))));
 BA.debugLineNum = 58;BA.debugLine="Dim listAnimals As List";
Debug.ShouldStop(33554432);
_listanimals = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("listAnimals", _listanimals);
 BA.debugLineNum = 59;BA.debugLine="listAnimals.Initialize";
Debug.ShouldStop(67108864);
_listanimals.runVoidMethod ("Initialize");
 BA.debugLineNum = 61;BA.debugLine="Dim myAnimal As Animal";
Debug.ShouldStop(268435456);
_myanimal = RemoteObject.createNew ("b4j.example.hhome._animal");Debug.locals.put("myAnimal", _myanimal);
 BA.debugLineNum = 62;BA.debugLine="myAnimal.Initialize";
Debug.ShouldStop(536870912);
_myanimal.runVoidMethod ("Initialize");
 BA.debugLineNum = 63;BA.debugLine="myAnimal.id = 1";
Debug.ShouldStop(1073741824);
_myanimal.setField ("id" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
 BA.debugLineNum = 64;BA.debugLine="myAnimal.name = \"Dog\"";
Debug.ShouldStop(-2147483648);
_myanimal.setField ("name" /*RemoteObject*/ ,BA.ObjectToString("Dog"));
 BA.debugLineNum = 65;BA.debugLine="myAnimal.action = \"Eat\"";
Debug.ShouldStop(1);
_myanimal.setField ("action" /*RemoteObject*/ ,BA.ObjectToString("Eat"));
 BA.debugLineNum = 67;BA.debugLine="listAnimals.Add(myAnimal)";
Debug.ShouldStop(4);
_listanimals.runVoidMethod ("Add",(Object)((_myanimal)));
 BA.debugLineNum = 69;BA.debugLine="myAnimal.id = 1";
Debug.ShouldStop(16);
_myanimal.setField ("id" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
 BA.debugLineNum = 70;BA.debugLine="myAnimal.name = \"Cat\"";
Debug.ShouldStop(32);
_myanimal.setField ("name" /*RemoteObject*/ ,BA.ObjectToString("Cat"));
 BA.debugLineNum = 71;BA.debugLine="myAnimal.action = \"Sleeping\"";
Debug.ShouldStop(64);
_myanimal.setField ("action" /*RemoteObject*/ ,BA.ObjectToString("Sleeping"));
 BA.debugLineNum = 73;BA.debugLine="listAnimals.Add(myAnimal)";
Debug.ShouldStop(256);
_listanimals.runVoidMethod ("Add",(Object)((_myanimal)));
 BA.debugLineNum = 75;BA.debugLine="Thymeleaf.setVariable(\"vietnamese\",myAnimal)";
Debug.ShouldStop(1024);
_thymeleaf.runVoidMethod ("setVariable",(Object)(BA.ObjectToString("vietnamese")),(Object)((_myanimal)));
 BA.debugLineNum = 77;BA.debugLine="Dim html As String = Thymeleaf.toHTML(\"/template1";
Debug.ShouldStop(4096);
_html = _thymeleaf.runMethod(true,"toHTML",(Object)(RemoteObject.createImmutable("/template1.html")));Debug.locals.put("html", _html);Debug.locals.put("html", _html);
 BA.debugLineNum = 80;BA.debugLine="resp.CharacterEncoding = \"UTF-8\"";
Debug.ShouldStop(32768);
_resp.runMethod(true,"setCharacterEncoding",BA.ObjectToString("UTF-8"));
 BA.debugLineNum = 81;BA.debugLine="resp.Write(html)";
Debug.ShouldStop(65536);
_resp.runVoidMethod ("Write",(Object)(_html));
 BA.debugLineNum = 83;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Initialize (hhome) ","hhome",2,__ref.getField(false, "ba"),__ref,8);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "hhome","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(128);
 BA.debugLineNum = 10;BA.debugLine="clsValue.Initialize";
Debug.ShouldStop(512);
__ref.getField(false,"_clsvalue" /*RemoteObject*/ ).runClassMethod (b4j.example.clscontent.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 11;BA.debugLine="myUser.Initialize";
Debug.ShouldStop(1024);
__ref.getField(false,"_myuser" /*RemoteObject*/ ).runClassMethod (b4j.example.infodata.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 12;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}