package br.com.treinar.estudo.heranca;

public class TestePolimorfismo {

	public static void main(String[] args) {
		
		Funcionario f = new Gerente();
		System.out.println(f.calcularBonificacao());
		imprimirDiasFerias(f);		
		f = new Diretor();
		System.out.println(f.calcularBonificacao());
		imprimirDiasFerias(f);		
		Diretor d = new Diretor();
		imprimirDiasFerias(d);
		
	}
	
	public static void imprimirDiasFerias(Funcionario funcionario) {
		System.out.println(funcionario.calcularDiasFerias());
	}
	
}
