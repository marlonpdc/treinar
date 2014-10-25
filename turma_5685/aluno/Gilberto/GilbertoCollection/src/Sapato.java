
public class Sapato implements Comparable<Sapato> {
	private String nome;
	private String genero;
	private String marca;
	private Double preco;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	@Override
	public int compareTo(Sapato sapato) {
		return getPreco().compareTo(sapato.getPreco());
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "nome: " +nome+ "genero: " + genero + "marca: " + marca + "Preco: " +preco; 
	}

}
