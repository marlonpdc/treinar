package br.com.treinar.swing;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class TelaBB {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Exemplo");
		
		JPanel painel1 = new JPanel();
		JPanel painel2 = new JPanel();
		painel1.setLayout(new GridLayout(1,1));
		painel2.setLayout(new GridLayout(11,1));
		frame.setSize(800,400);
		
		JButton botao1 = new JButton("Cadastrar Conta");
		JButton botao2 = new JButton("Exibir Conta");
		JButton botao3 = new JButton("Depositar");
		JButton botao4 = new JButton("Saque");
		JButton botao5 = new JButton("Cadastrar Taxa Rendimento");
		JButton botao6 = new JButton("Captalizar");
		JButton botao7 = new JButton("Pagar");
		JButton botao8 = new JButton("Listar Contas");
		JButton botao9 = new JButton("Gerenciar Status Conta");
		JButton botao10 = new JButton("Editar Conta");
		JButton botao11 = new JButton("Sair");
		
		JTextArea field = new JTextArea();
		
		painel2.add(botao1);
		painel2.add(botao2);
		painel2.add(botao3);
		painel2.add(botao4);
		painel2.add(botao5);
		painel2.add(botao6);
		painel2.add(botao7);
		painel2.add(botao8);
		painel2.add(botao9);
		painel2.add(botao10);
		painel2.add(botao11);
		
		painel1.add(painel2);
		painel1.add(field);
		
		frame.add(painel1);
		
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}
