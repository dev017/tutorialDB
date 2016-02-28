<%@ page language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html>
  <head>
    <title>Ajout</title>
    <html:base/>
  </head>
  <body bgcolor="white">
    <html:form action="personnel" focus="nomPersonnel">
      <table border="0" align="center">
      
        <tr>
          <td align="right">
            Nom :
          </td>
          <td align="left">
            <html:text property="nomPersonnel" size="20" maxlength="20"/>
          </td>
        </tr>
        
        <tr>
          <td align="right">
            Prenom :
          </td>
          <td align="left">
            <html:text property="prenomPersonnel" size="20" maxlength="20"/>
          </td>
        </tr>
        
        <tr>
          <td align="right">
            Date de naissance (dd-mm-yyyy) :
          </td>
          <td align="left">
            <html:text property="dateNaissance" size="20" maxlength="20"/>
          </td>
        </tr>

        <tr>
          <td align="right">
            Id departement :
          </td>
          <td align="left">
            <html:text property="idDept" size="20" maxlength="20"/>
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