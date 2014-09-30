<%--
  Created by IntelliJ IDEA.
  User: hieuvt
  Date: 9/30/2014
  Time: 4:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title></title>
</head>
<body>
<h2>Student Information</h2>
<form:form method="POST" action="/addStudent">
    <table>
        <tr>
            <td><form:label path="name">Name</form:label></td>
            <td><form:input path="name" /></td>
        </tr>
        <tr>
            <td colspan="2"> <input type="submit" value="Submit"/> </td>
        </tr>
    </table>
</form:form>
</body>
</html>
