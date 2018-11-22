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

@WebServlet(name="loginServlet" , urlPatterns = "/login")
public class LoginServlet  extends HttpServlet{
	private static final Logger logger = Logger.getLogger(LoginServlet.class);
	private static final long serialVersionUID = 1L;
	
	@Inject
	private LoginHelper loginHelper; 
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		logger.info(" --- Inicio LoginServlet ---");
		logger.info(" --- Limpando Usuario e Grupo da Session caso exista---");
		verificaELimpaSession(request, response);
		logger.info(" --- Inicio LoginServlet ---");
		String usuario = request.getParameter("usuario");
		logger.info("Parametro usuario: " + usuario);
		String senha = request.getParameter("senha");
		logger.info("Parametro senha: " + senha);
		logger.debug("Usuario a ser autenticado: " + "["+usuario+","+senha+"]");
		if(usuario!=null && !usuario.isEmpty() && senha!=null && !senha.isEmpty()){			
			logger.info("Autenticando usuario");
			UsuarioVO usuarioAutenticado = loginHelper.autenticaUsuario(usuario, senha);
			logger.info("Usuario autencicado: " + usuarioAutenticado);
			if (usuarioAutenticado != null) {
				logger.info("Redirecionando para pagina principal");
				HttpSession session = request.getSession();
				session.setAttribute(Constantes.USUARIO_LOGADO, usuarioAutenticado.getUsuario());
				session.setAttribute(Constantes.GRUPO_USUARIO_LOGADO, usuarioAutenticado.getGrupoAcesso());
				RequestDispatcher dispatcher = request.getRequestDispatcher("inicio.jsp");
				dispatcher.forward(request, response);				
			}else{
				request.getSession().removeAttribute(Constantes.USUARIO_LOGADO);
				request.getSession().removeAttribute(Constantes.GRUPO_USUARIO_LOGADO);
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
	
	private void verificaELimpaSession(HttpServletRequest request, HttpServletResponse response){
		String usuarioLogado = (String)request.getSession().getAttribute(Constantes.USUARIO_LOGADO);
		String grupoUsuarioLogado = (String)request.getSession().getAttribute(Constantes.GRUPO_USUARIO_LOGADO);
		logger.info("Usuario Session: " + usuarioLogado);
		logger.info("Grupo Usuario Session: " + grupoUsuarioLogado);
		if (usuarioLogado!=null && !usuarioLogado.isEmpty() && grupoUsuarioLogado != null && !grupoUsuarioLogado.isEmpty() ) {
			request.getSession().removeAttribute(Constantes.USUARIO_LOGADO);
			request.getSession().removeAttribute(Constantes.GRUPO_USUARIO_LOGADO);
		}
	}
}
