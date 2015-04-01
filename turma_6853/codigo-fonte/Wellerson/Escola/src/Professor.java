import java.math.BigDecimal;
import java.util.Date;


public class Professor extends Pessoa {
	
	String disciplina;
	Integer qtdAulas;
	Date dataAdmissao;
	BigDecimal salario;
	
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	public Integer getQtdAulas() {
		return qtdAulas;
	}
	public void setQtdAulas(Integer qtdAulas) {
		this.qtdAulas = qtdAulas;
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

	
	public double salario(Integer horaAula, Integer qtdAulas){
		
		double salario = horaAula*qtdAulas;
		return salario;
		
	}

}
