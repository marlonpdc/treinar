package br.com.treinar.bb.visao.swing;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import br.com.treinar.bb.controle.ContaControle;
import br.com.treinar.bb.modelo.Cliente;
import br.com.treinar.bb.modelo.ContaCorrente;
import br.com.treinar.bb.modelo.SituacaoConta;
import br.com.treinar.bb.modelo.banco.BBException;

public class CadastraContaCorrentePanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private ContaControle controle;
	
	
	public CadastraContaCorrentePanel() {
		controle = new ContaControle();
		prepareGUI();
	}
	
	private void prepareGUI() {
		this.setLayout(new GridLayout(8, 1));
		JPanel linha1 = new JPanel(new FlowLayout());
		JPanel linha2 = new JPanel(new FlowLayout());
		JPanel linha3 = new JPanel(new FlowLayout());
		JPanel linha4 = new JPanel(new FlowLayout());
		JPanel linha5 = new JPanel(new FlowLayout());
		JPanel linha6 = new JPanel(new FlowLayout());
		JPanel linha7 = new JPanel(new FlowLayout());
		JPanel linha8 = new JPanel(new FlowLayout());
		
		JLabel labelIdConta = new JLabel("Codigo Conta:");
		linha1.add(labelIdConta);
		
		JTextField textFieldIDConta = new JTextField(6);
		textFieldIDConta.setEditable(Boolean.FALSE);
		linha1.add(textFieldIDConta);
		
		final JLabel labelNomeCliente = new JLabel("Nome Cliente:");
		linha2.add(labelNomeCliente);
		
		final JTextField textFieldNomeCliente = new JTextField(15);
		linha2.add(textFieldNomeCliente);

		JLabel labelCPFCliente = new JLabel("CPF Cliente:");
		linha3.add(labelCPFCliente);
		
		final JTextField textFieldCPFCliente = new JTextField(8);
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
		
		JLabel labelTaxaManutencao = new JLabel("Taxa Manutencao:");
		linha6.add(labelTaxaManutencao);
		
		final JTextField textFieldTaxaManutencao = new JTextField(8);
		linha6.add(textFieldTaxaManutencao);
		
		JLabel labelLimiteCredito = new JLabel("Taxa Manutencao:");
		linha7.add(labelLimiteCredito);
		
		final JTextField textFieldLimiteCredito = new JTextField(8);
		linha7.add(textFieldLimiteCredito);
		
		JButton buttonSalvarConta = new JButton("Cadastrar Conta");
		buttonSalvarConta.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				ContaCorrente conta = new ContaCorrente();
				String nomeCliente = textFieldNomeCliente.getText();
				Cliente cliente = new Cliente(nomeCliente, Long.parseLong(textFieldCPFCliente.getText()));
				conta.setCliente(cliente);
				conta.setTaxaManutencao(Double.parseDouble(textFieldTaxaManutencao.getText()));
				conta.setLimiteCredito(Double.parseDouble(textFieldLimiteCredito.getText()));
				try {
					controle.gravarConta(conta);
					JOptionPane.showMessageDialog(null, "Conta Cadastrado");
				} catch (BBException e) {
					JOptionPane.showMessageDialog(null, "Erro");
				}
				

			}
		});
		linha8.add(buttonSalvarConta);
		
		this.add(linha1);
		this.add(linha2);
		this.add(linha3);
		this.add(linha4);
		this.add(linha5);
		this.add(linha6);
		this.add(linha7);
		this.add(linha8);
		
		
	}
	
}
