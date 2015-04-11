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
<div align="left">
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
<div align="center">
<form:form method="post"  modelAttribute="enggDetails"  action="submitEnggDetails">
	Tuition Fee<br><form:input path="tuitionFee"/><br>
	Fall Deadline(dd/mm/yy)<br><form:input path="fallDeadline"/><br>
	Spring Deadline(dd/mm/yy)<br><form:input path="springDeadline"/><br>
	Summer Deadline(dd/mm/yy)<br><form:input path="summerDeadline"/><br>
	Quant Score<br><form:input path="greQuant"/><br>
	Verbal Score<br><form:input path="greVerbal"/><br>
	AWA Score<br><form:input path="greAwa"/><br>
	IELTS<br><form:input path="ielts"/><br>
	TOEFL<br><form:input path="toefl"/><br>
	SOURCE URL<br><form:input path="eslSourceUrl"/><br>
	Mailing Address<br><form:input path="mailingAddress"/><br>
	<input type="submit" value="Submit"><br>
</form:form>
</div>
</body>
</html>