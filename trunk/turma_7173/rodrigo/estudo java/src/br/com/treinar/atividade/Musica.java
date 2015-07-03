package br.com.treinar.atividade;

public class Musica {

	String tipo;
	String nome;
	int tempo;

	void tocar() {
		tempo++;
	}

	void pararExecucao() {
		tempo = 0;
	}

}
