package br.com.treinar.estudo.thread;

public class MeuPrograma {
  public static void main (String[] args) {
    
    GeraPDF gerapdf = new GeraPDF();
    Thread threadDoPdf = new Thread(gerapdf);
    threadDoPdf.start();
    
    BarraDeProgresso barraDeProgresso = new BarraDeProgresso();
    Thread threadDaBarra = new Thread(barraDeProgresso);
    threadDaBarra.start();    
  }
}