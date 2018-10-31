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

import br.gov.caixa.ptdes.bean.TestaListaUsuariosBean;
import br.gov.caixa.ptdes.entity.Ofbtb002Usuario;

@WebServlet(name="OfbListaUsuariosServlet" , urlPatterns = "/listaUsuarios")
public class OfbListaUsuariosDSServlet extends HttpServlet implements Serializable{
	private static final Logger logger = Logger.getLogger(OfbListaUsuariosDSServlet.class);
	private static final long serialVersionUID = 1L;
	private static final String conteudoHtmlInicio = "<html>\n  <body>\n    <h1>Pagina de teste de Servlet</h1>\n  Lista Usuarios:<br><br>";
	private static final String conteudoHtmlFim = "</body>\n</html>";
	
	@Inject
	private TestaListaUsuariosBean bean;
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		logger.info("inicio servico de OfbListaUsuariosDSServlet");
		String conteudo = conteudoHtmlInicio;
		PrintWriter out = response.getWriter();
		logger.info("instanciando Ofbtb002UsuarioDao()");
		logger.info("TestaUsuarioBean: " + bean);
		logger.info("obtendo lista de usuario do banco");
		List<Ofbtb002Usuario> lista = bean.buscaTodosUsuarios();
		conteudo += "Lista: " + lista;
		for (Ofbtb002Usuario usuario : lista) {
			conteudo += usuario+"<br>";
		}
		conteudo += conteudoHtmlFim;
		logger.info("fim servico de OfbListaUsuariosDSServlet");
		out.println(conteudo);
	}
}
