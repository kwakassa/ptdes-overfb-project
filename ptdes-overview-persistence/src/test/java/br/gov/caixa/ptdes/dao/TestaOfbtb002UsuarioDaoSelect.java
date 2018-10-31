package br.gov.caixa.ptdes.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Ignore;

import br.gov.caixa.ptdes.entity.Ofbtb002Usuario;

@Ignore
public class TestaOfbtb002UsuarioDaoSelect {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("overdb_test");
		EntityManager em = emf.createEntityManager();
		try {
			Ofbtb002UsuarioDao dao = new Ofbtb002UsuarioDao();
			dao.setEntityManager(em);
			List<Ofbtb002Usuario> listaRegistros = dao.buscaTudo();
			System.out.println("Num Registros: " + listaRegistros.size());
			for (Ofbtb002Usuario registro : listaRegistros) {
				System.out.println(registro.getNoUsuario());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			em.close();
			emf.close();
		}
	}

}
