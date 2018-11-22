package br.gov.caixa.overfb.gerenciador;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

public class CadastrarClienteController {
	public static void executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomeCliente = request.getParameter("nomeCliente");
		String cpf = request.getParameter("cpf");
		if(nomeCliente!=null && !nomeCliente.isEmpty() && cpf!=null && !cpf.isEmpty()){
			if(validaCpf(cpf)){
				
			}else{
				direcionaParaDadosInvalidos(request, response);
			}
		}else{
			direcionaParaDadosInvalidos(request, response);
		}
	}
	
	private static boolean validaCpf(String cpf) {
		
		return false;
	}

	private static void direcionaParaDadosInvalidos(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/paginas/dados-invalidos.jsp");
		dispatcher.forward(request, response);
	}
	
}
