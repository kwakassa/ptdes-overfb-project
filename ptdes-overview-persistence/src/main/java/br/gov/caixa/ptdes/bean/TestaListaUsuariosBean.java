package br.gov.caixa.ptdes.bean;

import java.io.Serializable;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.inject.Inject;

import br.gov.caixa.ptdes.dao.Ofbtb002UsuarioDao;
import br.gov.caixa.ptdes.entity.Ofbtb002Usuario;

@Stateless
public class TestaListaUsuariosBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Inject
	private Ofbtb002UsuarioDao dao;
	
	public List<Ofbtb002Usuario> buscaTodosUsuarios(){
		return dao.buscaTudo();
	}
}
