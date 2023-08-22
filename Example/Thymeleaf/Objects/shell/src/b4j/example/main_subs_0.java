package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _appstart(RemoteObject _args) throws Exception{
try {
		Debug.PushSubsStack("AppStart (main) ","main",0,main.ba,main.mostCurrent,18);
if (RapidSub.canDelegate("appstart")) { return b4j.example.main.remoteMe.runUserSub(false, "main","appstart", _args);}
Debug.locals.put("Args", _args);
 BA.debugLineNum = 18;BA.debugLine="Sub AppStart (Args() As String)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 19;BA.debugLine="srvr.Initialize(\"srvr\")";
Debug.ShouldStop(262144);
main._srvr.runVoidMethod ("Initialize",main.ba,(Object)(RemoteObject.createImmutable("srvr")));
 BA.debugLineNum = 20;BA.debugLine="srvr.Port = 51042";
Debug.ShouldStop(524288);
main._srvr.runMethod(true,"setPort",BA.numberCast(int.class, 51042));
 BA.debugLineNum = 21;BA.debugLine="srvr.StaticFilesFolder = File.Combine(File.DirApp";
Debug.ShouldStop(1048576);
main._srvr.runMethod(true,"setStaticFilesFolder",main.__c.getField(false,"File").runMethod(true,"Combine",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("www"))));
 BA.debugLineNum = 23;BA.debugLine="srvr.AddHandler(\"/home/*\", \"hHome\", False)";
Debug.ShouldStop(4194304);
main._srvr.runVoidMethod ("AddHandler",(Object)(BA.ObjectToString("/home/*")),(Object)(BA.ObjectToString("hHome")),(Object)(main.__c.getField(true,"False")));
 BA.debugLineNum = 25;BA.debugLine="srvr.AddFilter(\"/*\", \"TestObjectClass\", False)";
Debug.ShouldStop(16777216);
main._srvr.runVoidMethod ("AddFilter",(Object)(BA.ObjectToString("/*")),(Object)(BA.ObjectToString("TestObjectClass")),(Object)(main.__c.getField(true,"False")));
 BA.debugLineNum = 27;BA.debugLine="srvr.Start";
Debug.ShouldStop(67108864);
main._srvr.runVoidMethod ("Start");
 BA.debugLineNum = 28;BA.debugLine="StartMessageLoop";
Debug.ShouldStop(134217728);
main.__c.runVoidMethod ("StartMessageLoop",main.ba);
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
serorganizations.myClass = BA.getDeviceClass ("b4j.example.serorganizations");
hhome.myClass = BA.getDeviceClass ("b4j.example.hhome");
infodata.myClass = BA.getDeviceClass ("b4j.example.infodata");
wshome.myClass = BA.getDeviceClass ("b4j.example.wshome");
clscontent.myClass = BA.getDeviceClass ("b4j.example.clscontent");
testobjectclass.myClass = BA.getDeviceClass ("b4j.example.testobjectclass");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 14;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 15;BA.debugLine="Private srvr As Server";
main._srvr = RemoteObject.createNew ("anywheresoftware.b4j.object.ServerWrapper");
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}