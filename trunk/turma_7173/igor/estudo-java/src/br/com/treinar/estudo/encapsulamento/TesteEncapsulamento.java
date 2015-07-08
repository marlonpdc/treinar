package br.com.treinar.estudo.encapsulamento;

public class TesteEncapsulamento {

	public static void main(String[] args) {

		Funcionario p = new Funcionario();

		p.setNome("Igor");
		p.setSobrenome("Yuri");
		p.setIdade(28);
		p.setApelido("Jhow");

		System.out.println("Meu nome é: " + p.getNome() + " "
				+ p.getSobrenome() + "\nTenho " + p.getIdade() + " anos");
	}
}
