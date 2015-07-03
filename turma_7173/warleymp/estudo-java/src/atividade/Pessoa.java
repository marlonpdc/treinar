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

	void calcIdade() {
		idade++;
	}

	void calcSalario(int fator){
		salario = salario + (salario * fator)/100 ;
	}
}
