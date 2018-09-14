package br.gov.caixa.ptdes.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GeraGanhadores {
	Random aleatorio = new Random();
	String[] nomes = {"Joao","Mario","Jose","Roberta","Solange","Olivia"};
	String[] sobrenomes = {"Bittencourt","Silva","Soares","Carvalho","Oliveira","Pereira"};
	
	public String geraGanhador(){
		String nome = nomes[aleatorio.nextInt(6)];
		String sobrenome = sobrenomes[aleatorio.nextInt(6)];		
		return nome + " " + sobrenome;
	}
	
	public List<String> geraListaGanhadores(long qtd){
		List<String> listaNomes = new ArrayList<>();
		for (int i = 0; i < qtd; i++) {
			listaNomes.add(geraGanhador());
		}
		return listaNomes;
	}
}
