package br.com.treinar.atividade;

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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class AtividadeIOSaida {

	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("entrada.txt");
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		Map<Character, List<String>> mapNomes =	new HashMap<>();
		Character primeiraLetra = null;

		String s = br.readLine(); // primeira linha

		while (s != null) {
			primeiraLetra = s.charAt(0);
			if (!mapNomes.containsKey(primeiraLetra)) {
				mapNomes.put(primeiraLetra, new ArrayList<String>());
			}
			mapNomes.get(primeiraLetra).add(s);
			s = br.readLine();
		}
		br.close();



		OutputStream os = new FileOutputStream("ordenado.txt", true);
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);

		Set<Entry<Character, List<String>>> entrySet = mapNomes.entrySet();
		for (Entry<Character, List<String>> entry : entrySet) {
			bw.write(entry.getKey() + " = " + entry.getValue());
			bw.newLine();
		}

		bw.close();


	}

}
