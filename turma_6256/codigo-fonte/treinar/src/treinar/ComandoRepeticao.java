package treinar;

public class ComandoRepeticao {
	
	public static void main(String[] args) {
		
		int cont = 0;
		
		/*
		 * ideal para utilizar quando nao conhecemos o tamanho do 
		 * problema
		 * ex: enquanto estiver chovendo, mantenha o guarda 
		 * chuvas aberto
		 */
		while (cont < 10) {
			System.out.println(cont + 1 + " Gleidosn");
			//cont = cont + 1;
			cont++;
			//cont += 1;
		}
		
		/*
		 * ideal para utilizar quano a primeira iteracao deve 
		 * sempre ser executada
		 * Ex: apresentar o menu de uma aplicação.
		 */
		System.out.println("no do while");
		do {
			System.out.println(cont + 1 + " Gleidosn");
			cont++;
		} while (cont < 10);
		
		System.out.println(cont);
		
		/*
		 * ideal para utilizar quando vc conhece o tamanho do problema
		 * ex: comer todos os bis de uma caixa... sabemos que são 20
		 * então para o primeiro até o ultimo bis coma
		 */
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}

	}
	
}
