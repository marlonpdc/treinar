package br.com.treinar.atividade;

public class Monitor {
	int tamanho;
	String marca;
	String cor;
	
	void ligar(){
		System.out.println("Monitor ligado");
	}
	
	void desligar(){
		System.out.println("Monitor desligado");
	}
	
	void detalhes(){
		System.out.println("Tamanho: " + tamanho + "\nMarca: "+marca+ "\nCor: "+cor);
	}
}
