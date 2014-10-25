package br.com.treinar.bb.controle;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.List;

import br.com.treinar.bb.banco.Conta;

public class PersistirDados {
	public void persistirContas (List<Conta> contas ) throws IOException {
		
		
		OutputStream os = new FileOutputStream("saidas.txt");
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);

		for (Conta conta : contas) {
			bw.write("Conta:" + (conta.toString()) + "\n");
		} 

		bw.close();
		
		
		
		
	}
}
