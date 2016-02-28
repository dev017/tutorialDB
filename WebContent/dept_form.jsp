<%@ page language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-nested" prefix="nested" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html>
  <head>
    <title>Ajout</title>
    <html:base/>
  </head>
  <body bgcolor="white">
    <html:form action="dept" focus="nomDept">
      <table border="0" align="center">
        <tr>
          <td align="right">
            Nom du departement :
          </td>
          <td align="left">
            <html:text property="nomDept" size="20" maxlength="20"/>
          </td>
        </tr>
        <tr>
          <td align="right">
            <html:submit property="submit" value="Submit"/>
          </td>
          <td align="left">
            <html:reset/>
          </td>
        </tr>
      </table>
    </html:form>
  </body>
</html:html>