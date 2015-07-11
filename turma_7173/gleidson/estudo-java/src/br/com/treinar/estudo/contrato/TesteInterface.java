package br.com.treinar.estudo.contrato;

public class TesteInterface {

	public static void main(String[] args) {
		Cliente c = new Cliente();
		enviarEmail(c);
		Computador cp = new Computador();
		enviarEmail(cp);
		Venda v = new Venda();
		System.out.println(v);
	}

	private static void enviarEmail(IEmail entity) {
		System.out.println();
	}
	
}
