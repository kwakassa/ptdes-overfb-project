package br.gov.caixa.overfb.gerenciador;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TarefaControllerDelegate {
	
	public static void delegate(HttpServletRequest request, HttpServletResponse response, String tarefa) throws ServletException, IOException{
		if(tarefa.equals("irParaPaginaDeCadastro")){
			CadastroClientePageController.executa(request, response);
		}else if(tarefa.equals("cadastrarCliente")){
			CadastrarClienteController.executa(request, response);
		}
	}
	
}
