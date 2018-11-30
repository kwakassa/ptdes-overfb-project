package br.gov.caixa.overfb.gerenciador;

import javax.ejb.Stateless;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.gov.caixa.overfb.constante.Constantes;

@Stateless
public class CadastroClientePageController{
	public String executa(HttpServletRequest request, HttpServletResponse response){
		HttpSession session = request.getSession();
		String grupo = (String)session.getAttribute(Constantes.GRUPO_USUARIO_LOGADO);
		if(grupo.equals("OFBGES")){
			return "/WEB-INF/paginas/cadastroCliente.jsp";
		}else{
			return "/WEB-INF/paginas/grupo-invalido.jsp";
		}
	}
}
