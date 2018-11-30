package br.gov.caixa.overfb.mdb;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.Message;
import javax.jms.MessageListener;

import org.apache.log4j.Logger;

@MessageDriven(activationConfig = {
		@ActivationConfigProperty(propertyName = "destination", propertyValue = "tutorialQueue"),
		@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue") })
public class ConsultaClienteMdb implements MessageListener {
	private static final Logger logger = Logger.getLogger(ConsultaClienteMdb.class);
	@Override
	public void onMessage(Message mensagem) {
		logger.info(mensagem.toString());

	}

}
