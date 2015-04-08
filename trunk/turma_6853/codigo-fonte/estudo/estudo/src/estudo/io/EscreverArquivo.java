package estudo.io;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class EscreverArquivo {

	public static void main(String[] args) throws IOException {
		OutputStream os = new FileOutputStream("saida.txt", Boolean.TRUE); // escrever caractere em binario
		OutputStreamWriter osw = new OutputStreamWriter(os); // escrever caractere em char
		BufferedWriter bw = new BufferedWriter(osw); // escrever string
		
		bw.newLine();
		bw.write("treinar tres");
		bw.write("\n");

		bw.close();
	}

}
