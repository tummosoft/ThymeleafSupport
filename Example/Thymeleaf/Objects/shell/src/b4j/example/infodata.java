
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class infodata {
    public static RemoteObject myClass;
	public infodata() {
	}
    public static PCBA staticBA = new PCBA(null, infodata.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _xname = RemoteObject.createImmutable("");
public static RemoteObject _xemail = RemoteObject.createImmutable("");
public static RemoteObject _xage = RemoteObject.createImmutable("");
public static b4j.example.main _main = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"xage",_ref.getField(false, "_xage"),"xemail",_ref.getField(false, "_xemail"),"xname",_ref.getField(false, "_xname")};
}
}