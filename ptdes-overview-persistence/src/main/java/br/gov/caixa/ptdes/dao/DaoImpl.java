package br.gov.caixa.ptdes.dao;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;

public abstract class DaoImpl<E,PK extends Serializable> implements Dao<PK, E> {
	private static final Logger logger = Logger.getLogger(DaoImpl.class);
	@PersistenceContext(unitName = "ofbDS")
	protected EntityManager em;
	
	protected Class<? extends E> type;
	protected String entityName;
	
	protected DaoImpl(Class<? extends E> classe) {
		type = classe;
	    entityName = type.getSimpleName();
	}
	
	@Override
	public List<E> buscaTudo(){		
		logger.info("EntityManager: " + em);
		return em.createQuery("from " + type.getName()).getResultList();
	}
	
	protected void setEntityManager(EntityManager em){
		this.em = em;
	}
	
	@Override
	public void insere(E entidade) throws SQLException {
		em.getTransaction().begin();
		em.persist(entidade);
		em.flush();
		em.getTransaction().commit();
	}

	@Override
	public void remove(E entidade) throws SQLException {
		em.getTransaction().begin();
		em.remove(entidade);
		em.flush();
		em.getTransaction().commit();;
		
	}
	/* Recupere o objeto com a buscaPorId, altere os atributos e depois executa a atualizacao*/
	@Override
	public void atualiza(E entidade) throws SQLException {
		em.getTransaction().begin();
		em.merge(entidade);
		em.flush();
		em.getTransaction().commit();
	}

	@Override
	public E buscaPorId(PK pk) throws SQLException {
		return em.find(type, pk);
	}
}
