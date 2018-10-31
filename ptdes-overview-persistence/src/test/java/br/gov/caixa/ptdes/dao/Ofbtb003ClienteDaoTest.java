package br.gov.caixa.ptdes.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import br.gov.caixa.ptdes.entity.Ofbtb003Cliente;

public class Ofbtb003ClienteDaoTest {
	Logger logger = Logger.getLogger(Ofbtb003ClienteDaoTest.class);
	@Test
	public void buscaTodosOsRegistros() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("overdb_test");
		EntityManager em = emf.createEntityManager();
		try {
			Ofbtb003ClienteDao dao = new Ofbtb003ClienteDao();
			dao.setEntityManager(em);
			List<Ofbtb003Cliente> listaRegistros = dao.buscaTudo();
			logger.info("Num Registros: " + listaRegistros.size());
			for (Ofbtb003Cliente registro : listaRegistros) {
				logger.info(registro.getNoCliente());
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
