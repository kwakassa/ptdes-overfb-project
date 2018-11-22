<!DOCTYPE html>
<html>
	<head>
		<title>P&aacute;gina de login</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" href="css/reset.css">
		<link rel="stylesheet" href="css/site.css">
	</head>
	<body>		
		<h1 class="login-titulo">OVERFB - P&aacute;gina de Login</h1>
		</br>
		<div align="center">
			<form name="overfbLogin" action="login" method="post" target="_parent" accept-charset="UTF-8">
				<table align="center" width="30%" border="0px">
					<tr align="center">
						<td width="10%">Usu&aacute;rio:</td>
						<td width="90%"><input name="usuario" type="text" maxlength="7" /></td>
					</tr>
					<tr align="center">
						<td>Senha:</td>
						<td><input name="senha" type="password" /></td>
					</tr>
					<tr height="150">
						<td colspan="2" align="center">
							<form name="login">
								<input type="submit" name="botaoLogin" value="Enviar" />
							</form>
						</td>
					</tr>
				</table>
			</form>
		</div>
	</body>
</html>