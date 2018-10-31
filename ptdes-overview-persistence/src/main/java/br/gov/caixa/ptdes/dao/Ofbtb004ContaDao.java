package br.gov.caixa.ptdes.dao;

import javax.ejb.Stateless;

import br.gov.caixa.ptdes.entity.Ofbtb004Conta;
@Stateless
public class Ofbtb004ContaDao extends DaoImpl<Ofbtb004Conta, Long>{

	public Ofbtb004ContaDao() {
		super(Ofbtb004Conta.class);
	}

}
