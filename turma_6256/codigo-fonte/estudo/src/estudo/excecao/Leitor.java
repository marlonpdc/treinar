package estudo.excecao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Leitor {

	private Scanner sc;
	
	public Leitor() {
		sc = new Scanner(System.in);
	}
	
	public Integer lerInteiro() throws Exception {
		try {
			Integer i = sc.nextInt();
			return i;			
		} catch (InputMismatchException e) {
			Exception exception = new Exception(e);
			throw exception;
		}
	}
	
}
