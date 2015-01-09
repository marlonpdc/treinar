package br.com.treinar.escola.modelo;

public class Aluno {

	public String nome;
	public Integer matricula;
	public String endereco;
	
	public Prova fazerProva() {
		System.out.println("... colando ...");
		Prova prova = new Prova();
		prova.questao = "Qual é a maior torcida de Minas Gerais?";
		prova.resposta = "Cruzeiro Esporte Clube";
		return prova;
	}
	
	
	
}
