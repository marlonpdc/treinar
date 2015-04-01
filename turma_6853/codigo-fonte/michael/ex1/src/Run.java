import java.util.Scanner;


public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String Nome;
		 String Matricula;
		 String Cpf;
		 String dataNascimento;
		 String Senha;
		 double salario;
		 
		 int contador= 0;
		 Scanner inputConsole = new Scanner(System.in);
		 Pessoa[] ArrayPessoas= new Pessoa[Pessoa.NumeroLimiteObjetos];
		 		
		 while(true)
		 {
			 System.out.println("Para Cadastrar Engenheiro - 1");
			 System.out.println("Para Cadastrar Diretor - 2");
			 System.out.println("Para Cadastrar Aux - 3");
			 System.out.println("0 para sair");
			 int option = Integer.valueOf(inputConsole.nextLine());
			 if(option == 0)
				 break;
			 
			 System.out.println("Nome?");
		     Nome = inputConsole.nextLine();
		     
		     System.out.println("Matricula?");
		     Matricula = inputConsole.nextLine();
		     
		     System.out.println("Cpf?");
		     Cpf = inputConsole.nextLine();
		     
		     System.out.println("DataNascimento?");
		     dataNascimento = inputConsole.nextLine();
		     
		     System.out.println("Senha?");
		     Senha = inputConsole.nextLine();
		     
		     System.out.println("salario?");
		     salario = Double.valueOf(inputConsole.nextLine());
			 
		     if(contador==Pessoa.NumeroLimiteObjetos)
		     {
		    	 System.out.println("buffer lotou");
		    	 break;
		     }
		     
			 switch(option)
			 {
			 
			 case 1:
				 ArrayPessoas[contador] = new Engenheiros(Nome, Matricula, Cpf, dataNascimento, Senha, salario); 
				 break;
			 case 2:
				 ArrayPessoas[contador] = new Diretores(Nome, Matricula, Cpf, dataNascimento, Senha, salario); 
				 break;
			 case 3:
				 String tipoEPI;
				 System.out.println("tipoEPI?");
				 tipoEPI = (inputConsole.nextLine());
				 ArrayPessoas[contador] = new Auxiliares(Nome, Matricula, Cpf, dataNascimento, Senha, salario,tipoEPI); 
				 break;
			 default:
				 break;
			 }
			 contador++;
		 }
		 
		 while(true)
		 {
			 System.out.println("Pesquisa? (S,N)");
			 String option = inputConsole.nextLine();
			 if(option == "N")
				 break;
			 
			 System.out.println("Matricula?");
			 String MatriculaSearch = inputConsole.nextLine();
			 
			 boolean ok = false;
			 for(int i=0; i<contador;i++)
			 {
				 if(MatriculaSearch.equals(ArrayPessoas[i].getMatricula())){
					 ArrayPessoas[i].MyPrint();
					 ok = true;
				 }
			 }
			 if(ok==false)
				 System.out.println("Matricula n encontrada");
		 }
	}

}




