<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="/struts-tags" prefix="s"%>
    <%@taglib uri="http://displaytag.sf.net/el" prefix="display" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table align="center" style="text-align: center" >

<tr>

<td>
<display:table name="list" requestURI="/new.action" pagesize="1"  cellpadding="3" cellspacing="3">
<display:column property="vac_id" title="id" style="align:centre"></display:column>
<display:column property="vac_title" title="title" style="align:centre"></display:column>
<display:column property="creation_date" title="creatin date"></display:column>
<display:column property="closing_date" title="closing_date"></display:column>
<display:column property="experiance" title="experiance"></display:column>
<display:column property="functional_area" title="functional area"></display:column>
<display:column property="no_vacancy" title="no vacancy"></display:column>
<display:column property="education" title="education"></display:column>
<display:column property="specialization" title="specialization"></display:column>
<display:column property="location" title="location"></display:column>
<display:column property="telephone" title="telephone"></display:column>
<display:column property="job_ref_no" title="refrance"></display:column>	
</display:table>
</td>	



</tr>


</table>

</body>
</html>