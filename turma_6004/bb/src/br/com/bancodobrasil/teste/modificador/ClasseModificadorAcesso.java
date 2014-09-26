package br.com.bancodobrasil.teste.modificador;

public class ClasseModificadorAcesso {

	
	public String modificadorPublico;
	protected String modificadorProtegido;
	String modificadorDefault;
	private String modificadorPrivado;
	
	
	public String recuperarValorDeAtributoPrivado() {
		return modificadorPrivado;
	}
	
}
