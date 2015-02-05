package br.com.treinar.util;

import java.util.ArrayList;
import java.util.List;

import br.com.treinar.modelo.Contato;
import br.com.treinar.modelo.Telefone;

public class TreinarUtil {

	private static TreinarUtil instance;
	private List<Contato> contatos;
	
	
	static {
		instance = new TreinarUtil();
	}
	
	private TreinarUtil() {
		super();
		contatos = new ArrayList<>();
		Contato c = null;
		for (int i = 0; i < 10; i++) {
			c = new Contato();
			c.setEmail("email" + i + "@gmail.com");
			c.setEndereco("endereco " + i);
			c.setNome("nome" + i);
			c.setTelefone(new Telefone());
			c.getTelefone().setCodCidade(10 + (i + 1));
			c.getTelefone().setCodPais(50 + 1);
			c.getTelefone().setNumero(10000000 + 1);
			contatos.add(c);
		}
	}
	
	public static TreinarUtil getInstance() {
		return instance;
	}

	public List<Contato> getContatos() {
		return contatos;
	}
	
}
