package br.com.treinar.jdbc.dao;

import br.com.treinar.jdbc.modelo.Contato;

public class TesteRemoveContato {

	public static void main(String[] args) {
		Contato contato = new Contato();
		contato.setId(1L);
		ContatoDAO dao = new ContatoDAO();
		dao.remover(contato);
		System.out.println("Contato Removido");
	}
	
}
