package br.com.treinar.meire;

import javax.swing.JOptionPane;

public class Atividade1 {
	public static void main(String[] args) {

		Integer mes = Integer.valueOf(JOptionPane.showInputDialog(null,
				"Informe o mês"));

		Integer limite = Mes.values().length;

		if (mes > 0 && mes <= limite) {
			Mes enumMes = Mes.recuperarPorOrdinal(mes - 1);
			JOptionPane.showMessageDialog(null, enumMes
					+ " Quantidade de dias: " + enumMes.getQtdDias());
		} else {
			JOptionPane.showMessageDialog(null, "Indice inválido");
		}
	}

}
