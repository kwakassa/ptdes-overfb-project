package br.gov.caixa.overfb.gerenciador;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;

import br.gov.caixa.overfb.gerenciador.vo.ClienteVO;
import br.gov.caixa.ptdes.dao.Ofbtb003ClienteDao;
import br.gov.caixa.ptdes.utils.CalculaCPFHelper;

@Stateless
public class CadastrarClienteController {
	private static final Logger logger = Logger.getLogger(CadastrarClienteController.class);
	@Inject
	private CalculaCPFHelper cpfHelper;
	@Inject
	private Ofbtb003ClienteDao clienteDao;
	
	public void executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomeCliente = request.getParameter("nomeCliente");
		String cpf = request.getParameter("cpf");
		String dataNascimento = request.getParameter("dataNascimento");
		if(nomeCliente!=null && !nomeCliente.isEmpty() && cpf!=null && !cpf.isEmpty() && dataNascimento!= null && !dataNascimento.isEmpty()){
			String cpfSemFormatacao = cpfHelper.retiraFormatacaoCpf(cpf);
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			LocalDate date = LocalDate.parse(dataNascimento, formatter);
			if(validaCpf(cpfSemFormatacao)){
				ClienteVO cliente = new ClienteVO(nomeCliente, Long.parseLong(cpfSemFormatacao), java.sql.Date.valueOf(date));
				try {
					clienteDao.insere(cliente.getOfbtb003Cliente());
				} catch (SQLException e) {
					logger.error("Erro ao tentar inserir o cliente no banco de dados",e);
					direcionaPaginaDeErro(request, response);
				}
			}else{
				direcionaParaDadosInvalidos(request, response);
			}
		}else{
			direcionaParaDadosInvalidos(request, response);
		}
	}
	
	private static boolean validaCpf(String cpf) {
		CalculaCPFHelper cpfHelper = new CalculaCPFHelper();
		return cpfHelper.isCpfValido(cpf);
	}

	private static void direcionaParaDadosInvalidos(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/paginas/dados-invalidos.jsp");
		dispatcher.forward(request, response);
	}
	
	private static void direcionaPaginaDeErro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		RequestDispatcher dispatcher = request.getRequestDispatcher("error.jsp");
		dispatcher.forward(request, response);
	}
	
}
