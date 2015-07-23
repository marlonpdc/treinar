package br.com.treinar.bb.visao.swing;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TaxaRendimentoPoupancaPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	public TaxaRendimentoPoupancaPanel() {
		prepareGUI();
	}
	
	private void prepareGUI() {
		this.setLayout(new GridLayout(1, 1));
		JPanel linha1 = new JPanel(new FlowLayout());
		
		JLabel labelTaxaRendimento = new JLabel("Taxa de rendimento:");
		linha1.add(labelTaxaRendimento);
		
		JTextField textTaxaRendimento = new JTextField(6);
		linha1.add(textTaxaRendimento);
		
		this.add(linha1);
		
	}
	
}
