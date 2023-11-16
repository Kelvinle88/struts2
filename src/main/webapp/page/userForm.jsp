<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
  <title>User Form</title>
</head>
<body>
<h2>User Form</h2>

<s:form action="submitForm" method="post">
  <s:textfield label="Username" key="user.username" />
  <s:textfield label="Password" key="user.password" />
  <s:submit value="Submit" />
</s:form>

<%--<s:if test="hasActionErrors()">--%>
  <s:actionerror/>
<%--</s:if>--%>
</body>
</html>
