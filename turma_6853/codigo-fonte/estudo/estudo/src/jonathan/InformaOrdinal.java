package jonathan;

import java.util.Scanner;
import javax.swing.JOptionPane;
import estudo.dominiodiscreto.DiaSemana;


public class InformaOrdinal {
	
	public static void main(String[] args) {
		
		Integer aux;
		Scanner  var= new Scanner(System.in);

		System.out.print( "informe Ordinal: ");
		
		aux=var.nextInt();
		DiaSemana[] dias = DiaSemana.values();
		
		
		JOptionPane.showMessageDialog(null, dias[aux].getDescricao());
		var.close();
		
 } 
}
