
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class wsguessmynumber {
    public static RemoteObject myClass;
	public wsguessmynumber() {
	}
    public static PCBA staticBA = new PCBA(null, wsguessmynumber.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _ws = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket");
public static RemoteObject _mynumber = RemoteObject.createImmutable(0);
public static RemoteObject _timer1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.Timer");
public static RemoteObject _txtnumber = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _servertime = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static b4j.example.main _main = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"myNumber",_ref.getField(false, "_mynumber"),"Result",_ref.getField(false, "_result"),"ServerTime",_ref.getField(false, "_servertime"),"timer1",_ref.getField(false, "_timer1"),"TxtNumber",_ref.getField(false, "_txtnumber"),"ws",_ref.getField(false, "_ws")};
}
}