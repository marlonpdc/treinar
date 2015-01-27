package br.com.treinar.jdbc.modelo;

import java.sql.SQLException;
import java.util.Calendar;

import br.com.treinar.jdbc.dao.ContatoDAO;
import br.com.treinar.jdbc.dao.IBaseDAO;

public class TestaJDBC {

	public static void main(String[] args) throws SQLException {
		
		Contato c = new Contato();
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH, 3);
		calendar.set(Calendar.MONTH, 11);
		calendar.set(Calendar.YEAR, 1980);
		
		c.setDataNascimento(calendar);
		c.setEmail("blablabla@teste.com");
		c.setEndereco("rua da paz 202");
		c.setNome("Amanda Cravo Moura");
		
		IBaseDAO dao = new ContatoDAO();
		dao.inserir(c);

	}

}
