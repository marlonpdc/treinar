package br.com.meneguite.estudo;

public class AtividadeNota {

	public static void main(String[] args) {

		double nota = 50;
		String condicao;

		if (nota < 40) {
			condicao = "Aluno reprovado";
			System.out.println(condicao);
		} else if (nota >= 40 && nota <= 59) {
			condicao = "Aluno em recuperacao";
			System.out.println(condicao);
		} else {
			condicao = "Aluno APROVADO";
			System.out.println(condicao);
		}
	}

}
