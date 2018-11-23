package br.gov.caixa.overfb.gerenciador;

import java.io.IOException;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Stateless
public class TarefaControllerDelegate {
	
	@Inject
	private CadastroClientePageController cadastroClientePageController;
	@Inject
	private CadastrarClienteController cadastrarClienteController;
	
	public void delegate(HttpServletRequest request, HttpServletResponse response, String tarefa) throws ServletException, IOException{
		if(tarefa.equals("irParaPaginaDeCadastro")){
			cadastroClientePageController.executa(request, response);
		}else if(tarefa.equals("cadastrarCliente")){
			cadastrarClienteController.executa(request, response);
		}
	}
	
}
