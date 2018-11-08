package br.gov.caixa.ptdes.helper;

import java.math.BigDecimal;
import java.util.Random;

import br.gov.caixa.ptdes.entity.Ofbtb004Conta;

public class GeradorContaAleatoriaHelper {
	private short[] listaOperacoes = {1,13};
	private short[] listaProdutos = {1288};
	private Random random = new Random();
	
	public Ofbtb004Conta geraContaAleatoria(){
		Ofbtb004Conta conta = new Ofbtb004Conta();
		conta.setNuAgencia((short)(1000 + random.nextInt(4000)));
		boolean tipoConta = random.nextBoolean();
		if (tipoConta) {
			conta.setNuOperacaoProduto((short)(listaOperacoes[random.nextInt(listaOperacoes.length)]));
			conta.setIcNsgd((byte)0);
		}else{
			conta.setNuOperacaoProduto((short)(listaProdutos[random.nextInt(listaProdutos.length)]));
			conta.setIcNsgd((byte)1);
		}
		conta.setNuConta(random.nextInt(1000000000));
		conta.setVrSaldoConta(BigDecimal.ZERO);
		return conta;
	}
}
