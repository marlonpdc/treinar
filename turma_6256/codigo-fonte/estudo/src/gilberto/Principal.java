package gilberto;

import java.util.Scanner;

import estudo.dominiodiscreto.Turno;

public class Principal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("Informe o N°: ");
		Integer n = s.nextInt();

		Turno[] turnos = Turno.values();
		if (turnos.length > n) {
			System.out.println("Turno: " + turnos[n]);
		} else {
			System.out.println("Não existe");
		}
		s.close();
	}

}
