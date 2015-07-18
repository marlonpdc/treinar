package br.com.treinar.jdbc.dao;

import java.util.Date;
import java.util.List;

import br.com.treinar.jdbc.modelo.Contato;

public class TesteUpdate {

	public static void main(String[] args) {
		ContatoDAO dao = new ContatoDAO();
		
		List<Contato> contatos = dao.getLista();
		
		Contato contato = contatos.get(0);
		contato.setNome("Nathalia Cravo Moura");
		contato.setDataNascimento(new Date());
		dao.alterar(contato);
		System.out.println("Contato alterado...");
	}
	
}
