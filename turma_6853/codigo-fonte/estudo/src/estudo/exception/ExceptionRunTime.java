package estudo.exception;

import java.util.Scanner;

import estudo.objeto.Pessoa;

public class ExceptionRunTime {
	
	public static void main(String[] args) {
		System.out.println(testeErro());
		
	}

	private static String testeErro() {
		Pessoa p = new Pessoa();
		Scanner sc = new Scanner(System.in);
		p.setNome("Gleidson");

		try {
			System.out.print("Informe um numero Inteiro: ");
			Integer i = Integer.parseInt(sc.nextLine());
			System.out.println(i);
			p.setAltura(i);
			if (p.getAltura() > 10) {
				System.out.println("Alto");
			} else {
				System.out.println("baixo");
			}
			return "Legal";
		} catch (NullPointerException e) {
			System.out.println("Altura inválida!");
			throw e;
		} catch (Exception e) {
			System.out.println("Erro fatal...");
			throw e;
		} finally {
			sc.close();
			System.out.println("Finally");
		}
	}
	
}
