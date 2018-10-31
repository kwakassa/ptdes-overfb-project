package br.gov.caixa.overfb.ws.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;

import br.gov.caixa.ptdes.utils.CalculaCPFHelper;

@WebService(serviceName="cpfSoap")
public class OverfbServicoCpfSoap {
	
	@WebMethod(operationName="calculaDigitoCpfSOAP")
	@WebResult(name="digitoCpf")
	public String calculaDigitoCPF(@WebParam(name="cpfSemDigito") @XmlElement(required=true,nillable=false) String cpfSemDigito){
		CalculaCPFHelper calculaCPFHelper = new CalculaCPFHelper();
		return calculaCPFHelper.calculaDigitoCpf(cpfSemDigito);
	}
	
	@WebMethod(operationName="geraCpfAleatorioSOAP")
	@WebResult(name="cpfGerado")
	public String geraCpfAleatorio(){
		return new CalculaCPFHelper().geraCPF();
	}
	
}
