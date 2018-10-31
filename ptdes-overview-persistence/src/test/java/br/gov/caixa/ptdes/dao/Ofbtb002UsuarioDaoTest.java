package br.gov.caixa.ptdes.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import br.gov.caixa.ptdes.entity.Ofbtb002Usuario;

public class Ofbtb002UsuarioDaoTest {
	Logger logger = Logger.getLogger(Ofbtb002UsuarioDaoTest.class);
	@Test
	public void buscaTodosOsRegistros() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("overdb_test");
		EntityManager em = emf.createEntityManager();
		try {
			Ofbtb002UsuarioDao dao = new Ofbtb002UsuarioDao();
			dao.setEntityManager(em);
			List<Ofbtb002Usuario> listaRegistros = dao.buscaTudo();
			logger.info("Num Registros: " + listaRegistros.size());
			for (Ofbtb002Usuario registro : listaRegistros) {
				logger.info(registro.getNoUsuario());
			}
			Assert.assertTrue(listaRegistros.size() > 0);
		} catch (Exception e) {
			logger.error("Ocorreu " + e.getClass(), e);
			Assert.fail();
		} finally {
			em.close();
			emf.close();
		}
	}
}
