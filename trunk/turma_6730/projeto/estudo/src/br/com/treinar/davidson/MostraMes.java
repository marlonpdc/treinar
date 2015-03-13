package br.com.treinar.davidson;

import javax.swing.JOptionPane;

public class MostraMes {
	public static void main(String[] args) {
		
		

		//Mes digitaMes =  Mes;
		String numero = JOptionPane.showInputDialog("Digite o numero do mês");
		Integer mes = Integer.parseInt(numero);
		
		
		Mes[] meses = Mes.values();
		
		//System.out.println(meses[mes-1]);
		JOptionPane.showMessageDialog(null, "\n Nome: " + meses[mes-1] );
		
		
	}
}
