package br.gov.caixa.overfb.ws.old.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/oldRS")
public class OverfbServicoOldRS {
	@GET
	@Path("/{param}")
	public String imprimeMensagem(@PathParam("param") String msg){
		return "Hello World Servico Old Rest: " + msg;
	}
	@GET
	@Path("/")
	public String imprimeMensagemSemParametros(){
		return "Chamada do Servico Old Rest sem Parametros";
	}
	
}
