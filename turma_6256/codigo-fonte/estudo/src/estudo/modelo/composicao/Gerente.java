package estudo.modelo.composicao;

public class Gerente implements IFuncao {

	private Double bonificacao;
	private Double salario;
	private String setor;

	public Double getBonificacao() {
		return bonificacao;
	}

	public void setBonificacao(Double bonificacao) {
		this.bonificacao = bonificacao;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
	
}
