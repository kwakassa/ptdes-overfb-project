package br.gov.caixa.overfb.gerenciador;

import java.io.IOException;

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

@WebServlet(urlPatterns = "/controller")
public class ControllerServlet extends HttpServlet {
	private static final Logger logger = Logger.getLogger(ControllerServlet.class);
	private static final long serialVersionUID = 1L;
	@Inject
	private TarefaControllerDelegate tarefaControllerDelegate;
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tarefa = request.getParameter("tarefa");
		if (tarefa != null && !tarefa.isEmpty()) {
			tarefaControllerDelegate.delegate(request, response, tarefa);
		}else{
			RequestDispatcher dispatcher = request.getRequestDispatcher("/error.jsp");
			dispatcher.forward(request, response);
		}
	}
}
