package atividade;

public class CalcSalario {

	public static void main(String[] args) {
		int perc;
		perc = 0;
		Pessoa p = new Pessoa("warley",35);
		p.nome = "João";
		p.cargo = new Cargo();
		//Cargo cargo = new Cargo();
		//p.cargo = cargo;
		//cargo = null;
		p.cargo.nome = "GERENTE";
		p.cargo.faixa_salario = "A";
		p.endereco = "RUA A";
		p.numero = "100";
		p.complemento = "APTO 404";
		p.bairro = "CENTRO";
		p.cidade = "BELO HORIZONTE";
		p.estado = "MG";
		p.cep = "30000-000";
		p.telefone = "(31)3333-3333";
		p.email = "joao@email.com.br";
		p.idade = 23;
		p.salario = 1111;
		p.cargo.bonus();
		perc = p.cargo.percentual;
		p.calcSalario(perc);        

		System.out.println("nome " + p.nome);
        System.out.println("endereco " + p.endereco);
        System.out.println("numero " + p.numero);
        System.out.println("complemento " + p.complemento);
        System.out.println("bairro " + p.bairro);        
        System.out.println("cidade " + p.cidade);
        System.out.println("estado " + p.estado);
        System.out.println("cep " + p.cep);
        System.out.println("telefone " + p.telefone);
        System.out.println("email " + p.email);
        System.out.println("idade " + p.idade );                
		System.out.println(p.salario);
		
		Pessoa nova = p;
		
		p = null;
		System.out.println("----------------------------------------");
        System.out.println("nome " + nova.nome);
        System.out.println("endereco " + nova.endereco);
		nova.salario = 2222;
		nova.calcSalario(10);
		System.out.println(nova.salario);		
	}

}
