<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<html>
<f:view>
<head>
<link href="style/formstyle.css" type=text/css rel=stylesheet>
<title>Diagnose Result</title>
</head>
<body>
<table border="0" width="100%" id="table1" cellspacing="0" cellpadding="0">
  <tr>
    <td width="20%">&nbsp;</td>
    <td width="60%">

      <h:dataTable value="#{formPredict.diagnoseResult}" var="result"
        styleClass="BorderTable" headerClass="HeaderTable" columnClasses="OddTableRow,OddTableRow" width="100%">
        <h:column>
          <f:facet name="header">
            <h:outputText value="State"/>
          </f:facet>
          <h:outputText value="#{result.name}"/>
        </h:column>
        <h:column>
          <f:facet name="header">
            <h:outputText value="Belief"/>
          </f:facet>
          <h:outputText value="#{result.value}"/>
        </h:column>
        <h:column>
          <f:facet name="header">
            <h:outputText value="Chart"/>
          </f:facet>
          <h:outputText value="#{result.chartName}" escape="false"/>
        </h:column>
      </h:dataTable>

    </td>
    <td width="20%">&nbsp;</td>
  </tr>
</table>
</body>
</f:view>
</html>
