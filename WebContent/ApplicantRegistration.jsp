<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<s:head theme="ajax"/>
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
        <td height="40"align="center" valign="middle"><a href="file:///E|/EclipseProjects/Pruthvi/MyProject/WebContent/Applicant/ApplicantRegistration.jsp"> Sign Up </a></td>
      </tr>
      <tr>
        <td align="center" valign="middle"><a href="file:///E|/EclipseProjects/Pruthvi/MyProject/WebContent/login.jsp"> Log In</a></td>
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
    
    <table width="479" height="73" border="1">
  <tr>
    <td align="center" style="color:#0000FF;font-size:36px">Applicant Registration</td>
  </tr>
</table>
    <s:form action="App.action">
<table align="center" cellspacing="5" style="font: 400;text-align: left" border="0">

<tr>
<td>
<s:textfield name="name" label="NAME"></s:textfield>
</td>
</tr>
<tr>

<td>
 <s:select name="gender" label="GENDER"
         list="{'Male','Female'}" />
         </td>
         </tr>
         <tr>
         
         <td>
 <s:datetimepicker name="dob" label="DOB"></s:datetimepicker>
 </td>
 </tr>
 <tr>
  <td><s:textfield name="username" label="USERNAME"></s:textfield>
  </td>
  </tr>
  <tr>
  <td><s:password name="password" label="PASSWORD"/></td></tr>
<tr><td><s:password name="password" label="CONFIRM PASSWORD"></s:password></td></tr>
         
<tr><td><s:textfield name="age" label="AGE"></s:textfield></td></tr>
<tr><td><s:textarea name="address" label="ADDRESS"/></td></tr>
<tr><td><s:textfield name="city" label="CITY"></s:textfield></td></tr>
<tr><td><s:textfield name="pincode" label="PINCODE"></s:textfield></td></tr>
<tr><td><s:textfield name="state" label="STATE"></s:textfield></td></tr>
<tr><td><s:textfield name="country" label="COUNTRY"></s:textfield></td></tr>
<tr><td><s:textfield name="branch" label="BRANCH"></s:textfield></td></tr>
<tr><td><s:textfield name="college" label="COLLEGE"></s:textfield></td></tr>
<tr><td><s:textfield name="mark" label="MARKS"></s:textfield></td></tr>
<tr><td><s:select name="degree" label="DEGREE" list="{'B.Tech/B.E','B.Com','B.Sc','B.A','M.Tech','M.Com','M.Sc'}"></s:select></td></tr>
<tr><td><s:textfield name="email" label="EMAIL"></s:textfield></td></tr>
<tr><td><s:textfield name="contact" label="CONTACT"></s:textfield></td></tr>

<tr><td style="text-align: center">
<s:submit value="REGISTER"></s:submit></td></tr>
</table>
</s:form>

       
    
    
    
    
    
    </p></td>
    <td width="217">&nbsp;</td>
  </tr>
  <tr>
    <td colspan="3" align="center"><p align="center">Copyright © 2010 - 2011 Cygnet Infotech Pvt. Ltd. All Rights Reserved.</p>    </td>
  </tr>
</table>

</body>
</html>