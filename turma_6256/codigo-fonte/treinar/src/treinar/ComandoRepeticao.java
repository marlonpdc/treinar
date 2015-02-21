package treinar;

public class ComandoRepeticao {
	
	public static void main(String[] args) {
		
		int cont = 0;
		
		while (cont < 10) {
			System.out.println(cont + 1 + " Gleidosn");
			//cont = cont + 1;
			cont++;
			//cont += 1;
		}
		
		//cont = 0;
		System.out.println("no do while");
		do {
			System.out.println(cont + 1 + " Gleidosn");
			cont++;
		} while (cont < 10);
		
		System.out.println(cont);
		
		int i = 0;
		for (; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println(i);
	}
	
}
