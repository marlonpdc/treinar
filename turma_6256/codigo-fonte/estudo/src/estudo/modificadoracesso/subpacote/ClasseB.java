package estudo.modificadoracesso.subpacote;

import estudo.modificadoracesso.ClasseA;

public class ClasseB extends ClasseA {

	public void testeProtected() {
		//nao pode ser acessado nas classes que herdam 
		//System.out.println(atributoDefault);
		System.out.println(atributoProtected);
	}
	
}
