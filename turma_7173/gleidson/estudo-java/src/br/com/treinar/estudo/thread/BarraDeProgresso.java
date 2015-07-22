package br.com.treinar.estudo.thread;

public class BarraDeProgresso implements Runnable {
	
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("BarraDeProgresso: " + (i + 1));
		}
	}
	
}