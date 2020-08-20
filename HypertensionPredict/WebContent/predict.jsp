<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<html>
<f:view>
<head>
<link href="style/formstyle.css" type=text/css rel=stylesheet>
<title>Predict Hyertension</title>
</head>
<body>
<body>
<table border="0" width="100%" id="table1" cellspacing="0" cellpadding="0">
	<tr>
		<td width="100">&nbsp;</td>
		<td>
		<h:form>
		<table width="100%" id="table2" class="TableBorderFrm">
			<tr>
				<td class="CellBorderCaptionFrm">
                                  <img border="0" src="image\infor.gif" alt="">
                                  Enter information
                                </td>
			</tr>
			<tr>
				<td class="CellBorderFrm">
				<table border="0" width="100%" id="table3" cellspacing="1">
					<tr>
						<td width="26%" class="Label">Full Name</td>
						<td width="73%"><h:inputText size="39" value="#{formPredict.fullName}"/></td>
					</tr>
					<tr>
						<td width="26%" class="Label">Age</td>
						<td width="73%"><h:inputText size="8" value="#{formPredict.age}"/></td>
					</tr>
					<tr>
                                                <td width="26%" class="Label">Sex</td>
						<td width="73%">
                                                	<h:selectOneRadio value="#{formPredict.sex}" styleClass="Label">
                                                            <f:selectItem itemValue="Male" itemLabel="Male" />
                                                            <f:selectItem itemValue="Female" itemLabel="Female"/>
                                                        </h:selectOneRadio>
						</td>
					</tr>
					<tr>
						<td width="26%" class="Label">Height</td>
						<td width="73%"><h:inputText size="9" value="#{formPredict.height}"/></td>
					</tr>
					<tr>
						<td width="26%" class="Label">Weight</td>
						<td width="73%"><h:inputText size="9" value="#{formPredict.weight}"/></td>
					</tr>
					<tr>
						<td width="26%" class="Label">Waist Size</td>
						<td width="73%"><h:inputText size="9" value="#{formPredict.waistSize}"/></td>
					</tr>
					<tr>
						<td width="26%" class="Label">Hip Size</td>
						<td width="73%"><h:inputText size="9" value="#{formPredict.hipSize}"/></td>
					</tr>
					<tr>
						<td width="26%" class="Label">Systole Blood Pressure</td>
						<td width="73%"><h:inputText size="9"  value="#{formPredict.systoleBloodPressure}"/></td>
					</tr>
					<tr>
						<td width="26%" class="Label">Diastole Blood Pressure</td>
						<td width="73%"><h:inputText size="9"  value="#{formPredict.diastoleBloodPressure}"/></td>
					</tr>
					<tr>
						<td width="26%" class="Label">Cholesterol</td>
						<td width="73%"><h:inputText size="9" value="#{formPredict.cholesterol}"/></td>
					</tr>
					<tr>
						<td width="26%" class="Label">Glycemic</td>
						<td width="73%"><h:inputText size="9" value="#{formPredict.glycemic}"/></td>
					</tr>
					<tr>
						<td width="26%" class="Label">Triglycerid</td>
						<td width="73%"><h:inputText size="9" value="#{formPredict.triglycerid}"/></td>
					</tr>
					<tr>
						<td width="26%" class="Label">HDL-C</td>
						<td width="73%"><h:inputText size="9" value="#{formPredict.hdl_C}"/></td>
					</tr>
					<tr>
						<td width="26%" class="Label">LDL-C</td>
						<td width="73%"><h:inputText size="9" value="#{formPredict.ldl_C}"/></td>
					</tr>
					<tr>
						<td width="26%" class="Label">Diabetes Past History</td>
						<td width="73%">
						<h:selectBooleanCheckbox value="#{formPredict.diabetesPastHistory}"/></td>
					</tr>
					<tr>
						<td width="26%" class="Label">Smoking</td>
						<td width="73%">
                                                	<h:selectOneRadio value="#{formPredict.smoking}" styleClass="Label">
                                                            <f:selectItem itemValue="Never" itemLabel="Never" />
                                                            <f:selectItem itemValue="Before" itemLabel="Before"/>
                                                            <f:selectItem itemValue="Present" itemLabel="Present"/>
                                                        </h:selectOneRadio>
                                                </td>
					</tr>
					<tr>
						<td width="26%" class="Label">Exercise</td>
						<td width="73%">
						<h:selectBooleanCheckbox  value="#{formPredict.exercise}"/></td>
					</tr>
					<tr>
						<td width="99%" colspan="2">
						<table border="0" width="100%" id="table5" cellspacing="0" cellpadding="0">
							<tr>
								<td width="211">&nbsp;</td>
								<td width="74">
								<h:commandButton value="Predict" type="submit" styleClass="Button" action="#{formPredict.diagnose}"/></td>
								<td width="63">
								<h:commandButton value="Reset" type="reset" styleClass="Button" action="#{formPredict.reset}" /></td>
								<td>&nbsp;</td>
							</tr>
						</table>
						</td>
					</tr>
				</table>
				</td>
			</tr>
		</table>
		</h:form>
		</td>
		<td width="100">&nbsp;</td>
	</tr>
</table>
</body>
</f:view>
</html>
