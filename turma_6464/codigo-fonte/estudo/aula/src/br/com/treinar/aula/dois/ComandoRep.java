package br.com.treinar.aula.dois;

public class ComandoRep {

	public static void main(String[] args) {

		int cont = 0;
		
		while (cont < 10) {
			System.out.println(++cont);
		}
		System.out.println("------------for------------");
//		for (; ;) {
//			System.out.println("");
//		}
		System.out.println("------------do-while------------");
		do {
			System.out.println("teste");
		} while (cont > 5);

	}
}
