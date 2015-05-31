<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body>
<table width="1280" height="151" border="0">
    <tr>
     <td width="200" valign="top"><div align="center">
        <p>&nbsp;</p>
        <p style="font-size:24px">Recruiter</p>
        <p>Hub</p>
      </div></td>
      <td width="980" valign="top"><input type="image" src="images\image1.jpg" height="150" width="1100" /></td>
  </tr>
  </table>
<table width="1280" border="0">
  <tr>
    <td width="168">&nbsp;</td>
    <td width="194" align="center">
    <a href="Home.jsp" > Home</td>
    <td width="278" align="center">
    <a href="Register.jsp"> New Registration?</td>
    <td width="319" align="center">
    <a href="About Us.jsp"> About us</td><td width="83"></td>
    <td width="208" align="center">
    <a href="Contact us.jsp"> Contact us</td><td width="0"></td>
  </tr>
</table>
<table width="1280" height="700" border="1">
  <tr>
    <td width="170" align="center" valign="top" bgcolor="#FFFF00">
      <p>&nbsp;      </p>
      <p>&nbsp;</p>
      <p>&nbsp;</p>
      <div align="center">
        <p><a href="E:\My Folders\Dreamwawer\Admin Vacancy Management.jsp"> Vacancy Management</a></p>
        <p>&nbsp;</p>
        <p>
            <a href="Schedule Management.jsp"> Schedule Management</a></p>
        <p>&nbsp;</p>
        <p>
            <a href="Applicant Management.jsp"> Applicant Management</a></p>
        <p>&nbsp;</p>
        <p>
             <a href="Report.jsp"> Reports </a>
          </p>
      </div>
    </p></td>
    <td width="926" valign="top"><table width="922" height="694" border="0">
      <tr>
        <td height="52px" colspan="3" align="right" bgcolor="#cc00ff">
        <a href="Change Password.jsp"> Change Password </a> |
        <a href="Logout.jsp"> Logout </a>
        </td>
        </tr>
      <tr>
        <td width="180">&nbsp;</td>
        <td width="548" valign="top"><table width="548" height="314" border="0">
          <tr>
            <td width="330">&nbsp;</td>
            <td width="208">&nbsp;</td>
          </tr>
          <tr>
            <td colspan="2" align="center" bgcolor="#FFFF33" style="font-size:24px">Vacancy Management</td>
            </tr>
          <tr>
            <td align="center">New Vacancy?</td>
            <td align="center">
            <s:form action="CreateVacancy.action">
            <s:submit value="create vacancy"></s:submit>
            </s:form>
            </td>
          </tr>
          <tr>
            <td height="47" align="center">Edit Vacancy</td>
            <td align="center">
             <s:form action="CreateVacancy.action">
            <s:submit value="create vacancy"></s:submit>
            </s:form>
             </td>
          </tr>
          <tr>
            <td align="center">View Details of Vacancy</td>
            <td align="center"> 
             <s:form action="ViewVacancy.action">
            <s:submit value="Vacancy Details"></s:submit>
            </s:form>
             </td>
          </tr>
        </table></td>
        <td width="180">&nbsp;</td>
      </tr>
    </table>    </td>
    <td width="170" valign="top" bgcolor="#FFFF00">&nbsp;</td>
  </tr>
</table>


</body>
</html>