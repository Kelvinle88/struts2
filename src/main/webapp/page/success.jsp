<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
  <title>Success</title>
</head>
<body>
<h2>Form Submitted Successfully</h2>
<p>Username: <s:property value="user.username" /></p>
<p>Password: <s:property value="user.password" /></p>
</body>
</html>
