package br.gov.caixa.ptdes.testes;

import org.apache.log4j.Logger;
import org.junit.Ignore;

import br.gov.caixa.ptdes.utils.CalculaCPFHelper;

/* CPF de exemplo: 186.665.161-78 */
@Ignore
public class TestaRetiraFormatacao {
	private static final Logger logger = Logger.getLogger(TestaRetiraFormatacao.class);
	
	public static void main(String[] args) {
		CalculaCPFHelper calculaCPFHelper = new CalculaCPFHelper();
		String cpfComFormatacao = "186.665.161-78";
		logger.info("Cpf com Formatacao: " + cpfComFormatacao);
		String cpfSemFormatacao = calculaCPFHelper.retiraFormatacaoCpf(cpfComFormatacao);
		logger.info("Cpf Sem Formatacao: " + cpfSemFormatacao);
	}

}
