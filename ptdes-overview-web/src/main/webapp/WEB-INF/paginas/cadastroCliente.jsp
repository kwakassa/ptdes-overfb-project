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
	<iframe class="cabecalho" src="/overfb/cabecalho-ifr.jsp" seamless></iframe>
	<div align="center">
		<img src="/overfb/img/logo2.png" height="45">
		<h1>PTDES - Overview Frontend e Backend - P&aacute;gina de
			Cadastro Cliente</h1>
	</div>
	<div align="center">
		<form name="cadastroCliente" action="controller" method="post"
			target="_parent">
			<input type="hidden" name="tarefa" value="cadastrarCliente" />
			<input type="hidden" name="pagina" value="cadastro-sucesso.jsp" />
			<table align="center" width="30%" border="0px">
				<tr align="center">
					<td width="50%">Nome do Cliente:</td>
					<td width="50%"><input name="nomeCliente" type="text" /></td>
				</tr>
				<tr align="center">
					<td>CPF:</td>
					<td><input id="cpf" name="cpf" type="text" /></td>
				</tr>
				<tr align="center">
					<td>Data Nascimento:</td>
					<td><input id="dataNascimento" name="dataNascimento" type="text" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<input type="submit" name="botaoCadastro" value="Cadastrar" />
					</td>
				</tr>
			</table>
		</form>
	</div>
	<script type="text/javascript" src="/overfb/js/MascaraValidacao.js"></script>
	<script type="text/javascript" src="/overfb/js/formata-cpf.js"></script>
	<script type="text/javascript" src="/overfb/js/formata-dataNascimento.js"></script>
</body>
</html>