package br.com.treinar.estudo.heranca;

public abstract class Funcionario {

	public Funcionario(String nome) {
		this.nome = nome;
	}
	
	private String nome;
	private String sobrenome;
	private String apelido;
	private int idade;
	private double salario;

	public abstract double calcularBonificacao();
	
	public int calcularDiasFerias() {
		return 10;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.length() > 2) {
			this.nome = nome;			
		}
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
