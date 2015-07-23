package br.com.treinar.bb.visao.swing;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import br.com.treinar.bb.controle.ContaControle;

public class TelaPrincipalBB {
	private JFrame mainFrame;
	private JPanel controlPanelContaCorrente;
	private JPanel controlPanelTaxaRendimento;
	private ContaControle controle;
	
	public TelaPrincipalBB() {
		prepareGUI();
	}

	public static void main(String[] args) {
		TelaPrincipalBB swingMenuDemo = new TelaPrincipalBB();
		swingMenuDemo.showMenuDemo();
	}

	private void prepareGUI() {
		mainFrame = new JFrame("Banco do Brasil - Treinar");
		mainFrame.setSize(800, 600);
		mainFrame.setLayout(new GridLayout(1, 1));

		mainFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});
		controlPanelContaCorrente = new CadastraContaCorrentePanel();
		mainFrame.add(controlPanelContaCorrente);
		controlPanelContaCorrente.setVisible(Boolean.FALSE);
		controlPanelTaxaRendimento = new TaxaRendimentoPoupancaPanel();
		mainFrame.add(controlPanelTaxaRendimento);
		controlPanelTaxaRendimento.setVisible(Boolean.FALSE);

		mainFrame.setVisible(Boolean.TRUE);

	}

	private void showMenuDemo() {
		// create a menu bar
		final JMenuBar menuBar = new JMenuBar();

		// create menus
		JMenu fileMenu = new JMenu("Novo");
		JMenu editMenu = new JMenu("Cadastro");
		final JMenu aboutMenu = new JMenu("About");
		final JMenu linkMenu = new JMenu("Links");

		// create menu items
		JMenuItem itemMenuContaCorrente = new JMenuItem("Conta Corrente");
		itemMenuContaCorrente.setMnemonic(KeyEvent.VK_N);
		itemMenuContaCorrente.setActionCommand("CC");

		JMenuItem itemMenuContaPoupanca = new JMenuItem("Conta Poupança");
		itemMenuContaPoupanca.setActionCommand("CP");

		JMenuItem itemMenuContaSalario = new JMenuItem("Conta Salario");
		itemMenuContaSalario.setActionCommand("CS");

		JMenuItem itemMenuContaInvestimento = new JMenuItem("Conta Investimento");
		itemMenuContaInvestimento.setActionCommand("CI");

		JMenuItem exitMenuItem = new JMenuItem("Exit");
		exitMenuItem.setActionCommand("Exit");

		JMenuItem taxaRendimentoMenuItem = new JMenuItem("Taxa de rendimento");
		taxaRendimentoMenuItem.setActionCommand("TX_RENDIMENTO");

		JMenuItem copyMenuItem = new JMenuItem("Copy");
		copyMenuItem.setActionCommand("Copy");

		JMenuItem pasteMenuItem = new JMenuItem("Paste");
		pasteMenuItem.setActionCommand("Paste");

		MenuItemListener menuItemListener = new MenuItemListener();

		itemMenuContaCorrente.addActionListener(menuItemListener);
		itemMenuContaPoupanca.addActionListener(menuItemListener);
		itemMenuContaInvestimento.addActionListener(menuItemListener);
		itemMenuContaSalario.addActionListener(menuItemListener);
		exitMenuItem.addActionListener(menuItemListener);
		taxaRendimentoMenuItem.addActionListener(menuItemListener);
		copyMenuItem.addActionListener(menuItemListener);
		pasteMenuItem.addActionListener(menuItemListener);

		// add menu items to menus
		fileMenu.add(itemMenuContaCorrente);
		fileMenu.add(itemMenuContaPoupanca);
		fileMenu.add(itemMenuContaInvestimento);
		fileMenu.add(itemMenuContaSalario);
		fileMenu.addSeparator();
		fileMenu.add(exitMenuItem);
		editMenu.add(taxaRendimentoMenuItem);
		editMenu.add(copyMenuItem);
		editMenu.add(pasteMenuItem);

		// add menu to menubar
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(aboutMenu);
		menuBar.add(linkMenu);

		// add menubar to the frame
		mainFrame.setJMenuBar(menuBar);
		mainFrame.setVisible(true);
	}

	class MenuItemListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			exibirFuncionalidade(e.getActionCommand());
		}

		private void exibirFuncionalidade(String funcionalidade) {
			controlPanelContaCorrente.setVisible(funcionalidade.equals("CC"));
			controlPanelTaxaRendimento.setVisible(funcionalidade.equals("TX_RENDIMENTO"));
		}
	}
}