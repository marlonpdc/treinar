package br.com.treinar.bb.principal;

import javax.swing.JOptionPane;

import br.com.treinar.bb.controle.BancoControle;
import br.com.treinar.bb.visao.TelaBB;

public class Main {
	
	public static void main(String[] args) throws Exception {
		TelaBB bb = new TelaBB();
		BancoControle controle = new BancoControle();
		controle.carregarContas();
		bb.iniciar();
		JOptionPane.showMessageDialog(null,"vlw");
	}

}
