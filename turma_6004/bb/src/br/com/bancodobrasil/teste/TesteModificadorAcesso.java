package br.com.bancodobrasil.teste;

import br.com.bancodobrasil.teste.modificador.ClasseModificadorAcesso;

public class TesteModificadorAcesso {

	public static void main(String[] args) {
		ClasseModificadorAcesso c = new ClasseModificadorAcesso();
		//o atributo modificadorPublico pode ser acessado
		//pois foi declarado como public na classe 
		//ClasseModificadorAcesso
		System.out.println(c.modificadorPublico);
		//Nao podemos acessar atributos declarados como
		//private fora da classe onde ele foi declarado
		//System.out.println(c.modificadorPrivado);
	}
	
	
}
