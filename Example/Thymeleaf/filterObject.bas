B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.8
@EndOfDesignText@
'Filter class
Sub Class_Globals
	
End Sub

Public Sub Initialize
	
End Sub

'Return True to allow the request to proceed.
Public Sub Filter(req As ServletRequest, resp As ServletResponse) As Boolean
	Dim info As infoData
	info.Initialize
	info.Name = "DAVID"
	info.Age = "25"
	
	req.GetSession.SetAttribute("author", info)
	
	Dim Thymeleaf As ThymeleafSupport
	Dim ThymeleafTemplate As String = File.Combine(File.DirApp & "/www/templates","")
	
	Thymeleaf.Initialize
	Thymeleaf.Encoding = "UTF-8"
	Thymeleaf.Cacheable = True
	'1200000L // TTL=20m
	Thymeleaf.CacheTTLMs = 1200000
	Thymeleaf.Prefix = ThymeleafTemplate
	Thymeleaf.Suffix = ".html"
		
	Dim html As String = Thymeleaf.toHTML("/SessionObject.html")
		
	'Log(html)
	resp.CharacterEncoding = "UTF-8"
	resp.Write(html)
End Sub