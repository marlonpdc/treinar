package atividade;

public class Pessoa {
	String nome;
	String endereco;
	String numero;
	String complemento;
	String bairro;
	String cidade;
	String estado;
	String cep;
	String telefone;
	String email;
	int idade;
	float salario;
	Cargo cargo;
	
//	public Pessoa() {
//		System.out.println("");
//	}

	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;		
	}

	public Pessoa() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", endereco=" + endereco + ", cidade="
				+ cidade + "]";
	}

	void calcIdade() {
		idade++;
	}

	void calcSalario(int fator){
		salario = salario + (salario * fator)/100 ;
	}
}
