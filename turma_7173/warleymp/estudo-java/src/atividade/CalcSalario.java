package atividade;

public class CalcSalario {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.nome = "João";
		p.calcSalario(10);
		System.out.println(p.salario);
	}

}
