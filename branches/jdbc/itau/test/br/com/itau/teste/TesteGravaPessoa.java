package br.com.itau.teste;

import br.com.treinar.itau.dao.PessoaDAO;
import br.com.treinar.itau.exception.ItauException;
import br.com.treinar.itau.modelo.principal.Pessoa;
import br.com.treinar.itau.util.ConnectionFactory;

public class TesteGravaPessoa {

	
	public static void main(String[] args) throws Exception {
		Pessoa p = new Pessoa();
		p.setNome("Maria Sophia Moura");
		p.setCpf(55546265302L);
		
		PessoaDAO dao = new PessoaDAO(ConnectionFactory.getConnection());
		
		try {
			dao.gravar(p);
			System.out.println(p.getId());
		} catch (ItauException e) {
			e.printStackTrace();
		}
	}
	
}
