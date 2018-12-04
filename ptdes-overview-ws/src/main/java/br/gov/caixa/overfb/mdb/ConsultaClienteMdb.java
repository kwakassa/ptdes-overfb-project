package br.gov.caixa.overfb.mdb;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.MessageProducer;
import javax.jms.QueueSession;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.apache.log4j.Logger;
import org.jboss.annotation.ejb.ResourceAdapter;

//@MessageDriven(name = "ConsultaClienteMDB", activationConfig = {
//		@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
//		@ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "OFB.REQ.CONSULTA"),
//		@ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge") })
//@ResourceAdapter("activemq-ra.rar")
public class ConsultaClienteMdb implements MessageListener {
	private static final Logger logger = Logger.getLogger(ConsultaClienteMdb.class);
	@Override
	public void onMessage(Message mensagem) {
		Connection connection = null;
		try {
			Context jndiContext = new InitialContext();
			ConnectionFactory connectionFactory = (ConnectionFactory)jndiContext.lookup("java:/activemq/ConnectionFactory");
			connection = connectionFactory.createConnection();
			Destination queue = (Destination) jndiContext.lookup("java:/activemq/siofb_rsp_consulta");
			TextMessage mensagemTxt = (TextMessage) mensagem;
			Session session = connection.createSession(false, QueueSession.AUTO_ACKNOWLEDGE);
			MessageProducer producer = session.createProducer(queue);
			logger.info(mensagemTxt.getText());
			producer.send(mensagemTxt);
		} catch (NamingException | JMSException e) {
			logger.error("Erro no onMessage(): ", e);
		} finally {
			try {
				connection.close();
			} catch (JMSException | NullPointerException e) {
				logger.error("Erro ao fechar conexao: ",e);
			}
		}
		
	}

}
