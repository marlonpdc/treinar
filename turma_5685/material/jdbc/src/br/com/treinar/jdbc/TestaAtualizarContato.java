package br.com.treinar.jdbc;

public class TestaAtualizarContato {

	public static void main(String[] args) {
		
		Contato c = new Contato();
		
		c.setId(1L);
		c.setNome("Raquel");
		c.setDataNascimento(DateUtil.getInstance().criarData(3, 5, 1988));
		c.setEndereco("Rua A, 395");
		c.setEmail("raquel.mocinha@gmail.com");
		
		ContatoDAO dao = new ContatoDAO();
		dao.atualizar(c);
		
	}

}
