package br.com.treinar.jdbc;

import java.util.Calendar;

public class TestaAdicionarContatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar cl = Calendar.getInstance();
		cl.set(Calendar.YEAR, 1985);
		cl.set(Calendar.MONTH, 2);
		cl.set(Calendar.DAY_OF_MONTH, 19);		
		
		Contato cts = new Contato();
		
		cts.setNome("Albert");
		cts.setEmail("albertrsilva@gmail.com");
		cts.setDataNascimento(cl.getTime());
		cts.setEndereco("Rua onze");
		
		ContatoDAO contatosDao = new ContatoDAO();
		
		contatosDao.adicionar(cts);
		
		
	}

}
