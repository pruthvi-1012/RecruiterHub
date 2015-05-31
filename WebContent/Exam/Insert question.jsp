<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="insertquestion.action">
<table>
<tr>
<s:textarea name="insert_question" label="question"></s:textarea>
</tr>
<tr>
<s:radio list="Options" name="options" ></s:radio>
</tr>
<tr>
<s:submit value="add">

</s:submit>

</table>
</form>
</body>
</html>