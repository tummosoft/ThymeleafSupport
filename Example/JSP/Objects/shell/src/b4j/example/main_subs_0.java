package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _appstart(RemoteObject _args) throws Exception{
try {
		Debug.PushSubsStack("AppStart (main) ","main",0,main.ba,main.mostCurrent,17);
if (RapidSub.canDelegate("appstart")) { return b4j.example.main.remoteMe.runUserSub(false, "main","appstart", _args);}
RemoteObject _testwithjsp = RemoteObject.declareNull("com.tummosoft.JSPSupport");
RemoteObject _webxml = RemoteObject.createImmutable("");
RemoteObject _resource = RemoteObject.createImmutable("");
RemoteObject _check = RemoteObject.createImmutable(false);
RemoteObject _hand = RemoteObject.declareNull("Object");
Debug.locals.put("Args", _args);
 BA.debugLineNum = 17;BA.debugLine="Sub AppStart (Args() As String)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 18;BA.debugLine="srvr.Initialize(\"srvr\")";
Debug.ShouldStop(131072);
main._srvr.runVoidMethod ("Initialize",main.ba,(Object)(RemoteObject.createImmutable("srvr")));
 BA.debugLineNum = 19;BA.debugLine="srvr.Port = 51042";
Debug.ShouldStop(262144);
main._srvr.runMethod(true,"setPort",BA.numberCast(int.class, 51042));
 BA.debugLineNum = 20;BA.debugLine="srvr.StaticFilesFolder = File.Combine(File.DirApp";
Debug.ShouldStop(524288);
main._srvr.runMethod(true,"setStaticFilesFolder",main.__c.getField(false,"File").runMethod(true,"Combine",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("www"))));
 BA.debugLineNum = 21;BA.debugLine="srvr.AddHandler(\"/guessmynumber/guess\", \"GuessMyN";
Debug.ShouldStop(1048576);
main._srvr.runVoidMethod ("AddHandler",(Object)(BA.ObjectToString("/guessmynumber/guess")),(Object)(BA.ObjectToString("GuessMyNumber")),(Object)(main.__c.getField(true,"False")));
 BA.debugLineNum = 22;BA.debugLine="srvr.AddHandler(\"/guessmynumber/reset\", \"ResetMyN";
Debug.ShouldStop(2097152);
main._srvr.runVoidMethod ("AddHandler",(Object)(BA.ObjectToString("/guessmynumber/reset")),(Object)(BA.ObjectToString("ResetMyNumber")),(Object)(main.__c.getField(true,"False")));
 BA.debugLineNum = 23;BA.debugLine="srvr.AddWebSocket(\"/guessmynumber_ws/ws\", \"WSGues";
Debug.ShouldStop(4194304);
main._srvr.runVoidMethod ("AddWebSocket",(Object)(BA.ObjectToString("/guessmynumber_ws/ws")),(Object)(RemoteObject.createImmutable("WSGuessMyNumber")));
 BA.debugLineNum = 25;BA.debugLine="Dim testwithjsp As JSPSupport";
Debug.ShouldStop(16777216);
_testwithjsp = RemoteObject.createNew ("com.tummosoft.JSPSupport");Debug.locals.put("testwithjsp", _testwithjsp);
 BA.debugLineNum = 27;BA.debugLine="Dim webxml As String = File.Combine(File.DirApp,";
Debug.ShouldStop(67108864);
_webxml = main.__c.getField(false,"File").runMethod(true,"Combine",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("www\\webapp\\WEB-INF\\web.xml")));Debug.locals.put("webxml", _webxml);Debug.locals.put("webxml", _webxml);
 BA.debugLineNum = 29;BA.debugLine="Dim resource As String = File.Combine(File.DirApp";
Debug.ShouldStop(268435456);
_resource = main.__c.getField(false,"File").runMethod(true,"Combine",(Object)(RemoteObject.concat(main.__c.getField(false,"File").runMethod(true,"getDirApp"),RemoteObject.createImmutable("\\www\\webapp"))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("resource", _resource);Debug.locals.put("resource", _resource);
 BA.debugLineNum = 31;BA.debugLine="Dim check As Boolean = File.Exists(webxml,\"\")";
Debug.ShouldStop(1073741824);
_check = main.__c.getField(false,"File").runMethod(true,"Exists",(Object)(_webxml),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("check", _check);Debug.locals.put("check", _check);
 BA.debugLineNum = 32;BA.debugLine="Log(check)";
Debug.ShouldStop(-2147483648);
main.__c.runVoidMethod ("LogImpl","065551",BA.ObjectToString(_check),0);
 BA.debugLineNum = 33;BA.debugLine="testwithjsp.Initialize(webxml, resource, File.Dir";
Debug.ShouldStop(1);
_testwithjsp.runVoidMethod ("Initialize",(Object)(_webxml),(Object)(_resource),(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")));
 BA.debugLineNum = 34;BA.debugLine="Dim hand As Object = testwithjsp.JettyParsing";
Debug.ShouldStop(2);
_hand = (_testwithjsp.runMethod(false,"JettyParsing"));Debug.locals.put("hand", _hand);Debug.locals.put("hand", _hand);
 BA.debugLineNum = 35;BA.debugLine="srvr.AddHandler(\"/jsp\", hand, False)";
Debug.ShouldStop(4);
main._srvr.runVoidMethod ("AddHandler",(Object)(BA.ObjectToString("/jsp")),(Object)(BA.ObjectToString(_hand)),(Object)(main.__c.getField(true,"False")));
 BA.debugLineNum = 37;BA.debugLine="srvr.Start";
Debug.ShouldStop(16);
main._srvr.runVoidMethod ("Start");
 BA.debugLineNum = 38;BA.debugLine="StartMessageLoop";
Debug.ShouldStop(32);
main.__c.runVoidMethod ("StartMessageLoop",main.ba);
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}

private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4j.example.main");
home.myClass = BA.getDeviceClass ("b4j.example.home");
guessmynumber.myClass = BA.getDeviceClass ("b4j.example.guessmynumber");
resetmynumber.myClass = BA.getDeviceClass ("b4j.example.resetmynumber");
wsguessmynumber.myClass = BA.getDeviceClass ("b4j.example.wsguessmynumber");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 13;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 14;BA.debugLine="Private srvr As Server";
main._srvr = RemoteObject.createNew ("anywheresoftware.b4j.object.ServerWrapper");
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}