
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class wshome {
    public static RemoteObject myClass;
	public wshome() {
	}
    public static PCBA staticBA = new PCBA(null, wshome.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _ws = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket");
public static b4j.example.main _main = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"ws",_ref.getField(false, "_ws")};
}
}