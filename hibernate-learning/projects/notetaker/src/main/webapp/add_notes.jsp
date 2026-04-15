<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Notes</title>
 <%@include file="all_js_css.jsp" %>
</head>
<body>
    
    <div class="container-fluid p-0 m-0">
     	<%@include file="navbar.jsp" %>
     	<br>
     	<h1 class="mx-5">Please Fill Your Note Details</h1>
	 <form action="SaveNoteServlet" method="post" class="mx-5">
	  <div class="mb-3">
	    <label for="title" class="form-label">Note Title</label>
	    <input required name="title" type="text" class="form-control" id="title" aria-describedby="emailHelp">
	  </div>
	  <div class="mb-3">
	    <label for="exampleInputPassword1" class="form-label">Note Content</label>
	   	<textarea required name="content" id="content" placeholder="Enter your content" class="form-control" style="height:300px"></textarea>
	  </div>
	 
	 <div class="container text-center">
	 	<button type="submit" class="btn btn-primary">Add</button>
	 </div>
	</form>
    </div>

</body>
</html>