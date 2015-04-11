package br.com.itau.teste;

import br.com.treinar.itau.dao.PessoaDAO;
import br.com.treinar.itau.exception.BBException;
import br.com.treinar.itau.modelo.principal.Pessoa;

public class TesteGravaPessoa {

	
	public static void main(String[] args) throws Exception {
		Pessoa p = new Pessoa();
		p.setNome("Maria Sophia Moura");
		p.setCpf(55546265302L);
		
		PessoaDAO dao = new PessoaDAO();
		
		try {
			dao.gravar(p);
			System.out.println(p.getId());
		} catch (BBException e) {
			e.printStackTrace();
		}
	}
	
}
