import java.util.Scanner;

public class AtividadeEnum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o numero da semana de 0 a 6: ");
		Integer opcao = sc.nextInt();
		
		DiaSemana dia = DiaSemana.values()[opcao];
		
		System.out.println(dia.getDescricao());
		
		sc.close();
	}	
}