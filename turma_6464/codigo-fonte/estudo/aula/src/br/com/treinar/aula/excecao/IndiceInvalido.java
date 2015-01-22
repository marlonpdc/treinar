package br.com.treinar.aula.excecao;

import java.util.Scanner;

public class IndiceInvalido {

	public static void main(String[] args)  {
		try {
			metodoUm();			
		} catch (NumberFormatException | 
				ArrayIndexOutOfBoundsException | 
				NullPointerException e) {
			e.getMessage();
			tratar();
		} catch (Exception e) {
			tratar();
		} finally {
			System.out.println("sempre executado");
		}
		
		System.out.println("Fim do programa");
	}

	private static void tratar() {
		System.out.println("tratei");
	}
	
	private static Integer metodoUm() {
		Scanner scanner = new Scanner(System.in);
		try {
			Integer ret = Integer.parseInt(scanner.nextLine());
			System.out.println("teste");
			return ret;
		} finally {
			scanner.close();
		}
		
	}
	
	
	
	public static void gravar() throws Exception  {
		try {
			
			System.out.println("tenta Gravar");
		} catch (Exception e) {
			
		}
	}
	
	
	
}
