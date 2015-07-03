import java.util.Scanner;

public class ComandoRepeticaoWhile {

	public static void main(String[] args) {

		int opcao = 1;

		Scanner tecla = new Scanner(System.in);

		System.out
				.print("Digite o número de vezes que deseja repetir ou 0 para sair: ");
		opcao = tecla.nextInt();

		while (opcao != 0) {

			while (opcao != 0) {
				System.out.println("Edmar");
				opcao--;
			}

			System.out.println("------\n");
			System.out
					.print("Digite o número de vezes que deseja repetir ou 0 para sair: ");
			opcao = tecla.nextInt();
		}

		System.out.println("Fim");

		tecla.close();
	}
}
