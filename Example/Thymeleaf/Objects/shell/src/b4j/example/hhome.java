
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class hhome {
    public static RemoteObject myClass;
	public hhome() {
	}
    public static PCBA staticBA = new PCBA(null, hhome.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _myuser = RemoteObject.declareNull("b4j.example.infodata");
public static RemoteObject _clsvalue = RemoteObject.declareNull("b4j.example.clscontent");
public static b4j.example.main _main = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"clsValue",_ref.getField(false, "_clsvalue"),"myUser",_ref.getField(false, "_myuser")};
}
}