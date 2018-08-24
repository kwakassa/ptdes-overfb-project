package br.gov.caixa.ptdes.testes;

import org.apache.log4j.Logger;
import org.junit.Ignore;

import br.gov.caixa.ptdes.utils.CalculaCPFHelper;

/* CPF de exemplo: 186.665.161-78 */
@Ignore
public class TestaCalculaDigitoCPF {
	private static final Logger logger = Logger.getLogger(TestaCalculaDigitoCPF.class);
	
	public static void main(String[] args) {
		CalculaCPFHelper calculaCPFHelper = new CalculaCPFHelper();
		String cpfSemDigito = "186665161";
		String digitoCPF = calculaCPFHelper.calculaDigitoCpf(cpfSemDigito);
		logger.info(cpfSemDigito+"-"+digitoCPF);
	}

}
