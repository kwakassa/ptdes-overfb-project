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
import br.gov.caixa.ptdes.dao.Ofbtb004ContaDao;
import br.gov.caixa.ptdes.entity.Ofbtb001GrupoAcesso;
import br.gov.caixa.ptdes.entity.Ofbtb003Cliente;
import br.gov.caixa.ptdes.entity.Ofbtb004Conta;

@WebServlet(name="OfbListaContasServlet" , urlPatterns = "/listaContas")
public class OfbListaContaDSServlet extends HttpServlet implements Serializable{
	private static final Logger logger = Logger.getLogger(OfbListaContaDSServlet.class);
	private static final long serialVersionUID = 1L;
	private static final String conteudoHtmlInicio = "<html>\n  <body>\n    <h1>Pagina de teste de Servlet</h1>\n  Lista Contas:<br><br>";
	private static final String conteudoHtmlFim = "</body>\n</html>";
	
	@Inject
	private Ofbtb004ContaDao dao;
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		logger.info("inicio servico de " + this.getClass().getSimpleName());
		String conteudo = conteudoHtmlInicio;
		PrintWriter out = response.getWriter();
		logger.info("instanciando Ofbtb004ContaDao()");
		logger.info("Ofbtb004ContaDao: " + dao);
		logger.info("obtendo lista de clientes do banco");
		List<Ofbtb004Conta> lista = dao.buscaTudo();
		logger.info("Lista: " + lista);
		conteudo += "Lista: <br>";
		for (Ofbtb004Conta conta : lista) {
			conteudo += conta+"<br>";
		}
		conteudo += conteudoHtmlFim;
		logger.info("fim servico de " + this.getClass().getSimpleName());
		out.println(conteudo);
	}
}
