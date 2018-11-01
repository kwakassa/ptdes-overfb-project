package br.gov.caixa.ptdes.dao;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

import javax.ejb.Remote;

@Remote
public interface Dao<PK extends Serializable, E> {

	public void insere(E entidade) throws SQLException;

	public void remove(E entidade) throws SQLException;

	public void atualiza(E entidade) throws SQLException;

	public E buscaPorId(PK pk) throws SQLException;

	public List<E> buscaTudo() throws SQLException;

}
