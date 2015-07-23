package br.com.treinar.bb.visao.swing;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import br.com.treinar.bb.modelo.SituacaoConta;

public class CadastraContaPoupancaPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	public CadastraContaPoupancaPanel() {
		prepareGUI();
	}
	
	private void prepareGUI() {
		this.setLayout(new GridLayout(5, 1));
		JPanel linha1 = new JPanel(new FlowLayout());
		JPanel linha2 = new JPanel(new FlowLayout());
		JPanel linha3 = new JPanel(new FlowLayout());
		JPanel linha4 = new JPanel(new FlowLayout());
		JPanel linha5 = new JPanel(new FlowLayout());
		
		JLabel labelIdConta = new JLabel("Codigo Conta:");
		linha1.add(labelIdConta);
		
		JTextField textFieldIDConta = new JTextField(6);
		textFieldIDConta.setEditable(Boolean.FALSE);
		linha1.add(textFieldIDConta);
		
		JLabel labelNomeCliente = new JLabel("Nome Cliente:");
		linha2.add(labelNomeCliente);
		
		JTextField textFieldNomeCliente = new JTextField(15);
		linha2.add(textFieldNomeCliente);

		JLabel labelCPFCliente = new JLabel("CPF Cliente:");
		linha3.add(labelCPFCliente);
		
		JTextField textFieldCPFCliente = new JTextField(8);
		linha3.add(textFieldCPFCliente);
		
		JLabel labelSaldoConta = new JLabel("Saldo:");
		linha4.add(labelSaldoConta);
		
		JTextField textFieldSaldo = new JTextField(8);
		linha4.add(textFieldSaldo);
		
		JLabel labelSituacaoConta = new JLabel("Situação:");
		DefaultComboBoxModel<String> panelName = new DefaultComboBoxModel<>();

		panelName.addElement("Selecione");			
		
		SituacaoConta[] situacoes = SituacaoConta.values();
		for (SituacaoConta situacaoConta : situacoes) {
			panelName.addElement(situacaoConta.getDescricao());			
		}
		
		JComboBox<String> comboSituacaoConta = new JComboBox<>(panelName);
		comboSituacaoConta.setSelectedIndex(0);
		JScrollPane listComboScrollPane = new JScrollPane(comboSituacaoConta);
		linha5.add(labelSituacaoConta);
		linha5.add(listComboScrollPane);
		
		
		this.add(linha1);
		this.add(linha2);
		this.add(linha3);
		this.add(linha4);
		this.add(linha5);
		
		
	}
	
}
