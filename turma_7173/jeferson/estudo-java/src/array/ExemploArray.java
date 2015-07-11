package array;

public class ExemploArray {
	public static void main(String[] args) {
		Integer[]  numeros =  criarArrays(150);
		
		Imprimir(numeros);
	}
	
	private static void Imprimir(Integer[] numeros){
		for (int i = 0; i < numeros.length; i++) {
		System.out.print(numeros[i]+" ");
			
			
		}
		
	}
	
	private static Integer[] criarArrays(Integer qtdPos){
		Integer[] numeros = new  Integer[qtdPos];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i +1;
			
		}
		return numeros;
	}
	
	
}
