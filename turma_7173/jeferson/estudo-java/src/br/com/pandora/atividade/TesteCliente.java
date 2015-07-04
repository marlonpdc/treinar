package br.com.pandora.atividade;

public class TesteCliente {

	public static void main(String[] args) {

		Cliente c = new Cliente();
		
		c.nome = "Jeferson";
		c.sobrenome = "Araujo";
		c.cpf = 0001000;
		c.rg = 0002;
		c.idade = 31;
		
		c.Endereco = new Endereco();
		c.telefone = "31313131";
		c.Endereco.rua = "Rua Das Ostras";
		c.Endereco.numero = 369;
		
		
		System.out.println("");
		System.out.println("_____________");
		System.out.println("Endereço do Cliente : " + c.Endereco.rua);
		System.out.println("O numero do endereço do Cliente : "	+ c.Endereco.numero);
		
		System.out.println("");
		System.out.println("_____________");

		System.out.println("Nome : " + c.nome);
		System.out.println("Sobrenome : " + c.sobrenome);
		System.out.println("CFP   : " + c.cpf);
		System.out.println("RG    : " + c.rg);
		System.out.println("Idade : " + c.idade);
		
		System.out.println("");
		System.out.println("_____________");

		Cliente cliente = c;
		System.out.println("Nome do Novo cliente : " + cliente.nome);
		System.out.println("SobreNome do Novo cliente : " + cliente.sobrenome);

	}

}
