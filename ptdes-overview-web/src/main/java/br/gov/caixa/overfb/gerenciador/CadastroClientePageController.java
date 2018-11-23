package br.gov.caixa.overfb.gerenciador;

import java.io.IOException;

import javax.ejb.Stateless;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.gov.caixa.overfb.constante.Constantes;

@Stateless
public class CadastroClientePageController {
	public void executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		HttpSession session = request.getSession();
		String grupo = (String)session.getAttribute(Constantes.GRUPO_USUARIO_LOGADO);
		if(grupo.equals("OFBGES")){
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/paginas/cadastroCliente.jsp");
			dispatcher.forward(request, response);
		}else{
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/paginas/grupo-invalido.jsp");
			dispatcher.forward(request, response);
		}
	}
}
