package estudo.estatico;

public class Refeicao {

	private Double valor;
	private static Integer precoPorQuilo;
	
	public Refeicao() {
		System.out.println("Construtor...");
	}
	
	static {
		precoPorQuilo = 10;
	}
	
	static {
		precoPorQuilo = 10;
	}
	
	{
		System.out.println("linha 17");
	}
	
	static {
		precoPorQuilo = 19;
	}
	
	{
		System.out.println("linha 25");
	}

	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public ItemRefeicao getItemUm() {
		return itemUm;
	}
	public void setItemUm(ItemRefeicao itemUm) {
		this.itemUm = itemUm;
	}
	public ItemRefeicao getItemDois() {
		return itemDois;
	}
	public void setItemDois(ItemRefeicao itemDois) {
		this.itemDois = itemDois;
	}
	public ItemRefeicao getItemTres() {
		return itemTres;
	}
	public void setItemTres(ItemRefeicao itemTres) {
		this.itemTres = itemTres;
	}
	public ItemRefeicao getItemQuatro() {
		return itemQuatro;
	}
	public void setItemQuatro(ItemRefeicao itemQuatro) {
		this.itemQuatro = itemQuatro;
	}
	public static Integer getPrecoPorQuilo() {
		return precoPorQuilo;
	}
	public static void setPrecoPorQuilo(Integer precoPorQuilo) {
		Refeicao.precoPorQuilo = precoPorQuilo;
	}
	
	private ItemRefeicao itemUm;
	private ItemRefeicao itemDois;
	private ItemRefeicao itemTres;
	private ItemRefeicao itemQuatro;
	
}
