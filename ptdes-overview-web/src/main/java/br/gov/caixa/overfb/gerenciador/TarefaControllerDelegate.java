package br.gov.caixa.overfb.gerenciador;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Stateless
public class TarefaControllerDelegate {
	
	@Inject
	private CadastroClientePageController cadastroClientePageController;
	@Inject
	private CadastrarClienteController cadastrarClienteController;
	
	public String delegate(HttpServletRequest request, HttpServletResponse response, String tarefa){
		if(tarefa.equals("irParaPaginaDeCadastro")){
			return cadastroClientePageController.executa(request, response);
		}else if(tarefa.equals("cadastrarCliente")){
			return cadastrarClienteController.executa(request, response);
		}else{
			return "pagina-nao-existe.jsp";
		}
	}
	
}
