package gabriel.excecao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Jogo jogo = new Jogo();
		jogo.setDinheiro(50);
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Informe o valor do dinheiro: ");
			Integer valor = sc.nextInt();
			jogo.setDinheiro(valor);
			jogo.comprarPersonagem();
			System.out.println("Personagem: " + jogo.getPersonagem() + " Habilitado com sucesso");
		} catch (DinheiroInsuficienteException e) {
			System.out.println("Dinheiro insuficiente");
		}
		
		sc.close();
	}
}
