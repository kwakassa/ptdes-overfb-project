package br.gov.caixa.ptdes.dao;

import javax.ejb.Stateless;

import br.gov.caixa.ptdes.entity.Ofbtb001GrupoAcesso;
@Stateless
public class Ofbtb001GrupoAcessoDao extends DaoImpl<Ofbtb001GrupoAcesso, Long>{

	public Ofbtb001GrupoAcessoDao() {
		super(Ofbtb001GrupoAcesso.class);
	}
	
}
