package fernandoCollection;

public class Celular implements Comparable<Celular> {
	private String marca;
	private Integer tela;
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Integer getTela() {
		return tela;
	}

	public void setTela(Integer tela) {
		this.tela = tela;
	}

	@Override
	public String toString() {
		return "Celular [marca=" + marca + ", tela=" + tela + "]";
	}

	@Override
	public int compareTo(Celular celular) {
		return tela.compareTo(celular.getTela());
	}
	
}
