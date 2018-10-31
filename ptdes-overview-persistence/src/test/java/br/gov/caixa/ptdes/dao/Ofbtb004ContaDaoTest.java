package br.gov.caixa.ptdes.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import br.gov.caixa.ptdes.entity.Ofbtb004Conta;

public class Ofbtb004ContaDaoTest {
	Logger logger = Logger.getLogger(Ofbtb004ContaDaoTest.class);
	@Test
	public void buscaTodosOsRegistros() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("overdb_test");
		EntityManager em = emf.createEntityManager();
		try {
			Ofbtb004ContaDao dao = new Ofbtb004ContaDao();
			dao.setEntityManager(em);
			List<Ofbtb004Conta> listaRegistros = dao.buscaTudo();
			logger.info("Num Registros: " + listaRegistros.size());
			for (Ofbtb004Conta registro : listaRegistros) {
				logger.info("Conta ID: " + registro.getNuNsuConta() + ", No: "+ registro.getNuAgencia()+"."+registro.getNuOperacaoProduto()+"."+registro.getNuConta());
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
