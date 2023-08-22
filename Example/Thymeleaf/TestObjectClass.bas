B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.8
@EndOfDesignText@
'Handler class
Sub Class_Globals
	
End Sub

Public Sub Initialize
	
End Sub

Sub Handle(req As ServletRequest, resp As ServletResponse)
	
	req.GetSession.SetAttribute("user", "phamanhtuan")
	req.GetSession.SetAttribute("pass", "12345678")
	resp.SendRedirect(req.FullRequestURI)
	Log("Redirect")
End Sub