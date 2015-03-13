package br.com.treinar.davidson;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenaNomes {
	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("arquivo.txt");
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);

			String s = br.readLine(); // primeira linha

			List<String> nomes = new ArrayList<String>();
			while (s != null) {
				nomes.add(s);
				s = br.readLine();
			}
			br.close();
			OutputStream os = new FileOutputStream("C:/CursoJava/estudo/src/br/com/treinar/davidson/saida.txt");
			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(osw);
			Collections.sort(nomes);
			for (String nome : nomes) {
				bw.write(nome);
				bw.newLine();
			}			
			bw.close();

		} catch (FileNotFoundException e) {
			System.out.println("Arquivo nao encontrado");;
		} catch (IOException e) {
			System.err.println(e);
		}
	}
}
