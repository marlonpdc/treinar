package br.com.treinar.bb.dado.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class TesteEscreverArquivo {

	public static void main(String[] args) throws IOException {
		OutputStream os = new FileOutputStream("saida.txt");
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);

		for (int i = 0; i < 20; i++) {
			bw.write("treinar 201" + (i + 1) + "\n");
		}

		bw.close();
	}

}
