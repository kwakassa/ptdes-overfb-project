package br.gov.caixa.ptdes.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Ignore;

import br.gov.caixa.ptdes.entity.Ofbtb001GrupoAcesso;

@Ignore
public class TestaOfbtb001GrupoAcessoDaoSelect {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("overdb_test");
		EntityManager em = emf.createEntityManager();
		try {
			Ofbtb001GrupoAcessoDao dao = new Ofbtb001GrupoAcessoDao();
			dao.setEntityManager(em);
			List<Ofbtb001GrupoAcesso> listaRegistros = dao.buscaTudo();
			System.out.println("Num Registros: " + listaRegistros.size());
			for (Ofbtb001GrupoAcesso registro : listaRegistros) {
				System.out.println(registro.getNoGrupoAcesso());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			em.close();
			emf.close();
		}
	}

}
