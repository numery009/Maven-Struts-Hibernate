<html>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="struts-bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="struts-html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="struts-logic" %>
<body>
	<center>
		<h1>
			<font color="red">Contact Information </font>
		</h1>
	</center>
	
	<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
		<jsp:useBean id="pinfo" class="com.as.sample.form.PersonalInfoForm" scope="session" />  --%>
		
<struts-html:form method="post" action="/contactinfo">
		<table>
		
		<%-- <tr>
		<td><struts-html:hidden property="eMailId" value="${pinfo.eMailId}"/></td>
		</tr> --%> 
			<tr>
				<td>Address</td>
				<td><struts-html:text property="address" maxlength="50" value=""></struts-html:text></td>
			</tr>
			<tr>
				<td>City</td>
				<td><struts-html:text property="city" maxlength="50" value=""></struts-html:text></td>
			</tr>
			<tr>
				<td>State</td>
				<td><struts-html:text property="state" maxlength="50" value=""></struts-html:text></td>
			</tr>
			<tr>
				<td>Country</td>
				<td><struts-html:text property="country" value=""></struts-html:text></td>
			</tr>
			<tr>
				<td>Phone</td>
				<td><struts-html:text property="phone" maxlength="50" value=""></struts-html:text></td>
			</tr>
		</table>
		<table>
			
			<tr>
				<td align="center"><input type="submit" value="Next">
				</td>
			</tr>
		</table>
	</struts-html:form>
</body>
</html>
