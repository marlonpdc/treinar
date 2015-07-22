package br.com.treinar.estudo.thread;
public class BarraDeProgresso implements Runnable {
 
  @Override
	public void run() {
		System.out.println("Barra de progresso");
	}
}