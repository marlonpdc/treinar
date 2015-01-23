package br.com.treinar.aula.io;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class GravarArquivo {

	public static void main(String[] args) throws IOException {
	     OutputStream os = new FileOutputStream("saida.txt");
	     OutputStreamWriter osw = new OutputStreamWriter(os);
	     
	     try (BufferedWriter bw = new BufferedWriter(osw)) {
	    	 bw.write("wagner");
	    	 bw.write("matheus");
	    	 bw.write("marlon");
	    	 bw.write("itanilson");
	    	 bw.write("guillaume");
	    	 bw.write("gleidson");
	    	 bw.write("gabriel");
	    	 bw.write("fernando");
	    	 bw.write("charles");
	    	 bw.write("caio");
	    	 bw.write("brunner");
	     }
	     
	   }
	
}
