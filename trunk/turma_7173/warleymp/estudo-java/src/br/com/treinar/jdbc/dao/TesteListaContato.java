package br.com.treinar.jdbc.dao;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import br.com.treinar.jdbc.modelo.Contato;

public class TesteListaContato {

	public static void main(String[] args) {
		DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		ContatoDAO dao = new ContatoDAO();
		
		List<Contato> contatos = dao.getLista();
		
		for (Contato contato : contatos) {
			System.out.println(contato.getNome() + " " + 
							   contato.getEmail() + " " +
							   contato.getEndereco() + " " +
							   sdf.format(contato.getDataNascimento()));
		}
	}
	
}
