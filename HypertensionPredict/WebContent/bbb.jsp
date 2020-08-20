<html>

    <%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>

    <%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>

    <f:view>
       <head>
      </head>
     <body>
        <h:form>
          <table>
                <tr>
                   <td>
                     <h:selectOneRadio value="#{form.education}">
                         <f:selectItems value="#{form.educationItems}"/>
                     </h:selectOneRadio>
                   </td>
                </tr>
             </table>
             <h:commandButton value="Submit" action ="ccc"/>
         </h:form>
       </body>
    </f:view>
 </html>
