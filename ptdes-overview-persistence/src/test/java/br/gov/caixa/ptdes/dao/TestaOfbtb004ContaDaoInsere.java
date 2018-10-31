package br.gov.caixa.ptdes.dao;

import java.sql.SQLException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Ignore;

import br.gov.caixa.ptdes.entity.Ofbtb004Conta;
import br.gov.caixa.ptdes.helper.GeradorContaAleatoriaHelper;

@Ignore
public class TestaOfbtb004ContaDaoInsere {

	public static void main(String[] args) throws SQLException {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("overdb_test");
		EntityManager em = emf.createEntityManager();
		try {
			Ofbtb004ContaDao dao = new Ofbtb004ContaDao();
			dao.setEntityManager(em);
			Ofbtb004Conta conta = new GeradorContaAleatoriaHelper().geraContaAleatoria();
			dao.insere(conta);
			System.out.println("Registro inserido: " + conta.getNuAgencia()+"."+conta.getNuOperacaoProduto()+"."+conta.getNuConta());
			System.out.println("ID: " + conta.getNuNsuConta());
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			em.close();
			emf.close();
		}
	}

}
