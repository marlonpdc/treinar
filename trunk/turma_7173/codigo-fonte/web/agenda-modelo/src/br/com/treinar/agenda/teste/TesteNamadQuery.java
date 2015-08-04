package br.com.treinar.agenda.teste;

import java.util.List;

import br.com.treinar.agenda.Contato;
import br.com.treinar.agenda.dao.ContatoDAO;

public class TesteNamadQuery {

	public static void main(String[] args) {
		ContatoDAO d = new ContatoDAO();
		List<Contato> todos = d.recuperarTodos();
		for (Contato contato : todos) {
			System.out.println(contato);
		}
		
		Contato c = d.recuperarPorNome("Maria Sophia");
		System.out.println(c.getPessoa().getNome());
	}
	
}
