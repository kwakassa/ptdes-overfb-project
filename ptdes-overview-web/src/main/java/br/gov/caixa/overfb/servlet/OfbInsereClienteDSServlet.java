package br.gov.caixa.overfb.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
@WebServlet(name="OfbInsereClienteServlet" , urlPatterns = "/insereCliente")
public class OfbInsereClienteDSServlet extends HttpServlet{
	private static final Logger logger = Logger.getLogger(OfbInsereClienteDSServlet.class);
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}

}
