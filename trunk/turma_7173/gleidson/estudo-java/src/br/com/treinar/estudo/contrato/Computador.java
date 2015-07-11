package br.com.treinar.estudo.contrato;

public class Computador implements IEmail {

	String monitor;
	String teclado;
	
	@Override
	public String recuperarTextoEmail() {
		return "<h1>" + monitor + " " + teclado + "<h1>";
	}
	
}
