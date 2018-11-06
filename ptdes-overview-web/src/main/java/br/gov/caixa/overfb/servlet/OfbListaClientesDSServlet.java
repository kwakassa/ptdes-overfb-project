package br.gov.caixa.overfb.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import br.gov.caixa.ptdes.dao.Ofbtb003ClienteDao;
import br.gov.caixa.ptdes.entity.Ofbtb003Cliente;

@WebServlet(name="OfbListaClientesServlet" , urlPatterns = "/listaClientes")
public class OfbListaClientesDSServlet extends HttpServlet implements Serializable{
	private static final Logger logger = Logger.getLogger(OfbListaClientesDSServlet.class);
	private static final long serialVersionUID = 1L;
	private static final String conteudoHtmlInicio = "<html>\n  <body>\n    <h1>Pagina de teste de Servlet</h1>\n  Lista Clientes:<br><br>";
	private static final String conteudoHtmlFim = "</body>\n</html>";
	
	@Inject
	private Ofbtb003ClienteDao dao;
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		logger.info("inicio servico de " + this.getClass().getSimpleName());
		String conteudo = conteudoHtmlInicio;
		PrintWriter out = response.getWriter();
		logger.info("instanciando Ofbtb003ClienteDao()");
		logger.info("Ofbtb001GrupoAcessoDao: " + dao);
		logger.info("obtendo lista de clientes do banco");
		List<Ofbtb003Cliente> lista = dao.buscaTudo();
		logger.info("Lista: " + lista);
		conteudo += "Lista: <br>";
		for (Ofbtb003Cliente cliente : lista) {
			conteudo += cliente+"<br>";
		}
		conteudo += conteudoHtmlFim;
		logger.info("fim servico de " + this.getClass().getSimpleName());
		out.println(conteudo);
	}
}
