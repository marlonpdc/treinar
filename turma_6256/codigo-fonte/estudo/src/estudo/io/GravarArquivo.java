package estudo.io;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class GravarArquivo {

	public static void main(String[] args) throws IOException {
		OutputStream os = new FileOutputStream("saida.txt", Boolean.TRUE) {
		};
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);

		bw.write("\nTeste saida");
		bw.close();
		
	}

}
