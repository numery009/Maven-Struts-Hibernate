<html>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="struts-bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="struts-html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="struts-logic" %>
<body>
	<center>
		<h1>
			<font color="red">Bank Information </font>
		</h1>
	</center>
	
<struts-html:form method="post" action="/bankinfo.do">
		<table>
		 
			<tr>
				<td>Bank Name</td>
				<td><struts-html:text property="bankName" value=""></struts-html:text></td>
			</tr>
			<tr>
				<td>Account No</td>
				<td><struts-html:text property="accountNo" maxlength="50" value=""></struts-html:text></td>
			</tr>
			<tr>
				<td>SSN</td>
				<td><struts-html:text property="ssn" maxlength="50" value=""></struts-html:text></td>
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
