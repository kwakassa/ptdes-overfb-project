package br.gov.caixa.overfb.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

import br.gov.caixa.overfb.gerenciador.UsuarioSessionVO;

@WebFilter(urlPatterns = "/*")
public class Autenticador implements Filter{
	private static final Logger logger = Logger.getLogger(Autenticador.class);
	private static final String USUARIO_LOGADO = "usuarioLogado";
	@Override
	public void destroy() {/* This method is empty*/}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		String uri = req.getRequestURI();
		logger.debug("Autenticador - URL da request:" + uri);
		UsuarioSessionVO usuario = getUsuario(req);
		if(usuario==null){
			req.setAttribute(USUARIO_LOGADO, false);
			chain.doFilter(request, response);
		}else{
			req.setAttribute(USUARIO_LOGADO, true);
		}
	}
	private UsuarioSessionVO getUsuario(HttpServletRequest req) {
		return (UsuarioSessionVO) req.getSession().getAttribute(USUARIO_LOGADO);
	}
	@Override
	public void init(FilterConfig config) throws ServletException {/* This method is empty*/}
	
}
