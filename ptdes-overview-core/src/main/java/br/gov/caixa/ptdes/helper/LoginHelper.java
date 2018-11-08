package br.gov.caixa.ptdes.helper;

import javax.ejb.Stateless;
import javax.inject.Inject;

import org.apache.log4j.Logger;

import br.gov.caixa.ptdes.dao.Ofbtb002UsuarioDao;
import br.gov.caixa.ptdes.entity.Ofbtb002Usuario;
import br.gov.caixa.ptdes.vo.UsuarioVO;

@Stateless
public class LoginHelper {
	private static final Logger logger = Logger.getLogger(LoginHelper.class);
	@Inject
	private Ofbtb002UsuarioDao dao;
	public UsuarioVO autenticaUsuario(String usuario, String senha){
		logger.info("inicio metodo autenticaUsuario()");
		boolean autenticado = false;
		UsuarioVO usuarioVO = null;
		logger.info("instanciando Ofbtb002UsuarioDao()");
		logger.info("obtendo usuario do banco");
		Ofbtb002Usuario usuarioDB = dao.obtemUsuarioDoBanco(usuario);
		logger.info("verificando se objeto usuario ew nulo: " + usuarioDB);
		if(usuarioDB != null && usuarioDB.getDeSenha().equals(senha)){
			usuarioVO = new UsuarioVO();
			usuarioVO.atualizaUsuarioVOApartirDoUsuarioDoBanco(usuarioDB);
			logger.info("Usuario Autenticado");
		}else{
			logger.info("Falha na Autenticacao");
			logger.debug("Retornando objeto usuario nulo por falha de autenticacao");
		}		
		return usuarioVO;
	}
	
}
