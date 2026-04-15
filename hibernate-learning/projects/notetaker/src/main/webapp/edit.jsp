<%@page import="com.helper.FactoryProvider"%>
<%@page import="com.entities.Note"%>
<%@page import="org.hibernate.Transaction"%>
<%@page import="org.hibernate.Session"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@include file="all_js_css.jsp"%>
</head>
<body>

	<div class="container-fluid p-0 m-0">
		<%@include file="navbar.jsp"%>
		<h1>Edit Your Notes</h1>
		<br>
		<%
		int noteId = Integer.parseInt(request.getParameter("note_id").trim());
		Session s = FactoryProvider.getFactory().openSession(); 
		Transaction tx = s.beginTransaction();
		Note note = s.find(Note.class,noteId);

		tx.commit();
		s.close();
		%>
		
		 <form action="UpdateServlet" method="post" class="mx-5">
		 
		 <input value="<%= note.getId() %>" name="noteId" type="hidden"/>
			  <div class="mb-3">
			    <label for="title" class="form-label">Note Title</label>
			    <input 
			    required 
			    name="title" 
			    type="text" 
			    class="form-control" 
			    id="title" 
			    aria-describedby="emailHelp" 
			    value="<%= note.getTitle() %>"
			    />
			  </div>
			  <div class="mb-3">
			    <label for="exampleInputPassword1" class="form-label">Note Content</label>
			   	<textarea 
			   	required 
			   	name="content" 
			   	id="content" 
			   	placeholder="Enter your content" 
			   	class="form-control" 
			   	style="height:300px">
			   	<%=note.getContent() %>
			   	</textarea>
			  </div>
			 
			 <div class="container text-center">
			 	<button type="submit" class="btn btn-success">Save Your Notes</button>
			 </div>
		</form>
	</div>
</body>
</html>