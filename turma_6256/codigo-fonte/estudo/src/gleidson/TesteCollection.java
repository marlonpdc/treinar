package gleidson;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteCollection {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Pessoa> pessoas = new ArrayList<>();
		
		System.out.print("Quantas pessoas deseja criar: ");
		Integer qtd = sc.nextInt();
		sc.nextLine();
		Pessoa p = null;
		for (int i = 0; i < qtd; i++) {
			p = new Pessoa();
			System.out.print("Informe o Nome: ");
			p.setNome(sc.nextLine());
			System.out.print("Informe o Peso: ");
			p.setPeso(sc.nextInt());
			pessoas.add(p);
			sc.nextLine();
		}
		sc.close();
		System.out.println(pessoas);
	}
	
}
