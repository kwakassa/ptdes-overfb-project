package br.gov.caixa.ptdes.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Ignore;

import br.gov.caixa.ptdes.entity.Ofbtb003Cliente;

@Ignore
public class TestaOfbtb003ClienteDaoSelect {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("overdb_test");
		EntityManager em = emf.createEntityManager();
		try {
			Ofbtb003ClienteDao dao = new Ofbtb003ClienteDao();
			dao.setEntityManager(em);
			List<Ofbtb003Cliente> listaRegistros = dao.buscaTudo();
			System.out.println("Num Registros: " + listaRegistros.size());
			for (Ofbtb003Cliente registro : listaRegistros) {
				System.out.println("Cliente:  CPF - " + registro.getNuCpfCliente() + ", Nome: " +registro.getNoCliente());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			em.close();
			emf.close();
		}
	}

}
