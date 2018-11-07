package br.gov.caixa.ptdes.helper;

import javax.ejb.Stateless;
import javax.inject.Inject;

import org.apache.log4j.Logger;

import br.gov.caixa.ptdes.dao.Ofbtb002UsuarioDao;
import br.gov.caixa.ptdes.entity.Ofbtb002Usuario;

@Stateless
public class LoginHelper {
	private static final Logger logger = Logger.getLogger(LoginHelper.class);
	@Inject
	private Ofbtb002UsuarioDao dao;
	public boolean autenticaUsuario(String usuario, String senha){
		logger.info("inicio metodo autenticaUsuario()");
		boolean autenticado = false;
		logger.info("instanciando Ofbtb002UsuarioDao()");
		logger.info("obtendo usuario do banco");
		Ofbtb002Usuario usuarioDB = dao.obtemUsuarioDoBanco(usuario);
		logger.info("verificando se objeto usuario ew nulo: " + usuarioDB);
		if(usuarioDB != null){
			autenticado = usuarioDB.getDeSenha().equals(senha);
		}
		logger.info("retornando se autenticado: " + autenticado);
		return autenticado;
	}
	
}
