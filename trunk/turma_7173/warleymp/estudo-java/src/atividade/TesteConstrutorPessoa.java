package atividade;

public class TesteConstrutorPessoa {

	public static void main(String[] args) {

		Pessoa w = new Pessoa("warley", 18);
		System.out.println(w.nome);
		System.out.println(w.idade);
		
		Cargo c = new Cargo();
		c.faixa_salario = "A";
		c.bonus();
		w.calcSalario(c.percentual);
		System.out.println(c.percentual);
		System.out.println(w.salario);
	}

}
