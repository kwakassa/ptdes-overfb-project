package br.gov.caixa.ptdes.utils;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

public class CalculaDigitoCPFTest {
	private static final Logger logger = Logger.getLogger(CalculaDigitoCPFTest.class);
	private CalculaCPFHelper calculaCPF =  new CalculaCPFHelper();
	
	@Test
	public void geraEValidaCPF() {
		logger.info("--- Teste de Sucesso para gerar CPF Valido ---");
		String cpf = calculaCPF.geraCPF();
		logger.info("CPF Gerado: " + cpf);
		boolean cpfValido = calculaCPF.isCpfValido(cpf);
		logger.info("CPF " + cpf + " valido? " + cpfValido);
		Assert.assertTrue(cpfValido);
	}
	
	@Test
	public void validacaoDeCpfErrado() {
		logger.info("--- Teste de Erro para validar digito de CPF ---");
		String cpf = "19518172599";//Digito correto seria 79, ou seja, 19518172579
		logger.info("Teste de ERRO - Cpf valido? " + calculaCPF.isCpfValido(cpf));
		Assert.assertFalse(calculaCPF.isCpfValido(cpf));
		logger.info("Obs: Esse teste ocorre ew sucesso quando ocorre falha");
	}
	
	@Test
	public void testaRetiraFormatacao(){
		logger.info("--- Teste de Sucesso para retirar a formatacao de um CPF ---");
		CalculaCPFHelper calculaCPFHelper = new CalculaCPFHelper();
		String cpfComFormatacao = "186.665.161-78";
		logger.info("Cpf com Formatacao: " + cpfComFormatacao);
		String cpfSemFormatacao = calculaCPFHelper.retiraFormatacaoCpf(cpfComFormatacao);
		logger.info("Cpf Sem Formatacao: " + cpfSemFormatacao);
		logger.info("Formatacao esperada: 18666516178");
		boolean igual = cpfSemFormatacao.equals("18666516178");
		logger.info("Teste de Sucesso: " + igual);
		Assert.assertTrue(igual);
	}

}
