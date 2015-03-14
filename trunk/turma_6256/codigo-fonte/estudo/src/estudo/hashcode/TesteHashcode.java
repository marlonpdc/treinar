package estudo.hashcode;

import java.util.Scanner;

import estudo.construtor.Pessoa;

public class TesteHashcode {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.nome = "Gabriel";
		p.peso = 1000;
		Pessoa p2 = new Pessoa();
		p2.nome = "Gabriel";
		p2.peso = 100;
		
		System.out.println(p.equals(p2));
		System.out.println(p.hashCode());
		System.out.println(p2.hashCode());
	}
	
}
