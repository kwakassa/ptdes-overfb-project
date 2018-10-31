package br.gov.caixa.overfb.ws.rest;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * A codificação e existencia dessa classe substitui
 * as configuracoes no antigo web.xml
 * para o servlet responsavel pelas requisicoes
 * dos Servicos REST
 */
@ApplicationPath("/rest")
public class RestConfig extends Application{
	
}
