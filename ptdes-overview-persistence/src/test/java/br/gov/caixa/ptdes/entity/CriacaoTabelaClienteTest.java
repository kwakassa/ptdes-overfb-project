package br.gov.caixa.ptdes.entity;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.apache.log4j.Logger;
import org.junit.Ignore;

@Ignore
public class CriacaoTabelaClienteTest {
	private static final Logger logger = Logger.getLogger(CriacaoTabelaClienteTest.class);
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("overdb_test");
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery("SELECT c FROM Cliente c",Cliente.class);
		List<Cliente> resultList = query.getResultList();
		for (Cliente cliente : resultList) {
			logger.info(cliente);
		}
	}
}
