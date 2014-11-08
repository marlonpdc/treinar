package br.com.treinar.jdbc;

public class TestaRemoverContato {

	public static void main(String[] args) {
		Contato c = new Contato();
		c.setId(5L);
		ContatoDAO contatoDAO = new ContatoDAO();
		contatoDAO.remover(c);
		System.out.println("Contato removido com sucesso");
	}
}
