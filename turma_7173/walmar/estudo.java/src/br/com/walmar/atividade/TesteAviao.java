package br.com.walmar.atividade;

public class TesteAviao {
	public static void main(String[]args) {
		Aviao a = new Aviao();
		a.cor="Preto";
		a.modelo="787";
		System.out.println(a.ligar);
		a.ligar=1;
		System.out.println(a.ligar);
		a.acelerar();
		System.out.println(a.acelerar);
	}
}
