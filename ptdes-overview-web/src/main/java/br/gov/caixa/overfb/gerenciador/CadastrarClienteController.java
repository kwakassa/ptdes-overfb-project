package br.gov.caixa.overfb.gerenciador;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import br.gov.caixa.ptdes.dao.Ofbtb003ClienteDao;
import br.gov.caixa.ptdes.utils.CalculaCPFHelper;
import br.gov.caixa.ptdes.vo.ClienteVO;

@Stateless
public class CadastrarClienteController{
	private static final Logger logger = Logger.getLogger(CadastrarClienteController.class);
	@Inject
	private CalculaCPFHelper cpfHelper;
	@Inject
	private Ofbtb003ClienteDao clienteDao;
	
	private final String PAGINA_SUCESSO = "/WEB-INF/paginas/cadastro-sucesso.jsp";
	private final String PAGINA_ERRO = "error.jsp";
	private final String PAGINA_DADOS_INVALIDOS = "/WEB-INF/paginas/dados-invalidos.jsp";
	
	public String executa(HttpServletRequest request, HttpServletResponse response){
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
					return PAGINA_SUCESSO;
				} catch (SQLException e) {
					logger.error("Erro ao tentar inserir o cliente no banco de dados",e);
					return PAGINA_ERRO;
				}
			}else{
				return PAGINA_DADOS_INVALIDOS;
			}
		}else{
			return PAGINA_DADOS_INVALIDOS;
		}
	}
	
	private static boolean validaCpf(String cpf) {
		CalculaCPFHelper cpfHelper = new CalculaCPFHelper();
		return cpfHelper.isCpfValido(cpf);
	}	
	
}
