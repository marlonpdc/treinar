package br.com.treinar.estudo.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Scanner;

import com.sun.javafx.collections.MappingChange.Map;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class ExemploIO {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		OutputStream os = new FileOutputStream("saida.txt");
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		
		int cont = 0;
		
		while (cont < 2) {
			System.out.print("Digite seu nome: ");
			bw.write(sc.nextLine());
			bw.newLine();
			cont++;
		}
		
		System.out.println("\t Imprimindo...");		
		bw.close();
		sc.close();
		
		InputStream is = new FileInputStream("saida.txt");
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		/*Map<Character, List<String>> mapNomes = new HashMap<>();
		Character primeiraLetra = null;
		*/
		String s = br.readLine();
		
		while (s != null) {
			
			System.out.println(s);
			
			s = br.readLine();
			
		}
		
		br.close();
		
	}
	
}
