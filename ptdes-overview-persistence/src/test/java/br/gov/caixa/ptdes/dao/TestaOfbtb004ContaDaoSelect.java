package br.gov.caixa.ptdes.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Ignore;

import br.gov.caixa.ptdes.entity.Ofbtb004Conta;

@Ignore
public class TestaOfbtb004ContaDaoSelect {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("overdb_test");
		EntityManager em = emf.createEntityManager();
		try {
			Ofbtb004ContaDao dao = new Ofbtb004ContaDao();
			dao.setEntityManager(em);
			List<Ofbtb004Conta> listaRegistros = dao.buscaTudo();
			System.out.println("Num Registros: " + listaRegistros.size());
			for (Ofbtb004Conta registro : listaRegistros) {
				System.out.println("Conta ID: " + registro.getNuNsuConta() + ", No: "+ registro.getNuAgencia()+"."+registro.getNuOperacaoProduto()+"."+registro.getNuConta());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			em.close();
			emf.close();
		}
	}

}
