package br.gov.caixa.overfb.interfaces;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Tarefa {
	
	String executa(HttpServletRequest req, HttpServletResponse response);

}
