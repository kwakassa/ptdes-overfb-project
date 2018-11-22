package br.gov.caixa.overfb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import br.gov.caixa.overfb.constante.Constantes;
import br.gov.caixa.ptdes.helper.LoginHelper;
import br.gov.caixa.ptdes.vo.UsuarioVO;

@WebServlet(name="LogoutServlet" , urlPatterns = "/logout")
public class LogoutServlet  extends HttpServlet{
	private static final Logger logger = Logger.getLogger(LogoutServlet.class);
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		logger.info(" --- Inicio LogoutServlet ---");
		logger.info(" --- Limpando Valores da Sessao ---");
		limpaSessao(request);
		direcionaParaPaginaDeLogout(request, response);
		logger.info(" --- Fim LogoutServlet ---");
	}
	
	private void limpaSessao(HttpServletRequest request){
		request.getSession().removeAttribute(Constantes.USUARIO_LOGADO);
		request.getSession().removeAttribute(Constantes.GRUPO_USUARIO_LOGADO);
	}
	
	private void direcionaParaPaginaDeLogout(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		logger.info("--- Redirecionando para pagina de logout ---");
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/paginas/logout.jsp");
		dispatcher.forward(request, response);
	}
	
	
}
