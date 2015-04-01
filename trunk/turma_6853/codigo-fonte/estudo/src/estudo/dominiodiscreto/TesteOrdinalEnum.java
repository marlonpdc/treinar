package estudo.dominiodiscreto;

import javax.swing.JOptionPane;

public class TesteOrdinalEnum {

	public static void main(String[] args) {
		DiaSemana dia = DiaSemana.valueOf(JOptionPane.showInputDialog("Descricao Dia"));
		JOptionPane.showMessageDialog(null, dia.ordinal());
		
	}
	
}
