<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style type="text/css">
<!--
.style1 {
	font-size: 14px;
	color: #0000FF;
}
.style2 {
	font-size: 24px;
	color: #0000CC;
}
-->
</style>
<title>Insert title here</title>
</head>
<body>
<table width="1403" height="1053" border="1">
  <tr>
   <td width="234" height="171"><img src="file:///E|/EclipseProjects/Pruthvi/MyProject/WebContent/Images/logo.jpg" width="285" height="222" /></td>
    <td colspan="2" bgcolor=""><img src="file:///E|/EclipseProjects/Pruthvi/MyProject/WebContent/Images/nik.jpg" width="1100" height="222"/></td>
  </tr>
  <tr>
    <td height="33">&nbsp;</td>
    <td colspan="2"><table width="1103" border="1">
      <tr>
        <td width="215" height="23" align="center"><a href="home.jsp">Home</a></td>
        <td width="207" height="23" align="center"><a href="login.jsp">Signin</a></td>
        <td width="219" height="23" align="center"><a href="ApplicantRegistration.jsp">Sign Up</a></td>
        <td width="215" height="23" align="center"><a href="aboutus.jsp">About Us</a></td>
        <td width="213" height="23" align="center"><a href="contactus.jsp">Contact Us</a></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td height="759" valign="top"><p>&nbsp;</p>
    <p>&nbsp;</p>
    <p>&nbsp;</p>
    <p>&nbsp;</p>
    <table width="286" height="246" border="0">
      <tr>
        <td height="49" align="center" valign="middle"><img src="file:///E|/EclipseProjects/Pruthvi/MyProject/WebContent/Images/signup.jpg"/></td>
      </tr>
      <tr>
        <td height="40"align="center" valign="middle"><a href="ApplicantRegistration.jsp"> Sign Up </a></td>
      </tr>
      <tr>
        <td align="center" valign="middle"><a href="login.jsp"> Log In</a></td>
      </tr>
      <tr>
        <td>&nbsp;</td>
      </tr>
    </table>    
    <p>&nbsp;</p></td>
    <td width="930" align="center" valign="top"><p>&nbsp;</p>
    <p>&nbsp;</p>
    <p>&nbsp;</p>
    <p align="center" class="style1"> 
   <p style="font-size:24px;color:#0000FF">Already Member?</p>
<p style="font-size:24px;color:#0000FF">LogIn Here </p>
<p> <img src="file:///E|/EclipseProjects/Pruthvi/MyProject/WebContent/Images/login.jpg"/></p>
    <table>
    <s:form action="login.action">
    <tr><td>
<s:textfield name="username" label="UserName" ></s:textfield>
</td></tr>
 <tr><td>
<s:password name="password" label="Password"/>
</td></tr>
 <tr><td>
<s:submit value="login" align="center"></s:submit></td></tr>

</s:form>
    
    </table>
    
    
    
    
    </p></td>
    <td width="217">&nbsp;</td>
  </tr>
  <tr>
    <td colspan="3" align="center"><p align="center">Copyright � 2010 - 2011 Cygnet Infotech Pvt. Ltd. All Rights Reserved.</p>    </td>
  </tr>
</table>
</body>
</html>