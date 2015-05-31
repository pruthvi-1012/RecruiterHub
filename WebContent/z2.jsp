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
 <table border="1">
 <tr>
   <td colspan="17" align="center">Details of Registered Applicants</td>
  </tr>

 <tr>
    <td>ID</td>
    <td>name</td>
    <td>city</td>
    <td>branch</td>
    </tr>
    <s:iterator id="AppRegPojo" value="info1">
 <tr>
 <s:textfield value="%{name}" name="name"/>

<s:textfield value="%{age}" name="age"/>
  
    <td><s:property value="appno"/> </td>
    <td><s:property value="name"/> </td>
    <td><s:property value="city"/> </td>
    <td><s:property value="branch"/> </td>
    </tr>
    </s:iterator>
    </table>
</body>
</html>