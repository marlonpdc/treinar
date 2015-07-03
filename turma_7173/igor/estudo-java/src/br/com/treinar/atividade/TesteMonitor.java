package br.com.treinar.atividade;

public class TesteMonitor {
	
	public static void main(String[] args) {
		Monitor m = new Monitor();
		
		m.cor = "preto";
		m.tamanho = 18;
		m.marca = "LG";
		
		m.ligar();
		m.desligar();
		m.detalhes();
	}

}
