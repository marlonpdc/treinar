package estudo.array;

public class TesteArray {

	public static void main(String[] args) {
		Integer[] numeros = new Integer[4];
		numeros[0] = 6;
		numeros[1] = 1;
		numeros[2] = 1;
		numeros[3] = 1;
		
		Character[] letras = {'G', 'L', 'E'};
		System.out.println(letras);
		Integer posicaoUm = numeros[0];
		
		System.out.println("Imprimindo com acesso direto");
		System.out.println(posicaoUm);
		System.out.println(numeros[1]);
		System.out.println(numeros[2]);
		System.out.println(numeros[3]);
		System.out.println("Imprimindo com for");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
	}
	
}
