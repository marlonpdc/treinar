package br.com.treinar.util;

import java.util.ArrayList;
import java.util.List;

import br.com.treinar.modelo.Contato;

public class TreinarUtil {

	private static TreinarUtil instance;
	private List<Contato> contatos;
	
	
	static {
		instance = new TreinarUtil();
	}
	
	private TreinarUtil() {
		super();
		contatos = new ArrayList<>();
	}
	
	public static TreinarUtil getInstance() {
		return instance;
	}

	public List<Contato> getContatos() {
		return contatos;
	}
	
}
