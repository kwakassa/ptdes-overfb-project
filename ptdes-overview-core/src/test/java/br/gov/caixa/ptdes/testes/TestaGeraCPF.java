package br.gov.caixa.ptdes.testes;

import org.apache.log4j.Logger;
import org.junit.Ignore;

import br.gov.caixa.ptdes.utils.CalculaCPFHelper;

@Ignore
public class TestaGeraCPF {
	private static final Logger logger = Logger.getLogger(TestaGeraCPF.class);
	
	public static void main(String[] args) {
		CalculaCPFHelper calculaCPFHelper = new CalculaCPFHelper();
		String cpf = calculaCPFHelper.geraCPF();
		logger.info(cpf);
	}

}
