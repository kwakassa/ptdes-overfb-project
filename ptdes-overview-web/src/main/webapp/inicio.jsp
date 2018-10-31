<!DOCTYPE html>
<html>
	<head>
		<title>Tela de boas-vindas</title>
		<meta charset="utf-8"/>
		<link rel="icon" href="img/favicon.png">
		<link rel="stylesheet" href="css/reset.css">
		<link rel="stylesheet" href="css/cabecalho-jsp.css">
		<link rel="stylesheet" href="css/site.css">
	</head>
	<body>
		<jsp:include page="cabecalho-jsp.jsp" />
		<div>
			<img src="img/logo2.png" height="45">
			<h1>PTDES - Overview Frontend e Backend - P&aacute;gina de IN&Iacute;CIO</h1>
		</div>
		<br/>
		<form name="submitForm" method="POST" action="controller">
			<a href="javascript:document.submitForm.submit()">Cadastro de Clientes</a>
		</form>
	</body>
</html>