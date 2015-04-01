package estudo.dominiodiscreto;

import javax.swing.JOptionPane;

public class TesteOrdinalEnum {

	public static void main(String[] args) {
		String descricaoEnum = JOptionPane.showInputDialog("Descricao Dia");
		DiaSemana dia = DiaSemana.valueOf(descricaoEnum.toUpperCase());
		JOptionPane.showMessageDialog(null, dia.ordinal());
		
	}
	
}
