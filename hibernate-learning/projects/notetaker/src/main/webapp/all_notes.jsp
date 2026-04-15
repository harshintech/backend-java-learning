<%@page import="java.net.NoRouteToHostException"%>
<%@page import="com.entities.Note"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.query.Query"%>
<%@page import="java.util.Scanner"%>
<%@page import="com.helper.FactoryProvider"%>
<%@page import="org.hibernate.Session"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All notes : Note Taker</title>
<%@include file="all_js_css.jsp" %>
</head>
<body>
	 
    <div class="container-fluid p-0 m-0">
     	<%@include file="navbar.jsp" %>
     	<br>
     	<h1 class="text-uppercase mx-5">All Notes:</h1>
     	 <%
        // 1. Open Hibernate session
        Session s = FactoryProvider.getFactory().openSession();

        // 2. Typed query to fetch all Note objects
        List<Note> notesList = s.createQuery("from Note", Note.class).list();

        // 3. Close session
        s.close();

        // 4. Iterate and display notes
        for (Note note : notesList) {
    %>
    
		<div class="card mx-5" style="width: auto;">
	  		<div class="card-body">
	    		<h5 class="card-title"><%= note.getTitle() %></h5>
	    		<p class="card-text"><%= note.getContent() %></p>
	    		<a href="DeleteServlet?note_id=<%= note.getId() %>" class="btn btn-danger">Delete</a>
	    		<a href="edit.jsp?note_id=<%= note.getId() %>" class="btn btn-primary">Update</a>
	  		</div>
		</div>    
    
    <%
        }
    %>
    </div>
</body>
</html>