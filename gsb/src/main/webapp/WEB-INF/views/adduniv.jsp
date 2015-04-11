<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add University</title>
</head>
<body>
<h1 align="center">Add New University</h1>
<div align="center">
<form:form method="post"  modelAttribute="univDetails"  action="submitUnivDetails">
	Name<br><form:input path="univName"/><br>
	Code<br><form:input path="univCode"/><br>
	URL<br><form:input path="univUrl"/><br>
	City<br><form:input path="city"/><br>
	State<br><form:input path="state"/><br>
	ZipCode<br><form:input path="zipCode"/><br>
	<input type="submit" value="Submit"><br>
</form:form>
</div>
</body>
</html>