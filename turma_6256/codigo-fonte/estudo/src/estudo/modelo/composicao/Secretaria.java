package estudo.modelo.composicao;

public class Secretaria implements IFuncao {

	private String uniforme;
	private String setor;
	private Double salario;

	public String getUniforme() {
		return uniforme;
	}

	public void setUniforme(String uniforme) {
		this.uniforme = uniforme;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

}
