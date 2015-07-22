package br.com.treinar.estudo.thread;

public class GeraPDF implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("GeraPDF: " + (i + 1));
		}
	}
	
}