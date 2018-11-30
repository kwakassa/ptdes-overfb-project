package br.gov.caixa.overfb.ws.rest;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import br.gov.caixa.ptdes.dao.Ofbtb003ClienteDao;
import br.gov.caixa.ptdes.entity.Ofbtb003Cliente;

@Path("/listaClientesRS")
public class OverfbServicoListaClientesRS {
	
	
	@Inject
	private Ofbtb003ClienteDao dao;
	
	@GET
	@Path("/")
	public Response printVazio(){
		List<Ofbtb003Cliente> lista = dao.buscaTudo();		
		StringBuilder result = new StringBuilder();
		for (Ofbtb003Cliente cliente : lista) {
			result.append(cliente+"\n");
		}
		return Response.status(200).entity(result.toString()).build();
	}
	
}
