package br.gov.caixa.overfb.ws.soap;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;

import br.gov.caixa.overfb.helper.ClienteVoHelper;
import br.gov.caixa.ptdes.dao.Ofbtb003ClienteDao;
import br.gov.caixa.ptdes.vo.ClienteVO;

@WebService(serviceName="cadastraClienteSoap")
public class OverfbServicoCadastraClienteSoap {
	
	@Inject
	private Ofbtb003ClienteDao dao;
	@Inject 
	private ClienteVoHelper clienteHelper;
	
	@WebMethod(operationName="cadastrar")
	@WebResult(name="codigoRetorno")
	public String calculaDigitoCPF(
			@WebParam(name="cpfComDigito") @XmlElement(required=true,nillable=false) String cpfComDigito,
			@WebParam(name="NomeCompletoCliente") @XmlElement(required=true,nillable=false) String nomeCompletoCliente,
			@WebParam(name="dataNascimento") @XmlElement(required=true,nillable=false) String dataNascimento){
		try{
			ClienteVO clienteVO = clienteHelper.validaCliente(cpfComDigito, nomeCompletoCliente, dataNascimento);
			dao.insere(clienteVO.getOfbtb003Cliente());
			return "00 - Sucesso";
		}catch(Exception e){
			return "99 - Erro";
		}
	}	
}
