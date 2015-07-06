import java.util.Scanner;

import javax.swing.JOptionPane;


public class DoWhile {
public static void main(String[] args) {
	
	Scanner leitor = new Scanner(System.in);
	
	int condicao;
	
	do{
		System.out.println("Insert Random shit here");
		condicao = leitor.nextInt();
		JOptionPane.showMessageDialog(null,condicao);
		
	}
	while (condicao != 0);
	
}
}
