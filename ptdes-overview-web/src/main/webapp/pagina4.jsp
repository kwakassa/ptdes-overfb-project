<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="br.gov.caixa.ptdes.utils.GeraGanhadores" %>
<%@page import="java.util.List"%>
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Lista de Ganhadores</title>
	</head>
	<body bgcolor="#FFFF99">
		<h1>Lista de Ganhadores</h1>
		<% 
			GeraGanhadores gerador = new GeraGanhadores();
			int numGanhadores = 5;
			List<String> listaNomes = gerador.geraListaGanhadores(numGanhadores); %>
			
			<ul>
		<% 		for (String nome : listaNomes) { %>
			
					<li><%=nome %></li>				
				
		<%	} %>
			</ul>
			<br>
			<a href="pagina3.html">Voltar</a>
			<br>
			<a href="pagina1.html">P&aacute;gina Inicial</a>
	</body>
</html>