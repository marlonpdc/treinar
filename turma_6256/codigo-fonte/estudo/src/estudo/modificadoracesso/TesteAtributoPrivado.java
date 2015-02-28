package estudo.modificadoracesso;

public class TesteAtributoPrivado {

	public static void main(String[] args) {
		ClasseA c = new ClasseA();
		ClasseA c2 = new ClasseA();
		
		//The field ClasseA.atributoPrivado is not visible
		//System.out.println(c.atributoPrivado);
		
		c.metodoPublico(c2);
		//visivel pois esta no mesmo pacote
		System.out.println(c.atributoDefault);
		
		//visivel pois esta no mesmo pacote
		System.out.println(c.atributoProtected);
	}
	
}
