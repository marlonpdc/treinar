package br.com.treinar.agenda.teste;

import java.util.Calendar;

import br.com.treinar.agenda.dao.ContatoDAO;
import br.com.treinar.agenda.modelo.Contato;
import br.com.treinar.agenda.util.AgendaException;

public class Edit {

	public static void main(String[] args) {
		Contato c = new Contato();
		c.setId(4L);
		c.setNome("Nathalia Cravo Moura");
		c.setEmail("nath@gmail.com");
		c.setEndereco("rua da paz, 202");
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH, 15);
		calendar.set(Calendar.MONTH, 10);
		calendar.set(Calendar.YEAR, 2001);
		
		c.setDataNascimento(calendar.getTime());
		
		try {
			ContatoDAO dao = new ContatoDAO();
			Integer qtd = dao.editar(c);
			System.out.println(qtd + " Contatos editados...");
		} catch (AgendaException e) {
			System.out.println("rolou nao brother");;
		}
		System.out.println("fim!");
	}
}
