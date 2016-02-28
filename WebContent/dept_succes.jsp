<%@ page language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html >
	<head>
	  <title>Succes</title>
	  <html:base/>
	</head>
	<body bgcolor="white">
		<h1> Un nouveau departement a ete ajoute au nom de : 
			<bean:write name="deptForm" property="nomDept" />
		</h1>
	</body>
</html:html>