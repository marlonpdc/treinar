package br.com.treinar.agenda.teste;

import java.util.List;

import br.com.treinar.agenda.dao.ContatoDAO;
import br.com.treinar.agenda.modelo.Contato;
import br.com.treinar.agenda.util.AgendaException;

public class SelectList {

	public static void main(String[] args) {
		try {
			ContatoDAO dao = new ContatoDAO();
			List<Contato> contatos = dao.recuperarTodos();
			for (Contato contato : contatos) {
				System.out.println(contato);
			}
			
		} catch (AgendaException e) {
			System.out.println("Não rolou!");
		}
	}
	
}
