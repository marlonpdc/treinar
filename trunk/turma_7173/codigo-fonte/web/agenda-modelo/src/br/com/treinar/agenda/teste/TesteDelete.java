package br.com.treinar.agenda.teste;

import br.com.treinar.agenda.Contato;
import br.com.treinar.agenda.dao.ContatoDAO;

public class TesteDelete {

	public static void main(String[] args) {

		ContatoDAO d = new ContatoDAO();
		Contato c = d.recuperar(2l);
		d.remover(c);

	}
	
}
