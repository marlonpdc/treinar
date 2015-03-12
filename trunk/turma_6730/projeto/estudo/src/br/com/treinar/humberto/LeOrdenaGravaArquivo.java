package br.com.treinar.humberto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeOrdenaGravaArquivo {
	
	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("arquivo.txt");
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		List<String> lista = new ArrayList<String>();
		
		String nome = br.readLine();
		
		while (nome != null) {
			lista.add(nome);
			nome = br.readLine();
		}
		
		br.close();
		
		Collections.sort(lista);
		
		OutputStream os = new FileOutputStream("C:/Humberto/workspace/estudo/src/br/com/treinar/humberto/saida.txt");
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);

		for (String nomeTemp : lista) {
			bw.write(nomeTemp);
			bw.newLine();
			
		}
		
		bw.close();
		
		System.out.println("Arquivo gravado com sucesso!");
	}
	
}
