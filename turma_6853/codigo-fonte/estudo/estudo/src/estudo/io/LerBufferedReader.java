package estudo.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LerBufferedReader {

	public static void main(String[] args) throws IOException {
		
		InputStream is = new FileInputStream("arquivo.txt"); // ler arquivo em forma de bits
		InputStreamReader isr = new InputStreamReader(is);// transforma os bits em char
		BufferedReader br = new BufferedReader(isr);// transforma os char em linha, ou seja, quebra as linhas.

		String s = br.readLine(); // primeira linha

		while (s != null) {
			System.out.println(s);
			s = br.readLine();
		}

		br.close();
	}

}
