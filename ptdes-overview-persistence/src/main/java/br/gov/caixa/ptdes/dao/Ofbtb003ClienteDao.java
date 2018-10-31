package br.gov.caixa.ptdes.dao;

import javax.ejb.Stateless;

import br.gov.caixa.ptdes.entity.Ofbtb003Cliente;
@Stateless
public class Ofbtb003ClienteDao extends DaoImpl<Ofbtb003Cliente, Long>{

	public Ofbtb003ClienteDao() {
		super(Ofbtb003Cliente.class);
	}

}
