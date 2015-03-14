package estudo.array;

public class ArrayBiDirecional {

	public static void main(String[] args) {
		Integer[][] matriz = new Integer[5][5];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = j + i;
			}
		}
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println("\n");
		}
		
		
	}
	
}
