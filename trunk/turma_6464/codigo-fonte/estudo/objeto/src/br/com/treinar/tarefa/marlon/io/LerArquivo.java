package br.com.treinar.tarefa.marlon.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LerArquivo {
	
	public static void main(String[] args) throws FileNotFoundException {
		String file = "C:/Users/Marlon Pinheiro/Desktop/dados.txt";
		InputStream is = new FileInputStream(file);
		InputStreamReader isr = new InputStreamReader(is);

		try (BufferedReader br = new BufferedReader(isr)) {
			String s = br.readLine();
			
			while (s !=null) {
				System.out.println(s);
				s = br.readLine();
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
