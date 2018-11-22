package br.gov.caixa.overfb.gerenciador;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PaginaControllerDelegate {
	
	public static void delegate(HttpServletRequest request, HttpServletResponse response, String pagina) throws ServletException, IOException{
		if(pagina.equals("cadastroCliente.jsp")){
			CadastroClientePageController.executa(request, response, pagina);
		}else if(pagina.equals("cadastroCliente.jsp")){
			
		}
	}
	
}
