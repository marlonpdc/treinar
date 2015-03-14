package br.com.treinar.agenda.teste;

import br.com.treinar.agenda.dao.ContatoDAO;
import br.com.treinar.agenda.modelo.Contato;
import br.com.treinar.agenda.util.AgendaException;

public class Select {

	public static void main(String[] args) {
		try {
			ContatoDAO dao = new ContatoDAO();
			Contato contato = dao.recuperar(9l);
			System.out.println(contato);	
		} catch (AgendaException e) {
			System.out.println("Não rolou! " + e.getMessage());
		}
	}
	
}
