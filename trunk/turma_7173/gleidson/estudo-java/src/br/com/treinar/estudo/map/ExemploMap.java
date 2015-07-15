package br.com.treinar.estudo.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import br.com.treinar.estudo.Pessoa;

public class ExemploMap {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.nome = "1 Pessoa";
		p1.idade = 10;
		p1.pesoEmGramas = 90000;
		
		Pessoa p2 = new Pessoa();
		p2.nome = "2 Pessoa";
		p2.idade = 20;
		p2.pesoEmGramas = 30000;
		
		Pessoa p3 = new Pessoa();
		p3.nome = "3 Pessoa";
		p3.idade = 30;
		p3.pesoEmGramas = 70000;
		
		Pessoa p4 = new Pessoa();
		p4.nome = "4 Pessoa";
		p4.idade = 40;
		p4.pesoEmGramas = 20000;
		
		
		Map<String, Pessoa> pessoasMap = new HashMap<>();
		
		pessoasMap.put(p1.nome, p1);
		pessoasMap.put(p2.nome, p2);
		pessoasMap.put(p3.nome, p3);
		pessoasMap.put(p4.nome, p4);
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o nome da pessoa: ");
		String nome = sc.nextLine();
		
		Pessoa recuperado = pessoasMap.get(nome);
		
		System.out.println(recuperado.nome);
		System.out.println(recuperado.idade);
		System.out.println(recuperado.pesoEmGramas);
		
		
		Set<String> keys = pessoasMap.keySet();
		for (String key : keys) {
			System.out.println(pessoasMap.get(key));
		}
		
		Set<Entry<String, Pessoa>> entrySet = pessoasMap.entrySet();
		
		for (Entry<String, Pessoa> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		sc.close();
		
	}
	
	
}
