package estudo.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LerInputStream {

	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("arquivo.txt");
		int b = is.read();
		char c = (char)b;
		System.out.println(c);
		is.close();
	}

}
