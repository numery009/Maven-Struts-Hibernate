<html>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="struts-bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="struts-html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="struts-logic" %>
<body>
	<center>
		<h1>
			<font color="red"> Personal Information </font>
		</h1>
	</center>
<struts-html:form method="post" action="/personalinfo.do">
		<table>
		<tr>
				<td>EmailID</td>
				<td><struts-html:text property="eMailId" maxlength="50" value=""></struts-html:text></td>
				<td><struts-html:errors property="eMailId"/></td>
				
			</tr>
			<tr>
				<td>First Name</td>
				<td><struts-html:text property="firstName" maxlength="50" value=""></struts-html:text></td>
			</tr>
			<tr>
				<td>Middle Name</td>
				<td><struts-html:text property="middleName" maxlength="50" value=""></struts-html:text></td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td><struts-html:text property="lastName" maxlength="50" value=""></struts-html:text></td>
			</tr>
		</table>
		<table>
			<tr>
<!-- 			<td>Gender <input type="radio" name="gendar" value="male" checked="checked">male <input type="radio" name="gendar" value="female">female -->
			 
		<td>Gender <struts-html:radio property="gendar" value="male" >male</struts-html:radio>
		<struts-html:radio property="gendar" value="female" >female</struts-html:radio> 
				</td>
			</tr>
			<tr>
				<td align="center"><input type="submit" value="Next">
				</td>
			</tr>
		</table>
	</struts-html:form>
</body>
</html>
