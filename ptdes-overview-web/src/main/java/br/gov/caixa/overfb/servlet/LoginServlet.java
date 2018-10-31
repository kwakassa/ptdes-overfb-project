package br.gov.caixa.overfb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import br.gov.caixa.ptdes.helper.LoginHelper;

@WebServlet(name="loginServlet" , urlPatterns = "/autentica")
public class LoginServlet  extends HttpServlet{
	private static final Logger logger = Logger.getLogger(LoginServlet.class);
	private static final long serialVersionUID = 1L;
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		logger.info(" --- Inicio LoginServlet ---");
		String usuario = request.getParameter("usuario");
		logger.info("Parametro usuario: " + usuario);
		String senha = request.getParameter("senha");
		logger.info("Parametro senha: " + senha);
		logger.debug("Usuario a ser autenticado: " + "["+usuario+","+senha+"]");
		if(usuario!=null && !usuario.isEmpty() && senha!=null && !senha.isEmpty()){
			LoginHelper loginHelper = new LoginHelper();
			logger.info("Autenticando usuario");
			boolean autenticado = loginHelper.autenticaUsuario(usuario, senha);
			logger.info("Usuario autencicado: " + autenticado);
			if (autenticado) {
				logger.info("Redirecionando para pagina principal");
				RequestDispatcher dispatcher = request.getRequestDispatcher("inicio.jsp");
				dispatcher.forward(request, response);				
			}else{
				direcionaParaPaginaDeErroLogin(request, response);
			}
		}else{
			direcionaParaPaginaDeErroLogin(request,response);
		}
		logger.info(" --- Fim LoginServlet ---");
	}
	
	private void direcionaParaPaginaDeErroLogin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		logger.info("Redirecionando para pagina de erro");
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/paginas/login-error.jsp");
		dispatcher.forward(request, response);
	}
}
