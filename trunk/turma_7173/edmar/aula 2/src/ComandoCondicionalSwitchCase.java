import java.util.Scanner;

import javax.swing.JOptionPane;

public class ComandoCondicionalSwitchCase {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite a opção desejada: ");
		int opcao = leitor.nextInt();
		
		System.out.println("Opção selecionada: " + opcao);
		
		System.out.print("Digite a opção desejada: ");
		opcao = leitor.nextInt();
		
		switch (opcao) {
		case 1:
			JOptionPane.showMessageDialog(null, "Domingo");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Segunda");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "Terça");
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "Quarta");
			break;
		case 5:
			JOptionPane.showMessageDialog(null, "Quinta");
			break;
		case 6:
			JOptionPane.showMessageDialog(null, "Sexta");
			break;
		case 7:
			JOptionPane.showMessageDialog(null, "Sábado");
			break;

		default:
			JOptionPane.showMessageDialog(null, "Opção inválida!");
			break;
		}

		leitor.close();
	}

}
