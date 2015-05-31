<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="placement.action">

<s:textfield name="clj_name" label="COLLEGE NAME"></s:textfield>
<s:textfield name="clj_address" label="COLLEGE ADDRESS"></s:textfield>
<s:textfield name="placement_date" label="PLACEMENT DATE"></s:textfield>
<s:textfield name="placement_time" label="PLACEMENT DETAIL"></s:textfield>

<s:textfield name="contact_tpo" label="TPO CONTACT"></s:textfield>
<s:select name="interview_department" label="INTERVIEW DEPARTMENT" list="{'HR','Technical'}"/>
<s:textfield name="interviewer_name" label="INTERVIEWER NAME"/>
<s:submit value="ADD"></s:submit>



</form>


</body>
</html>