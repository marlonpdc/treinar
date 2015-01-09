package br.com.treinar.escola.modelo;

public class Aluno {

	public String nome;
	public Integer matricula;
	public String endereco;
	public Boolean matriculado;
	
	public Prova fazerProva() {
		System.out.println("... colando ...");
		Prova prova = new Prova();
		prova.questao = "Qual é a maior torcida de Minas Gerais?";
		prova.resposta = "Cruzeiro Esporte Clube";
		return prova;
	}
	
	public void fazerProva(Prova prova) {
		prova.resposta = "2";
	}
	
	public void fazerProva(Prova prova, Integer tempoEmMinutos) {
		//utiliza tempo
		prova.resposta = "Cruzeiro Esporte Clube";
	}
	
	public Pao comprarPao(Double dinheiro) {
		Pao pao = null;
		if (dinheiro > 1) {
			pao = new Pao();
			pao.pesoEmGramas = 50;
			pao.pesoEmGramas =  pao.pesoEmGramas *(dinheiro);
		}
		return pao;
	}	
	
}
