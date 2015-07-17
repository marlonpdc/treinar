package br.com.treinar.atividade;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class AtividadeIO {

	public static void main(String[] args) throws IOException {
		OutputStream os = new FileOutputStream("saida.txt");
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);

		for (int i = 0; i < 10; i++) {
			bw.write("treinar " + i + 1);
			bw.newLine();
		}
		bw.close();
	}

}
