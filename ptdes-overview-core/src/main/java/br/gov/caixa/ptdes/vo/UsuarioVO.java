package br.gov.caixa.ptdes.vo;

import br.gov.caixa.ptdes.entity.Ofbtb001GrupoAcesso;
import br.gov.caixa.ptdes.entity.Ofbtb002Usuario;

public class UsuarioVO {
	private String usuario;
	private String grupoAcesso;
	private String senha;
	/* Construtores */
	public UsuarioVO() {}
	
	public UsuarioVO(String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;
	}	

	public UsuarioVO(String usuario, String senha, String grupoAcesso) {
		this.usuario = usuario;
		this.senha = senha;
		this.grupoAcesso = grupoAcesso;
	}
	/* Gets e Sets*/
	public String getUsuario() {return usuario;}
	public void setUsuario(String usuario) {this.usuario = usuario;}
	public String getSenha() {return senha;}
	public void setSenha(String senha) {this.senha = senha;}
	public String getGrupoAcesso() {return grupoAcesso;}
	public void setGrupoAcesso(String grupoAcesso) {this.grupoAcesso = grupoAcesso;}
	
	public void atualizaUsuarioVOApartirDoUsuarioDoBanco(Ofbtb002Usuario usuarioBanco){
		setUsuario(usuarioBanco.getNoUsuario());
		setSenha(usuarioBanco.getDeSenha());
		setGrupoAcesso(usuarioBanco.getOfbtb001GrupoAcesso().getNoGrupoAcesso());
	}
	
}
