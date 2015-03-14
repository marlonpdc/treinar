package estudo.modificadoracesso.subpacote;

import estudo.modificadoracesso.ClasseA;

public class TesteProtectedDefault {

	public static void main(String[] args) {
		ClasseA a = new ClasseA();
		System.out.println(a);
		//so pode ser acessado no mesmo pacote e na mesma classe
		//System.out.println(a.atributoProtected);
		
	}
	
}
