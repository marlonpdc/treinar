package atividade;

public class AtualizaIdade {
	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.nome = "João";
		p.calcIdade();
		System.out.println(p.idade);
	}
}
