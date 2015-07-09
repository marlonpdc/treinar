package br.com.treinar.bb.util;

public class TesteSingleton {

	public static void main(String[] args) {
		Database banco = Database.getInstance();
		System.out.println(banco.getConta());
		Database banco2 = Database.getInstance();
		System.out.println(banco2.getConta());
		Database.getInstance().getConta();
		System.out.println(banco.getConta());
	}
	
}
