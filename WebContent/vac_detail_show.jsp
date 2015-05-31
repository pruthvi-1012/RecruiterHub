<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="/struts-tags" prefix="s"%>
    <%@taglib uri="http://displaytag.sf.net/el" prefix="display" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
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
        <td align="center" valign="middle"> <a href="vac_detail_show.jsp"> View Vacany</td>
      </tr>
      <tr>
        <td align="center" valign="middle"><a href="Applicat_view_details.jsp"> View Details</a></td>
      </tr>
      <tr>
        <td align="center" valign="middle"> <a href="Applicant_Edit_details.jsp"> Edit Details</a></td>
      </tr>
      <tr>
        <td align="center" valign="middle"><a href="logout.jsp">log out</td>
      </tr>
    </table>    
    <p>&nbsp;</p></td>
    <td width="930" align="center" valign="top"><p>&nbsp;</p>
    <p>&nbsp;</p>
    <p>&nbsp;</p>
    <p align="center" class="style1"> 
    <p align="center" style="color:#0000FF;font-size:36px"> Details of Vacancies are as Below</p>
    
    <table width="900">
    
    <tr>
    
    <td>
    
    <table datapagesize="1">
   

<s:iterator value="info" id="CreateVacancyPojo" >
<tr><td style="color: blue;font-weight: bolder;font-size: x-large">vacancy id:</td>

<td><s:property value="vac_id"/></td></tr>

<tr><td style="color: blue;font-weight: bolder;font-size: x-large">Vacancy title:</td>

<td><s:property value="vac_title"/></td></tr>


<td style="color: blue;font-weight: bolder;font-size: x-large">creation date:</td>
<td><s:property value="creation_date"/></td>

<td style="color: blue;font-weight: bolder;font-size: x-large"> &nbsp; &nbsp; &nbsp; &nbsp;closing date:</td>
<td><s:property value="closing_date"/></td>

<tr><td style="color: blue;font-weight: bolder;font-size: x-large">experiance:</td>
<td><s:property value="experiance"/></td></tr>

<tr><td style="color: blue;font-weight: bolder;font-size: x-large">functional area:</td>
<td><s:property value="functional_area"/></td></tr>

<tr><td style="color: blue;font-weight: bolder;font-size: x-large">no of vacancy:</td>
<td><s:property value="no_vacancy"/></td></tr>

<tr><td style="color: blue;font-weight: bolder;font-size: x-large">education:</td>
<td><s:property value="education"/> </td> </tr>

<tr><td style="color: blue;font-weight: bolder;font-size: x-large">specialization:</td>
<td><s:property value="specialization"/></td></tr>

<tr><td style="color: blue;font-weight: bolder;font-size: x-large">location:</td>
<td><s:property value="location"/></td></tr>

<tr><td style="color: blue;font-weight: bolder;font-size: x-large">telephone:</td>
<td><s:property value="telephone"/></td></tr>

<tr><td style="color: blue;font-weight: bolder;font-size: x-large">refrance:</td>
<td><s:property value="job_ref_no"/></td></tr>
<s:form action="clickapply.action">
<s:submit value="apply"></s:submit>
</s:form>

<tr><td>&nbsp;&nbsp; </td></tr>
<tr><td>&nbsp;&nbsp; </td></tr>
<tr><td>&nbsp;&nbsp; </td></tr>
<tr><td>&nbsp;&nbsp; </td></tr>

</s:iterator>
    
    
    
    
    
    
    
    
    </td>
    </tr>
    
    </table>
    
    
    
    
    
    
    
    
    
    </p></td>
    <td width="217">&nbsp;</td>
  </tr>
  <tr>
    <td colspan="3" align="center"><p>Copyright © 2010 - 2011 Cygnet Infotech Pvt. Ltd. All Rights Reserved.</p>    </td>
  </tr>
</table>
</body>
</html>