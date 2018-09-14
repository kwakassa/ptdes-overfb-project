<!DOCTYPE html>
<html xmlns:f="http://java.sun.com/jsp/jstl/core"
		xmlns:h="http://java.sun.com/jsf/html"
		xmlns:ui="http://xmlns.jcp.org/jsf/facelets">
	<head>
		<title>Tela de boas-vindas</title>
		<meta charset="utf-8"/>
		<link rel="icon" href="img/favicon.png">
		<link rel="stylesheet" href="css/reset.css">
		<link rel="stylesheet" href="css/site.css">
	</head>
	<h:body>
		<ui:include src="cabecalho.jsp" />
		<h:div class="div-logo1">
			<h:img src="img/logo2.png" height="45"/>
			<h:h1>PTDES - Overview Frontend e Backend - P&aacute;gina de IN&Iacute;CIO</h:h1>
		</h:div>
		<h:br/>
		<h:form name="submitForm" method="POST" action="controller">
			<h:a href="javascript:document.submitForm.submit()">Cadastro de Clientes</h:a>
		</h:form>
	</h:body>
</html>