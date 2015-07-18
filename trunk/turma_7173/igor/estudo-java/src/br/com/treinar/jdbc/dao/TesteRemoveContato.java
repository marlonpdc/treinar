package br.com.treinar.jdbc.dao;

import java.util.Scanner;

import br.com.treinar.jdbc.modelo.Contato;

public class TesteRemoveContato {

	public static void main(String[] args) {
		Contato contato = new Contato();
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o id do contato: ");
		contato.setId(sc.nextLong());
		ContatoDAO dao = new ContatoDAO();
		dao.remover(contato);
		System.out.println("Contato Removido");
		sc.close();
	}
	
}
