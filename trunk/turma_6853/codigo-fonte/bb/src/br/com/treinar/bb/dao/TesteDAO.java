package br.com.treinar.bb.dao;

import br.com.treinar.bb.modelo.Cliente;

public class TesteDAO {

	public static void main(String[] args) {
		ClienteDAO dao = new ClienteDAO();
		
		
		Cliente c = dao.recuperar(10L);
		
		System.out.println(c);
		
	}
	
	
}
