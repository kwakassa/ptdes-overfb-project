package br.gov.caixa.overfb.gerenciador;

public class UsuarioSessionVO {

	private String email;
	private String senha;

	public UsuarioSessionVO(String email, String senha) {
		this.email = email;
		this.senha = senha;
	}

	public String getSenha() {
		return senha;
	}

	public String getEmail() {
		return email;
	}

}
