package br.com.treinar.itau;

import java.io.IOException;

import javax.swing.JOptionPane;

import br.com.treinar.itau.modelo.util.ItauConstante;

public class Banco {

	public static void main(String[] args) {
		Itau i;
		try {
			i = new Itau();
			i.iniciar();
			System.out.println(ItauConstante.ItauConstanteVisao.MENSAGEM_FIM_PROGRAMA);
		} catch (IOException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "dados nao recuperados");
		}
	}
	
}
