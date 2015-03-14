package br.com.treinar.agenda.teste;

import java.util.Calendar;

import br.com.treinar.agenda.dao.ContatoDAO;
import br.com.treinar.agenda.modelo.Contato;
import br.com.treinar.agenda.util.AgendaException;

public class Insert {

	public static void main(String[] args) {
		Contato c = new Contato();
		c.setNome("Maria Sophia Moura");
		c.setEmail("mariasophia@gmail.com");
		c.setEndereco("rua da paz, 202");
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH, 15);
		calendar.set(Calendar.MONTH, 10);
		calendar.set(Calendar.YEAR, 2012);
		
		c.setDataNascimento(calendar.getTime());
		
		try {
			ContatoDAO dao = new ContatoDAO();
			dao.inserir(c);
		} catch (AgendaException e) {
			System.out.println("rolou nao brother");;
		}
		System.out.println("fim!");
	}
	
}
