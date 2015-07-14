package array;

public class ExemploMatriz {

	public static void main(String[] args) {
		int n=0;
		
		Integer[][] matriz = new Integer[3][3];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = ++n;
			}
		}
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println();
		}
		
		
	}
	
}
