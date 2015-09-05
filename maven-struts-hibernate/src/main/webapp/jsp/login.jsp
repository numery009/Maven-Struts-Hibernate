<html>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="struts-bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="struts-html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="struts-logic" %>
<head>
<title>Login</title>
</head>
<body>
	<h1>Login Page</h1>
	
<%-- <struts-html:form method="post" action="/login.do">
 --%><struts-html:form method="post" action="/login">
		<table>
		<tr>
	<td>User ID: </td>
	<td><struts-html:text property="userName" maxlength="50" value=""></struts-html:text></td>
	</tr>
	<br>
	<tr>
	<td>Password: </td>
	<td><struts-html:password property="password"></struts-html:password></td>
	</tr>
	<br>
	<tr>
	<td><input type="submit" value="Login"></td></tr>
	</table>
	</struts-html:form>
</body>
</html>