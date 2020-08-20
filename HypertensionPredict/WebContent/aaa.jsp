<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<html>
<f:view>
<head>
<title>
aaa
</title>
</head>
<body bgcolor="#ffffff">
<h1>
JBuilder Generated JSP
</h1>
<h:form>
<h:selectOneRadio value="#{frm.condiments}">
    <f:selectItem itemValue="1" itemLabel="High School"/>
    <f:selectItem itemValue="2" itemLabel="Bachelor's"/>
    <f:selectItem itemValue="3" itemLabel="Master's"/>
    <f:selectItem itemValue="4" itemLabel="Doctorate"/>
</h:selectOneRadio>
</h:form>
</body>
</f:view>
</html>
