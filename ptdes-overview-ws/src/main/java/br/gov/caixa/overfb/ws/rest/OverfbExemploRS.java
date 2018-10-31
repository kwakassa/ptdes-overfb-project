package br.gov.caixa.overfb.ws.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/servicoRS")
public class OverfbExemploRS {
	@GET
	@Path("/{param}")
	public Response printMessage(@PathParam("param") String msg){
		String result = "Restful example: " + msg;
		return Response.status(200).entity(result).build();
	}
	@GET
	@Path("/")
	public Response printVazio(){
		String result = "Servico Restful Vazio";
		return Response.status(200).entity(result).build();
	}
	
}
