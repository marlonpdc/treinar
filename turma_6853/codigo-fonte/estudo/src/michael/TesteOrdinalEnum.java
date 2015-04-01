package michael;

import javax.swing.JOptionPane;

public class TesteOrdinalEnum {

	public static void main(String[] args) {
		DiaSemana dia = DiaSemana.valueOf(JOptionPane.showInputDialog("Descricao Dia"));
		JOptionPane.showMessageDialog(null, dia.ordinal());
		
		int diaNumber = Integer.valueOf(JOptionPane.showInputDialog("Numero do Dia"));
		DiaSemana[] dias = DiaSemana.values();
		JOptionPane.showMessageDialog(null, dias[diaNumber].toString());
		
			switch (diaNumber) {
			case 6:
				JOptionPane.showMessageDialog(null, DiaSemana.DOMINGO);
				break;
			case 0:
				JOptionPane.showMessageDialog(null, DiaSemana.SEGUNDA_FEIRA);
				
				break;
			case 1:
				JOptionPane.showMessageDialog(null, DiaSemana.TERCA_FEIRA);
				
				break;
			case 2:
				JOptionPane.showMessageDialog(null, DiaSemana.QUARTA_FEIRA);
				
				break;
			case 3:
				JOptionPane.showMessageDialog(null, DiaSemana.QUINTA_FEIRA);
				
				break;
			case 4:
				JOptionPane.showMessageDialog(null, DiaSemana.SEXTA_FEIRA);
				
				break;
			case 5:
				JOptionPane.showMessageDialog(null, DiaSemana.SABADO);
				
				break;
			default:
				break;
			}
		
	}
	
}
