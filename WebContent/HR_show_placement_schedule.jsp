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
<table datapagesize="1" border="1">
   

<tr><td>PLACEMENT ID</td>
<td>COLLEGE NAME</td>
<td>COLLEGE ADDRESS</td>
<td>PLACEMENT DATE</td>
<td>PLACEMENT TIME</td>
<td>TPO CONTACT</td>
<td>INTERVIEW DEPARTMENT</td>
<td>INTERVIEWER NAME</td>
<td>EDIT</td>
<td>DELETE</td>
</tr>

<s:iterator value="info" id="CreateVacancyPojo" >
<tr>
<td><s:property value="placement_id"/> </td>
<td><s:property value="clj_name"/></td>
<td><s:property value="clj_address"/></td>
<td><s:property value="placement_date"/></td>
<td><s:property value="placement_time"/></td>
<td><s:property value="contact_tpo"/></td>
<td><s:property value="interview_department"/></td>
<td><s:property value="interviewer_name"/></td>
<td>
<s:param name="placement_id">
<s:property value="placement_id"/>   </s:param>    
<s:a href="vac_edit.jsp">Edit</s:a>
</td>

<td><s:url id="url" action="placement_delete.action">
<s:param name="placement_id">
<s:property value="placement_id"/>   </s:param>    </s:url>
<s:a href="%{url}">Delete</s:a>
</td>

</tr>
    </s:iterator>
    </table>
    
</body>
</html>