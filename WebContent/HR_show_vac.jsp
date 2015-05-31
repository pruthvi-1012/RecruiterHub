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
   


<tr><td>vacancy id:</td>



<td>Vacancy title:</td>




<td>creation date:</td>


<td>closing date:</td>


<td>experiance:</td>


<td>functional area:</td>


<td>no of vacancy:</td>


<td>education:</td>


<td>specification:</td>


<td>location:</td>


<td>telephone:</td>


<td>refrance:</td>

</tr>

<s:iterator value="info" id="CreateVacancyPojo" >
<tr>
<td><s:property value="vac_id"/></td>
<td><s:property value="vac_title"/></td>
<td><s:property value="creation_date"/></td>
<td><s:property value="closing_date"/></td>
<td><s:property value="experiance"/></td>
<td><s:property value="functional_area"/></td>
<td><s:property value="no_vacancy"/></td>
<td><s:property value="education"/></td>
<td><s:property value="specification"/></td>
<td><s:property value="location"/></td>
<td><s:property value="telephone"/></td>
<td><s:property value="job_ref_no"/></td>
<td>
<s:param name="vac_title">
<s:property value="vac_title"/>   </s:param>    
<s:a href="vac_edit.jsp">Edit</s:a>
</td>

<td><s:url id="url" action="vac_delete.action">
<s:param name="vac_id">
<s:property value="vac_id"/>   </s:param>    </s:url>
<s:a href="%{url}">Delete</s:a>
</td>

</tr>
    </s:iterator>
    </table>
    
    

</body>
</html>