package wellerson;

import javax.swing.JOptionPane;

import estudo.dominiodiscreto.DiaSemana;

public class Ordinal {



	public static void main(String[] args) {

			
		Integer ordinal = Integer.valueOf(JOptionPane.showInputDialog("Ordinal do dia"));
		DiaSemana[] dias = DiaSemana.values();
		JOptionPane.showMessageDialog(null, dias[ordinal]);
			

	}

}

