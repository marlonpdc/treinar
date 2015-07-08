package Encapsulamento;

public class Principal {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa();

		p1.setNome("Edmar");
		p1.setSobrenome("Murta");
		p1.setApelido("Ed");
		p1.setIdade(30);

		System.out.println("Nome: " + p1.getNome() + "\nSobrenome: "
				+ p1.getSobrenome() + "\nApelido: " + p1.getApelido()
				+ "\nIdade: " + p1.getIdade());

	}
}
