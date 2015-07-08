package br.com.pandora.atividade.encapsulamento;

public class TesteAluno {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa();

		pessoa.setNome("Jeferson");
		pessoa.setSobrenome("Araujo");
		pessoa.setIdade(31);
		pessoa.setMatricula(11220899);

		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getSobrenome());
		System.out.println(pessoa.getIdade());
		System.out.println(pessoa.getMatricula());

	}

}
