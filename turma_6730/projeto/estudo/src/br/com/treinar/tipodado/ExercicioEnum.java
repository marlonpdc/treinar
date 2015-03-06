package br.com.treinar.tipodado;

import javax.swing.JOptionPane;

public class ExercicioEnum {

	public static void main(String[] args) {
		Integer mes = Integer.valueOf(JOptionPane.showInputDialog(null, 
									  "Informe o mês"));
		Mes[] meses = Mes.values();
		Integer limite = meses.length;
		
		if (mes > 0 && mes <= limite) {
			JOptionPane.showMessageDialog(null, meses[mes - 1]);
		} else {
			JOptionPane.showMessageDialog(null, "Indice inválido");
		}
	}
	
}
