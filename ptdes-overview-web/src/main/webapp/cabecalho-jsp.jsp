<div class="div-cabecalho">
	<img class="img-cabecalho" src="img/logo1.png" /><br>
	<p class="texto-usuario">[<%= session.getAttribute("usuarioLogado") %>,<%= session.getAttribute("grupoUsuarioLogado") %>] </p>
	<form class="mesma-linha" id="cabecalhoForm" method="post" action="logout">
			<input type="hidden" name="pagina" value="logout.jsp" />
			<a class="mesma-linha" href="#" onclick="document.getElementById('cabecalhoForm').submit()"><p class="texto-usuario">Sair</p></a>
	</form>
</div>
