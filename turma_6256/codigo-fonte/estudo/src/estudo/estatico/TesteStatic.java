package estudo.estatico;

public class TesteStatic {

	public static void main(String[] args) {
		
//		System.out.println(Refeicao.getPrecoPorQuilo());
//		System.out.println(Refeicao.getPrecoPorQuilo());
		
		Refeicao r1 = null;
		r1 = new Refeicao();
		Refeicao r2 = new Refeicao();
		
		ItemRefeicao itemUm = new ItemRefeicao();
		r1.setItemUm(itemUm);
		
		ItemRefeicao itemUm2 = new ItemRefeicao();
		r2.setItemUm(itemUm2);
		Refeicao.setPrecoPorQuilo(19);
		System.out.println(Refeicao.getPrecoPorQuilo());
		Refeicao.setPrecoPorQuilo(15);
		System.out.println(Refeicao.getPrecoPorQuilo());
	}
	
}
