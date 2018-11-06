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

import br.gov.caixa.ptdes.dao.Ofbtb001GrupoAcessoDao;
import br.gov.caixa.ptdes.entity.Ofbtb001GrupoAcesso;

@WebServlet(name="OfbListaGrupoAcessoServlet" , urlPatterns = "/listaGrupos")
public class OfbListaGrupoAcessoDSServlet extends HttpServlet implements Serializable{
	private static final Logger logger = Logger.getLogger(OfbListaGrupoAcessoDSServlet.class);
	private static final long serialVersionUID = 1L;
	private static final String conteudoHtmlInicio = "<html>\n  <body>\n    <h1>Pagina de teste de Servlet</h1>\n  Lista Grupos:<br><br>";
	private static final String conteudoHtmlFim = "</body>\n</html>";
	
	@Inject
	private Ofbtb001GrupoAcessoDao dao;
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		logger.info("inicio servico de " + this.getClass().getSimpleName());
		String conteudo = conteudoHtmlInicio;
		PrintWriter out = response.getWriter();
		logger.info("instanciando Ofbtb001GrupoAcessoDao()");
		logger.info("Ofbtb001GrupoAcessoDao: " + dao);
		logger.info("obtendo lista de grupos do banco");
		List<Ofbtb001GrupoAcesso> lista = dao.buscaTudo();
		logger.info("Lista: " + lista);
		conteudo += "Lista: <br>";
		for (Ofbtb001GrupoAcesso grupo : lista) {
			conteudo += grupo+"<br>";
		}
		conteudo += conteudoHtmlFim;
		logger.info("fim servico de " + this.getClass().getSimpleName());
		out.println(conteudo);
	}
}
