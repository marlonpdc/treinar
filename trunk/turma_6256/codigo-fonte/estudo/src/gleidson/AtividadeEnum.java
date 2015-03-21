package gleidson;

import java.util.Scanner;

import estudo.dominiodiscreto.Turno;

public class AtividadeEnum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Turno turno = null;
		System.out.print("Informe o indice do Turno: ");
		Integer indice = sc.nextInt();
		Turno[] turnos = Turno.values();
		if (indice >= 0 && indice < turnos.length) {
			turno = turnos[indice];
			System.out.println(turno.getDescricao());			
		} else {
			System.out.println("Indice inválido!");
		}
		sc.close();
	}
	
}
