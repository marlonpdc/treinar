package estudo.collectionmap;

import gabriel.colecao.Pessoa;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class TesteMap {

	public static void main(String[] args) {
		Map<Double, Pessoa> map = new HashMap<>();
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setPeso(1d);
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setPeso(2d);
		Pessoa pessoa3 = new Pessoa();
		pessoa3.setPeso(3d);
		Pessoa pessoa4 = new Pessoa();
		pessoa4.setPeso(4d);
		
		map.put(pessoa1.getPeso(), pessoa1);
		map.put(pessoa2.getPeso(), pessoa2);
		map.put(pessoa3.getPeso(), pessoa3);
		map.put(pessoa4.getPeso(), pessoa4);
		
		
		String peso = JOptionPane.showInputDialog("Peso de");
		
		Pessoa p = map.get(Double.valueOf(peso));
		
		if (map.containsKey(peso)) {
			JOptionPane.showMessageDialog(null, p);			
		} else {
			JOptionPane.showMessageDialog(null, "Pessoa Inválida");
		}
		
		String nome = "Gleidson";
		//String primeiraLetra = nome.substring(0, 1);
		
		
		
		
	}
	
}
