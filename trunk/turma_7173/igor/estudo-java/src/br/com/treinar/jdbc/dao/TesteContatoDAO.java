package br.com.treinar.jdbc.dao;

import java.util.Calendar;
import java.util.Scanner;

import br.com.treinar.jdbc.modelo.Contato;

public class TesteContatoDAO {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Contato contato = new Contato();
		ContatoDAO dao = new ContatoDAO();
		Calendar c = Calendar.getInstance();
		c.set(Calendar.DAY_OF_MONTH, 15);
		c.set(Calendar.MONTH, 10);
		c.set(Calendar.YEAR, 2012);
		
		contato.setDataNascimento(c.getTime());
		System.out.print("Informe o nome: ");
		contato.setNome(sc.nextLine());
		System.out.print("Informe o email: ");
		contato.setEmail(sc.nextLine());
		System.out.print("Informe o endereço: ");
		contato.setEndereco(sc.nextLine());
	
		dao.adicionar(contato);
		sc.close();
	}
	
}
