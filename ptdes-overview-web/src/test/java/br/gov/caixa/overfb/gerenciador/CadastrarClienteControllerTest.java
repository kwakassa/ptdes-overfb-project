package br.gov.caixa.overfb.gerenciador;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Test;
import org.mockito.InjectMocks;

public class CadastrarClienteControllerTest {
	@InjectMocks
	private CadastrarClienteController cadastrarClienteController;
	@InjectMocks
	private HttpServletRequest request;
	@InjectMocks
	private HttpServletResponse response;
	
	@Test
	public void test() {
		cadastrarClienteController.executa(request, response);
	}

}
