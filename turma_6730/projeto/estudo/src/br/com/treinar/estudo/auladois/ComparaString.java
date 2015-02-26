package br.com.treinar.estudo.auladois;

import br.com.treinar.priscila.Nome;

public class ComparaString {

	public static void main(String[] args) {
		String nomeUm = "Gleidson";
		String nomeDois = "Gleidson";
		
		Nome nomePUm = new Nome();
		nomePUm.nome = "Gleidosn";
		
		Nome nomePDois = new Nome();
		nomePDois.nome = "Gleidosn";
		
		System.out.println(nomeUm == nomeDois);
		System.out.println(nomePUm == nomePDois);
		
		
		String nomeNovo = new String("Gleidson");
		
		System.out.println(nomeUm);
		System.out.println(nomeNovo);
		System.out.println(nomeUm == nomeNovo);
		
		nomeNovo = nomeUm;
		
		System.out.println(nomeNovo == nomeUm);
		
		
		
	}
	
}
