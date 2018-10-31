package br.gov.caixa.ptdes.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.log4j.Logger;
import org.junit.Ignore;

import br.gov.caixa.ptdes.entity.Ofbtb002Usuario;

@Ignore
public class TestaOfbtb002UsuarioDaoSelectPorNome {
	private static final Logger logger = Logger.getLogger(TestaOfbtb002UsuarioDaoSelectPorNome.class);
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("overdb_test");
		EntityManager em = emf.createEntityManager();
		try {
			Ofbtb002UsuarioDao dao = new Ofbtb002UsuarioDao();
			dao.setEntityManager(em);
			Ofbtb002Usuario usuario = dao.obtemUsuarioDoBanco("c123456");
			logger.info("Usuario: " + usuario);
		} catch (Exception e) {
			logger.error(e.getCause(),e);
		}finally {
			em.close();
			emf.close();
		}
	}

}
