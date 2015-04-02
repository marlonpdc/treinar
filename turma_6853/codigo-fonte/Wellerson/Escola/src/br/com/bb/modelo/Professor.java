package br.com.bb.modelo;
import java.math.BigDecimal;
import java.util.Date;


public class Professor extends BaseEntity<Integer> implements IComportamento {
	
	private String disciplina;
	private Integer qtdAulas;
	private Date dataAdmissao;
	private BigDecimal salario;
	private PessoaComportamento pessoa;
	private static BigDecimal horaAula = BigDecimal.valueOf(70.00);
	
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
	
	public PessoaComportamento getPessoa() {
		return pessoa;
	}
	public void setPessoa(PessoaComportamento pessoa) {
		this.pessoa = pessoa;
	}
	public static BigDecimal getHoraAula() {
		return horaAula;
	}
	public static void setHoraAula(BigDecimal horaAula) {
		Professor.horaAula = horaAula;
	}

}
