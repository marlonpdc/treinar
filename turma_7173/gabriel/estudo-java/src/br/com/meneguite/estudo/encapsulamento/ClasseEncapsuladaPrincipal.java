package br.com.meneguite.estudo.encapsulamento;

public class ClasseEncapsuladaPrincipal {

	public static void main(String[] args) {
		
		ClasseEncapsulada classe = new ClasseEncapsulada();
		classe.setNome("Gabriel");
		classe.setIdade(17);
		System.out.println("Nome: " + classe.getNome());
		System.out.println("Idade: " + classe.getIdade());
		
	}

}
