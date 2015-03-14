package br.com.treinar.agenda.teste;

import br.com.treinar.agenda.dao.ContatoDAO;
import br.com.treinar.agenda.modelo.Contato;
import br.com.treinar.agenda.util.AgendaException;

public class Delete {

	public static void main(String[] args) {
		Contato c = new Contato();
		c.setId(1l);
		try {
			ContatoDAO dao = new ContatoDAO();
			Integer qtd = dao.remover(c);
			System.out.println(qtd + " Linhas removidas...");
		} catch (AgendaException e) {
			System.out.println("Não rolou!");;
		}
		System.out.println("Fim...");;
	}
	
}
