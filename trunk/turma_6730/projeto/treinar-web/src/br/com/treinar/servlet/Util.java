package br.com.treinar.servlet;

import java.util.ArrayList;
import java.util.List;

public class Util {

	public static List<Pessoa> pessoas;
	
	static {
		pessoas = new ArrayList<Pessoa>();
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Priscila");
		pessoa1.setMatricula(10481);
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setNome("Meire");
		pessoa2.setMatricula(10482);
		Pessoa pessoa3 = new Pessoa();
		pessoa3.setNome("Davidson");
		pessoa3.setMatricula(10483);
		Pessoa pessoa4 = new Pessoa();
		pessoa4.setNome("Humberto");
		pessoa4.setMatricula(10484);
	
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		pessoas.add(pessoa4);
	
	
	}
	
}
