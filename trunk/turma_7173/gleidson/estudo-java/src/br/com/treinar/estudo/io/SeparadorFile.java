package br.com.treinar.estudo.io;

import java.io.File;

public class SeparadorFile {
	
	public static void main(String[] args) {
		String separador = File.separator;
		
		String path = "c:" + separador + "gleidson" + separador + "temp";
		
		System.out.println(path);
		File f = new File(path);
		f.mkdir();
	}
	
}
