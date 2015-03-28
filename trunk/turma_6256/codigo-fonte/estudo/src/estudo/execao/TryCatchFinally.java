package estudo.execao;

import java.util.Scanner;

public class TryCatchFinally {

	public static void main(String[] args) {
		testeFinally();
		testeFinallyOnly();
		System.out.println("fim...");
	}

	private static void testeFinally() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Inteiro: ");
			Integer inteiro = sc.nextInt();
			System.out.println(inteiro);
		} catch(Exception e) {
			System.err.println(e.getCause());
		} finally {
			sc.close();
		}
	}
	
	private static void testeFinallyOnly() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Inteiro: ");
			Integer inteiro = sc.nextInt();
			System.out.println(inteiro);
		} finally {
			sc.close();
		}
	} 
	
}
