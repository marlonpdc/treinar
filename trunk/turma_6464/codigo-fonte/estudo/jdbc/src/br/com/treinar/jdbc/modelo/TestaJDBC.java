package br.com.treinar.jdbc.modelo;

import java.sql.SQLException;
import java.util.Calendar;

import javax.swing.JOptionPane;

import br.com.treinar.jdbc.dao.ContatoDAO;
import br.com.treinar.jdbc.dao.IBaseDAO;
import br.com.treinar.jdbc.modelo.Contato;

public class TestaJDBC {

	public static void main(String[] args) throws SQLException {
		
		Contato c = new Contato();
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH, Integer.parseInt(JOptionPane.showInputDialog("Dia")));
		calendar.set(Calendar.MONTH, Integer.parseInt(JOptionPane.showInputDialog("Mês")));
		calendar.set(Calendar.YEAR, Integer.parseInt(JOptionPane.showInputDialog("Ano")));
		
		c.setDataNascimento(calendar);
		c.setNome(JOptionPane.showInputDialog("Nome"));
		c.setEmail(JOptionPane.showInputDialog("Email"));
		c.setEndereco(JOptionPane.showInputDialog("Endereço"));
		
		IBaseDAO<Contato> dao = new ContatoDAO();
		dao.inserir(c);
		
		JOptionPane.showMessageDialog(null, "Contato gravado com sucesso");

	}

}
