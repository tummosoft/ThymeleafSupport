
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class serorganizations {
    public static RemoteObject myClass;
	public serorganizations() {
	}
    public static PCBA staticBA = new PCBA(null, serorganizations.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _mysqlite = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL");
public static b4j.example.main _main = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"mysqlite",_ref.getField(false, "_mysqlite")};
}
}