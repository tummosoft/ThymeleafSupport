
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class clscontent {
    public static RemoteObject myClass;
	public clscontent() {
	}
    public static PCBA staticBA = new PCBA(null, clscontent.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static b4j.example.main _main = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {};
}
}