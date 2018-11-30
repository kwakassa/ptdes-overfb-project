package br.gov.caixa.overfb.helper;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.gov.caixa.ptdes.utils.CalculaCPFHelper;
import br.gov.caixa.ptdes.vo.ClienteVO;

@Stateless
public class ClienteVoHelper {
	
	@Inject
	private CalculaCPFHelper cpfHelper;
	
	public ClienteVO validaCliente(String cpf, String nomeCliente, String dataNascimento){
		String cpfSemFormatacao = cpfHelper.retiraFormatacaoCpf(cpf);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate date = LocalDate.parse(dataNascimento, formatter);
		if(validaCpf(cpfSemFormatacao)){
			return new ClienteVO(nomeCliente, Long.parseLong(cpfSemFormatacao), java.sql.Date.valueOf(date));
		}else{
			throw new RuntimeException("Dados do Cliente Invalidos");
		}
	}
	
	private static boolean validaCpf(String cpf) {
		CalculaCPFHelper cpfHelper = new CalculaCPFHelper();
		return cpfHelper.isCpfValido(cpf);
	}
}
