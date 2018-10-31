package br.gov.caixa.ptdes.dao;

import java.sql.SQLException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Ignore;

import br.gov.caixa.ptdes.entity.Ofbtb001GrupoAcesso;

@Ignore
public class TestaOfbtb001GrupoAcessoDaoInsere {

	public static void main(String[] args) throws SQLException {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("overdb_test");
		EntityManager em = emf.createEntityManager();
		try {
			Ofbtb001GrupoAcessoDao dao = new Ofbtb001GrupoAcessoDao();
			dao.setEntityManager(em);
			Ofbtb001GrupoAcesso grupoAcesso = new Ofbtb001GrupoAcesso();
			grupoAcesso.setNoGrupoAcesso("OFBSEG");
			dao.insere(grupoAcesso);
			System.out.println("Registro inserido: " + grupoAcesso.getNoGrupoAcesso() + ", ID: " + grupoAcesso.getNuGrupoAcesso());
		} catch (Exception e) {			
			e.printStackTrace();
		}finally {
			em.close();
			emf.close();
		}		
	}

}
