package br.com.itau.teste;

import br.com.treinar.itau.dao.ContaCorrenteDAO;
import br.com.treinar.itau.exception.ItauException;
import br.com.treinar.itau.modelo.ContaCorrente;
import br.com.treinar.itau.modelo.principal.Pessoa;
import br.com.treinar.itau.util.ConnectionFactory;

public class TesteGravaContaCorrente {

	
	public static void main(String[] args) throws Exception {
		Pessoa p = new Pessoa();
		p.setNome("Nathalia Cravo Moura");
		p.setCpf(55546265302L);
		
		ContaCorrente c = new ContaCorrente(10481);
		c.setLimiteCredito(1000D);
		c.setPessoa(p);
		c.setTarifa(10D);
		c.depositar(1000D);
		
		ContaCorrenteDAO dao = new ContaCorrenteDAO(ConnectionFactory.getConnection());
		
		try {
			dao.gravar(c);
			System.out.println(c.getId());
		} catch (ItauException e) {
			e.printStackTrace();
		}
	}
	
}
