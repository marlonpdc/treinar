package br.com.treinar.atividade;

public class TesteMonitor {
	
	public static void main(String[] args) {
		Monitor mo = new Monitor();
		Monitor m = new Monitor(1800,"lg","black");
		
		mo.cor = "preto";
		mo.tamanho = 199;
		mo.marca = "LG";	
		
		m.ligar();
		m.desligar();
		m.detalhes();
	}

}
