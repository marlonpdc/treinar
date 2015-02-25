package br.com.treinar.estudo.aulaum;

public class ComandoRepeticao {

	
	public static void main(String[] args) {
		
		int contador = 1;
		
		while (contador <= 5) {
			switch (contador) {
			case 1:
				System.out.println("Um");
				break;
			case 2:
				System.out.println("Dois");
				break;
			case 3:
				System.out.println("Tres");
				break;
			case 4:
				System.out.println("Quatro");
				break;
			case 5:
				System.out.println("Cinco");
				break;

			default:
				break;
			}
			contador++;
			
		}
		
		//contador = 1;
		
		do {
			System.out.println("Executou do while!");
			switch (contador) {
			case 1:
				System.out.println("do while Um");
				break;
			case 2:
				System.out.println("do while Dois");
				break;
			case 3:
				System.out.println("do while Tres");
				break;
			case 4:
				System.out.println("do while Quatro");
				break;
			case 5:
				System.out.println("do while Cinco");
				break;

			default:
				break;
			}
			contador++;
		} while (contador < 5);
		
		
		
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		

		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
