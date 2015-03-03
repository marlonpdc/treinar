package br.com.treinar.estudo.aulaum;

public class ComnadoCondicional {

	public static void main(String[] args) {
		int a = 10;
		boolean b = true;

		if (!b) {
			System.out.println("Gleidson");
			System.out.println("Guimaraes");
			System.out.println("Moura");
		}

		if (a == 10 && !b) {
			System.out.println("entrou no if");
			System.out.println("executou duas linhas");
		} else {
			System.out.println("nao entrou no if");
		}

		int nota = 63;
		if (nota < 40) {
			System.out.println("reprovado");
		}
		if (nota >= 40 && nota < 60) {
			System.out.println("recuperacao");
		}
		if (nota >= 60) {
			System.out.println("aprovado");
		}

		if (nota < 40) {
			System.out.println("reprobado");
		} else if (nota >= 40 && nota < 60) {
			System.out.println("recuperacao");
		} else {
			System.out.println("aprovado");
		}
		
		int opcao = 1;
		
		switch (opcao) {
		case 1:
			System.out.println("Opção UM");
			break;
		case 2:
			System.out.println("Opção DOIS");
			break;
		default:
			System.out.println("Opção inválida");
			break;
		}
		
		opcao = 12;
		
		String cumprimento = opcao < 12 ? "Bom dia" : "Boa tarde";
		System.out.println(cumprimento);
		
		
		
		
		
	}

}
