import java.math.BigDecimal;


public class Pessoa {

	String nome;
	String endereco;
	String numtelefone;
	Char tipo;
	Integer idade;
	
	public static BigDecimal horaAula = BigDecimal.valueOf(70.00);
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getNumtelefone() {
		return numtelefone;
	}
	public void setNumtelefone(String numtelefone) {
		this.numtelefone = numtelefone;
	}
	public Char getTipo() {
		return tipo;
	}
	public void setTipo(Char tipo) {
		this.tipo = tipo;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	
	
	
}
