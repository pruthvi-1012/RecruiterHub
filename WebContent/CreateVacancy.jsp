<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
<s:head theme="ajax"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
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
</head>

<body>
<table width="1403" height="1053" border="1">
  <tr>
    <td width="234" height="171"><img src="file:///E|/EclipseProjects/Pruthvi/MyProject/WebContent/Images/logo.jpg" width="285" height="222" /></td>
    <td colspan="2" bgcolor=""><img src="file:///E|/EclipseProjects/Pruthvi/MyProject/WebContent/Images/nik.jpg" width="1100" height="222"/></td>
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
        <td align="center" valign="middle"><a href="change_password.jsp">Change Password</td>
      </tr>
      <tr>
        <td align="center" valign="middle"><a href="vacancy_details.jsp">Vacancy Details</a></td>
      </tr>
      <tr>
        <td align="center" valign="middle"><a href="logout.jsp">logout</a></td>
      </tr>
      <tr>
        <td align="center" valign="middle">&nbsp;</td>
      </tr>
    </table>    
    <p>&nbsp;</p></td>
    <td width="930" align="center" valign="top"><p>&nbsp;</p>
    <p>&nbsp;</p>
    <p>&nbsp;</p>
    <p align="center" class="style1"> 
     <p align="center" style="color:#0000FF;font-size:36px"> CREATE VACANCY</p>
    
        <s:form action="vacancy.action">
<s:textfield name="vac_id" label="VACANCY ID"></s:textfield>
<s:textfield name="vac_title" label="VACANCY TITLE"></s:textfield>
<s:datetimepicker name="creation_date" label="CREATION DATE"/>
<s:datetimepicker name="closing_date" label="CLOSING DATE"/>
<s:textfield name="experiance" label="EXPERIANCE"></s:textfield>
<s:textfield name="functional_area" label="FUNCTIONAL AREA"></s:textfield>
<s:textfield name="no_vacancy" label="NO OF VACANCY"></s:textfield>
<s:textfield name="education" label="EDUCATION"></s:textfield>
<s:textfield name="specialization" label="SPECIALIZATION"></s:textfield>
<s:textfield name="location" label="LOCATION"></s:textfield>
<s:textfield name="telephone" label="TELEPHONE"></s:textfield>
<s:textfield name="job_ref_no" label="VACANCY REFRANCE NO"></s:textfield>
<s:submit value="Create Vacancy"></s:submit>
</s:form>
      
    
    
    
    
    </p></td>
    <td width="217">&nbsp;</td>
  </tr>
  <tr>
    <td colspan="3" align="center"><p>Copyright © 2010 - 2011 Cygnet Infotech Pvt. Ltd. All Rights Reserved.</p>    </td>
  </tr>
</table>

</body>
</html>