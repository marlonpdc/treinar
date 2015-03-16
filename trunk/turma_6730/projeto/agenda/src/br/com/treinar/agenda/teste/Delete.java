package br.com.treinar.agenda.teste;

import java.util.List;
import java.util.Scanner;

import br.com.treinar.agenda.dao.ContatoDAO;
import br.com.treinar.agenda.modelo.Contato;
import br.com.treinar.agenda.util.AgendaException;

public class Delete {

	public static void main(String[] args) {
		Contato c = new Contato();
		Scanner sc = new Scanner(System.in);
		try {
			ContatoDAO dao = new ContatoDAO();
			List<Contato> contatos = dao.recuperarTodos();
			for (Contato contato : contatos) {
				System.out.println(contato);
			}
			System.out.print("Informe o id do contato a ser excluido: ");
			c.setId(sc.nextLong());		
			Integer qtd = dao.remover(c);
			System.out.println(qtd + " Linhas removidas...");
		} catch (AgendaException e) {
			System.out.println("Não rolou!");
		} finally {
			sc.close();
		}
		System.out.println("Fim...");;
	}
	
}
