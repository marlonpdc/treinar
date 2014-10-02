package br.com.bancodobrasil.teste.excecao;

import javax.swing.JOptionPane;

import br.com.bancodobrasil.teste.encapsulamento.Pessoa;

public class ExecutaTesteExcecaoChecada {

	public static void main(String[] args) {
		try {
			irmaoPedindoParaComprarPao();
		} catch (NaoTemPaoException e) {
			JOptionPane.showMessageDialog(null, "nao deu pra comprar o pao");;
		} catch (PerdeuODinheiroException e) {
			JOptionPane.showMessageDialog(null, "dar mais dinheiro para o filho");;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "CHAMAR CORPO DE BOMBEIROS");;			
		} finally {
			System.out.println("sou executado sempre");
		}
		
		try {
			Integer i = 0 / 0;
		} finally {
			System.out.println("sempre executado");
		}
		
	}
	
	private static void irmaoPedindoParaComprarPao() throws NaoTemPaoException, PerdeuODinheiroException {
		Pessoa p = new Pessoa();
		while(true) {
			p.comprarPao();
			System.out.println("chegou aqui");
		}
	}
	
}
