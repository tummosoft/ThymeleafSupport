<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<!DOCTYPE html>
    <head>
        <title>Java in Static Page Example</title>
    </head>
    <body>
        <h1>Java in Static Page Example</h1>
	    <% 
              String[] arr = {"What's up?", "Hello", "It's a nice day today!"}; 
	      String greetings = arr[(int)(Math.random() * arr.length)];	
            %>
        <p><%= greetings %></p>
    </body>
</html>