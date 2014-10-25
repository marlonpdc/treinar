package br.com.treinar.bb.controle;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.List;

import br.com.treinar.bb.banco.Conta;
import br.com.treinar.bb.dado.BaseDados;

public class PersistirDados {
	public void persistirContas () throws IOException  {
		List<Conta> contas = BaseDados.getInstance().recuperarContas();
		OutputStream os = new FileOutputStream("saida.txt");
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);

		for (Conta c : contas) {
			bw.write(c.toString() + "\n");
		}
		bw.flush();
		bw.close();
		
	}
}
