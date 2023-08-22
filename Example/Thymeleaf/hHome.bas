B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.8
@EndOfDesignText@
'Handler class
Sub Class_Globals
	Type Animal(id As Int, name As String, action As String)
	Dim myUser As infoData
	Dim clsValue As clsContent
End Sub

Public Sub Initialize	
	
	clsValue.Initialize
	myUser.Initialize
End Sub

Sub Handle(req As ServletRequest, resp As ServletResponse)
	Dim Thymeleaf As ThymeleafSupport
	Dim ThymeleafTemplate As String = File.Combine(File.DirApp & "/www/templates","")
	Dim variable As Map
	variable.Initialize
	variable.Put("date", DateTime.Date(DateTime.Now))
	variable.Put("uri", "https://tummosoft.com")
	variable.Put("user", myUser.User)
	variable.Put("roles", myUser.Roles)
	variable.Put("logout", "/logout.do")
	
	Thymeleaf.Initialize
	Thymeleaf.Encoding = "UTF-8"
	Thymeleaf.Cacheable = True
	'1200000L // TTL=20m
	Thymeleaf.CacheTTLMs = 1200000
	Thymeleaf.Prefix = ThymeleafTemplate
	Thymeleaf.Suffix = ".html"
	Thymeleaf.Variables = variable
	
	Thymeleaf.setVariable("pagetitle","Hello world")
	Thymeleaf.setVariable("des","单词意思是灵活的意思")
	Thymeleaf.setVariable("canonical","http://127.0.0.1/home")	
	Thymeleaf.setVariable("vietnamese","Xin chào các bạn!!!")
	
	Dim map2 As Map
	map2.Initialize
	
	Dim x1 As Int = 3
	Dim x2 As Int = 4
	
	map2.Put("h1", "This is h1 tag")
	map2.Put("is_caculator", True)
	map2.Put("x1", x1)
	map2.Put("x2", x2)
		
	
	Thymeleaf.Variables = map2
	
	Dim arr() As String = Array As String ("Monday","Tuesday", "Wednesday", "Thursday", "Friday")
	Thymeleaf.setVariable("myarrs", arr)
	
	Thymeleaf.setVariable("id", 15666666)
	
	Dim listAnimals As List
	listAnimals.Initialize
	
	Dim myAnimal As Animal
	myAnimal.Initialize
	myAnimal.id = 1
	myAnimal.name = "Dog"
	myAnimal.action = "Eat"
	
	listAnimals.Add(myAnimal)
	
	myAnimal.id = 1
	myAnimal.name = "Cat"
	myAnimal.action = "Sleeping"
	
	listAnimals.Add(myAnimal)
	
	Thymeleaf.setVariable("vietnamese",myAnimal)
	
	Dim html As String = Thymeleaf.toHTML("/template1.html")
		
	'Log(html)
	resp.CharacterEncoding = "UTF-8"
	resp.Write(html)
	
End Sub