<!DOCTYPE html>
<html>
<head>
<title>Tela de boas-vindas</title>
<meta charset="utf-8">
<link rel="icon" href="/overfb/img/favicon.png">
<link rel="stylesheet" href="/overfb/css/reset.css">
<link rel="stylesheet" href="/overfb/css/site.css">
<style>
h1 {
	padding: 0px;
	margin: 0px;
	display: inline;
}
</style>
</head>
<body>
	<iframe class="cabecalho" src="/overfb/cabecalho.jsp" seamless></iframe>
	<div>
		<img src="/overfb/img/logo2.png" height="45">
		<h1>PTDES - Overview Frontend e Backend - Pagina de INICIO</h1>
	</div>
	<form name="submitForm" method="POST" action="controller">
		<input type="hidden" name="tarefa" value="GerenciadorPaginaTarefa" />
		<input type="hidden" name="pagina" value="cadastroCliente.jsp">
		<A HREF="javascript:document.submitForm.submit()">Cadastro de
			clientes</A>
	</form>
</body>
</html>