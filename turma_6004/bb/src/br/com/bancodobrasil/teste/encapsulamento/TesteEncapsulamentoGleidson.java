package br.com.bancodobrasil.teste.encapsulamento;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;

public class TesteEncapsulamentoGleidson {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Érica");
		Calendar c = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		
		c2.add(Calendar.DAY_OF_MONTH, 49);
		
		c.set(Calendar.YEAR, 2012);
		c.set(Calendar.MONTH, 10);
		c.set(Calendar.DAY_OF_MONTH, 15);
		c.set(Calendar.HOUR_OF_DAY, 11);
		c.set(Calendar.MINUTE, 15);
		c.set(Calendar.SECOND, 35);
		
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		JOptionPane.showMessageDialog(null, df.format(c2.getTime()));
//		
//		Date dataNascimento = c.getTime();
//		pessoa.setDataNascimento(dataNascimento);
//		JOptionPane.showMessageDialog(null, df.format(pessoa.getDataNascimento()));
	}
	
}
