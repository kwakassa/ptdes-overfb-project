package br.gov.caixa.ptdes.dao;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;

import br.gov.caixa.ptdes.entity.Ofbtb002Usuario;
@Stateless
public class Ofbtb002UsuarioDao implements Serializable{
	private static final long serialVersionUID = 1L;
	private static final Logger logger = Logger.getLogger(Ofbtb002UsuarioDao.class);
	protected Class<Ofbtb002Usuario> type;
	protected String entityName;
	
	@PersistenceContext(unitName = "ofbDS")
	protected EntityManager em;
	
	public Ofbtb002UsuarioDao() {
		type = Ofbtb002Usuario.class;
		entityName = type.getSimpleName();
	}
	
	public Ofbtb002Usuario obtemUsuarioDoBanco(String usuario){
		logger.info("Buscando na base o usuario: " + usuario);
		Ofbtb002Usuario usuarioDb = null;
		try {
			usuarioDb = (Ofbtb002Usuario)em.createQuery("Select u from " + type.getName() + " u where u.noUsuario = :usuario").setParameter("usuario", usuario.toUpperCase()).getSingleResult();
		} catch (NoResultException | NullPointerException e) {
			logger.info(e.getClass() + " - Usuario " + usuario + " nao encontrado na base.");
		}		
		return usuarioDb;
	}
	
	public List<Ofbtb002Usuario> buscaTudo(){		
		logger.info("EntityManager: " + em);
		return em.createQuery("from " + type.getName()).getResultList();
	}
	
	protected void setEntityManager(EntityManager em){
		this.em = em;
	}
	
	public void insere(Ofbtb002Usuario entidade) throws SQLException {
		em.getTransaction().begin();
		em.persist(entidade);
		em.flush();
		em.getTransaction().commit();
	}

	public void remove(Ofbtb002Usuario entidade) throws SQLException {
		em.getTransaction().begin();
		em.remove(entidade);
		em.flush();
		em.getTransaction().commit();;
		
	}
	/* Recupere o objeto com a buscaPorId, altere os atributos e depois executa a atualizacao*/
	public void atualiza(Ofbtb002Usuario entidade) throws SQLException {
		em.getTransaction().begin();
		em.merge(entidade);
		em.flush();
		em.getTransaction().commit();
	}

	public Ofbtb002Usuario buscaPorId(Long pk) throws SQLException {
		return em.find(type, pk);
	}
}
