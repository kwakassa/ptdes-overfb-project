package br.gov.caixa.ptdes.testes;

import org.apache.log4j.Logger;

import br.gov.caixa.ptdes.utils.CalculaCPFHelper;

public class TestaValidaCpf {
	private static final Logger logger = Logger.getLogger(TestaValidaCpf.class);
	public static void main(String[] args) {
		String cpfCompleto = "18666516178";
		CalculaCPFHelper calculaCPFHelper = new CalculaCPFHelper();
		logger.info("CPF " + cpfCompleto + " ew valido? " + calculaCPFHelper.isCpfValido(cpfCompleto));
	}
}
