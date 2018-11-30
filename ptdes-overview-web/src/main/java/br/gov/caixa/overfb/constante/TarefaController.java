package br.gov.caixa.overfb.constante;

import javax.ejb.Local;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Local
public interface TarefaController{
	//Deve retornar uma String contendo a pagina a ser direcionada
	public String executa(HttpServletRequest request, HttpServletResponse response);
}
