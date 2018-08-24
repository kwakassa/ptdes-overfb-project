package br.gov.caixa.ptdes.utils;

import org.apache.log4j.Logger;

public class CalculaCPFHelper {
	private static final Logger logger = Logger.getLogger(CalculaCPFHelper.class);
	private static final int[] pesoCPF = { 11, 10, 9, 8, 7, 6, 5, 4, 3, 2 };

	private int getDigito(String numSemDigito) {
		int soma = 0;
		for (int indice = numSemDigito.length() - 1, digito; indice >= 0; indice--) {
			digito = Integer.parseInt(numSemDigito.substring(indice, indice + 1));
			soma += digito * pesoCPF[pesoCPF.length - numSemDigito.length() + indice];
		}
		soma = 11 - soma % 11;
		return soma > 9 ? 0 : soma;
	}
	
	public String calculaDigitoCpf(String numSemDigito){
		if ((numSemDigito==null) || (numSemDigito.length()!=9)){
			throw new NumberFormatException("A string do numero deve conter 9 digitos.");
		}else{
			Integer digito1 = getDigito(numSemDigito);
			Integer digito2 = getDigito(numSemDigito+digito1);
			return ""+digito1+digito2;
		}
	}
	
	public String geraCPF() {  
        String iniciais = "";  
        Integer numero;  
        for (int i = 0; i < 9; i++) {  
            numero = new Integer((int) (Math.random() * 10));  
            iniciais += numero.toString();  
        }  
        return iniciais + calculaDigitoCpf(iniciais);  
    }
	
	public boolean isCpfValido(String cpfCompleto){
		try{
			Long.parseLong(cpfCompleto);
			String digito = cpfCompleto.substring(cpfCompleto.length()-2, cpfCompleto.length());
			String nuCpf = cpfCompleto.substring(0, cpfCompleto.length()-2);
			String novoDigito = calculaDigitoCpf(nuCpf);
			return novoDigito.equals(digito);			
		}catch (NumberFormatException e) {
			logger.error("Cpf deve conter somente numeros",e);
			return false;
		}
	}
}
