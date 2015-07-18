package br.com.treinar.jdbc.dao;

import java.util.Calendar;

import br.com.treinar.jdbc.modelo.Contato;

public class TesteContatoDAO {

	public static void main(String[] args) {
		Contato contato = new Contato();
		ContatoDAO dao = new ContatoDAO();
		Calendar c = Calendar.getInstance();
		c.set(Calendar.DAY_OF_MONTH, 15);
		c.set(Calendar.MONTH, 10);
		c.set(Calendar.YEAR, 2012);
		
		contato.setDataNascimento(c.getTime());
		contato.setNome("Maria Sophia");
		contato.setEmail("msoph@gmail.com");
		contato.setEndereco("Rua da paz, 202 ap 102 calafate");
	
		dao.adicionar(contato);
		
	}
	
}
