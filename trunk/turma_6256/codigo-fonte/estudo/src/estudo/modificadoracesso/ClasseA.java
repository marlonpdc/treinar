package estudo.modificadoracesso;

public class ClasseA {

	private Integer atributoPrivado;
	Integer atributoDefault;
	protected Integer atributoProtected;
	public Integer atributoPublic;
	private ClasseA a;
	
	private void metodoPrivado() {
		System.out.println(atributoPrivado);
		System.out.println(a.atributoPrivado);
	}
	
	public void metodoPublico(ClasseA a) {
		metodoPrivado();
		System.out.println(a.atributoPrivado);
	}
	
	void metodoProtected() {
		System.out.println(atributoProtected);
	}
	
}
