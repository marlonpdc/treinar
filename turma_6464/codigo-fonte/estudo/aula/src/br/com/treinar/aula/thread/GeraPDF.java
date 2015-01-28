package br.com.treinar.aula.thread;

public class GeraPDF implements Runnable {
	
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("Processo 1");			
		}
	}
}
