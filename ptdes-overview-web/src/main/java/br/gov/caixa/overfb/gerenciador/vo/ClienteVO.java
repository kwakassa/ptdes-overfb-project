package br.gov.caixa.overfb.gerenciador.vo;

import java.util.Date;

import br.gov.caixa.ptdes.entity.Ofbtb003Cliente;

public class ClienteVO {
	
	private String nome;
	private long cpf;
	private Date dataNascimento;
	
	public ClienteVO(String nome, long cpf, Date dataNascimento) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}
	
	public Ofbtb003Cliente getOfbtb003Cliente(){		
		return new Ofbtb003Cliente(cpf, nome, dataNascimento);
	}
	
}
