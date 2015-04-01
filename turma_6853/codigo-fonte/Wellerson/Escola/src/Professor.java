import java.math.BigDecimal;
import java.util.Date;


public class Professor extends Pessoa {
	
	String disciplina;
	Integer qtd_aulas;
	Date dataAdmissao;
	BigDecimal salario;
	
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	public Integer getQtd_aulas() {
		return qtd_aulas;
	}
	public void setQtd_aulas(Integer qtd_aulas) {
		this.qtd_aulas = qtd_aulas;
	}
	public Date getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	public BigDecimal getSalario() {
		return salario;
	}
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	
	private double Salario(Integer hora_aula){
		
		double salario = hora_aula*qtd_aulas;
		return salario;
		
	}

}
