package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;

public class main extends Object{
public static main mostCurrent = new main();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.main", null);
		ba.loadHtSubs(main.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			anywheresoftware.b4a.shell.ShellBA.delegateBA = new anywheresoftware.b4a.StandardBA("b4j.example", null, null);
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.main", ba);
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}

 
    public static void main(String[] args) throws Exception{
        try {
            anywheresoftware.b4a.keywords.Common.LogDebug("Program started.");
            initializeProcessGlobals();
            ba.raiseEvent(null, "appstart", (Object)args);
        } catch (Throwable t) {
			BA.printException(t, true);
		
        } finally {
            anywheresoftware.b4a.keywords.Common.LogDebug("Program terminated (StartMessageLoop was not called).");
        }
    }


private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.object.ServerWrapper _srvr = null;
public static String  _appstart(String[] _args) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "appstart", false))
	 {return ((String) Debug.delegate(ba, "appstart", new Object[] {_args}));}
com.tummosoft.JSPSupport _testwithjsp = null;
String _webxml = "";
String _resource = "";
boolean _check = false;
Object _hand = null;
RDebugUtils.currentLine=65536;
 //BA.debugLineNum = 65536;BA.debugLine="Sub AppStart (Args() As String)";
RDebugUtils.currentLine=65537;
 //BA.debugLineNum = 65537;BA.debugLine="srvr.Initialize(\"srvr\")";
_srvr.Initialize(ba,"srvr");
RDebugUtils.currentLine=65538;
 //BA.debugLineNum = 65538;BA.debugLine="srvr.Port = 51042";
_srvr.setPort((int) (51042));
RDebugUtils.currentLine=65539;
 //BA.debugLineNum = 65539;BA.debugLine="srvr.StaticFilesFolder = File.Combine(File.DirApp";
_srvr.setStaticFilesFolder(anywheresoftware.b4a.keywords.Common.File.Combine(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"www"));
RDebugUtils.currentLine=65540;
 //BA.debugLineNum = 65540;BA.debugLine="srvr.AddHandler(\"/guessmynumber/guess\", \"GuessMyN";
_srvr.AddHandler("/guessmynumber/guess","GuessMyNumber",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=65541;
 //BA.debugLineNum = 65541;BA.debugLine="srvr.AddHandler(\"/guessmynumber/reset\", \"ResetMyN";
_srvr.AddHandler("/guessmynumber/reset","ResetMyNumber",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=65542;
 //BA.debugLineNum = 65542;BA.debugLine="srvr.AddWebSocket(\"/guessmynumber_ws/ws\", \"WSGues";
_srvr.AddWebSocket("/guessmynumber_ws/ws","WSGuessMyNumber");
RDebugUtils.currentLine=65544;
 //BA.debugLineNum = 65544;BA.debugLine="Dim testwithjsp As JSPSupport";
_testwithjsp = new com.tummosoft.JSPSupport();
RDebugUtils.currentLine=65546;
 //BA.debugLineNum = 65546;BA.debugLine="Dim webxml As String = File.Combine(File.DirApp,";
_webxml = anywheresoftware.b4a.keywords.Common.File.Combine(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"www\\webapp\\WEB-INF\\web.xml");
RDebugUtils.currentLine=65548;
 //BA.debugLineNum = 65548;BA.debugLine="Dim resource As String = File.Combine(File.DirApp";
_resource = anywheresoftware.b4a.keywords.Common.File.Combine(anywheresoftware.b4a.keywords.Common.File.getDirApp()+"\\www\\webapp","");
RDebugUtils.currentLine=65550;
 //BA.debugLineNum = 65550;BA.debugLine="Dim check As Boolean = File.Exists(webxml,\"\")";
_check = anywheresoftware.b4a.keywords.Common.File.Exists(_webxml,"");
RDebugUtils.currentLine=65551;
 //BA.debugLineNum = 65551;BA.debugLine="Log(check)";
anywheresoftware.b4a.keywords.Common.LogImpl("065551",BA.ObjectToString(_check),0);
RDebugUtils.currentLine=65552;
 //BA.debugLineNum = 65552;BA.debugLine="testwithjsp.Initialize(webxml, resource, File.Dir";
_testwithjsp.Initialize(_webxml,_resource,anywheresoftware.b4a.keywords.Common.File.getDirApp());
RDebugUtils.currentLine=65553;
 //BA.debugLineNum = 65553;BA.debugLine="Dim hand As Object = testwithjsp.JettyParsing";
_hand = (Object)(_testwithjsp.JettyParsing());
RDebugUtils.currentLine=65554;
 //BA.debugLineNum = 65554;BA.debugLine="srvr.AddHandler(\"/jsp\", hand, False)";
_srvr.AddHandler("/jsp",BA.ObjectToString(_hand),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=65556;
 //BA.debugLineNum = 65556;BA.debugLine="srvr.Start";
_srvr.Start();
RDebugUtils.currentLine=65557;
 //BA.debugLineNum = 65557;BA.debugLine="StartMessageLoop";
anywheresoftware.b4a.keywords.Common.StartMessageLoop(ba);
RDebugUtils.currentLine=65560;
 //BA.debugLineNum = 65560;BA.debugLine="End Sub";
return "";
}
}