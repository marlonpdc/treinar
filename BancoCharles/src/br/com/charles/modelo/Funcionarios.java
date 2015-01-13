package br.com.charles.modelo;

public class Funcionarios {
	
	Double salario;
	String nome;
	String cargo;
	
	
	public  void aumentaSalario(double valor){
		
		this.salario += valor;
	}
	
	public String dadosFunc(){
		
		return this.nome;
	}

}
