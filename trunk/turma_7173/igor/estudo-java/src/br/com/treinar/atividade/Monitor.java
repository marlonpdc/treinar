package br.com.treinar.atividade;

public class Monitor {
	int tamanho;
	String marca;
	String cor;
	
	public Monitor() {
		System.out.println("Executando...");
	}
	
	public Monitor(int tamanho, String marca, String cor) {
		this.tamanho = tamanho;
		this.marca = marca;
		this.cor = cor;
	}
	
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
