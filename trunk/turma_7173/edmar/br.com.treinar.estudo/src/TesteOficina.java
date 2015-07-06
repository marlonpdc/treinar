public class TesteOficina {

	public static void main(String[] args) {

		Mecanico m = new Mecanico();

		m.especialidade = "Eletricista";
		m.nome = "Clayton";
		m.salario = 6348.50;

		Mecanico c = m;

		System.out.println(m.nome);
		System.out.println(c.nome);

		Manutencao nova = new Manutencao();

		nova.numero = 1;
		nova.preco = 2520.30;

		System.out.println(nova.numero);
		System.out.println(nova.preco);

	}
}
