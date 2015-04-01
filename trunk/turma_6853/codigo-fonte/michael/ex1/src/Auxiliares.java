
public class Auxiliares extends Pessoa{
	private String tipoEPI;
	
	Auxiliares(){}
	Auxiliares(String nome, String Matricula,String Cpf, String dataNascimento, String Senha, double salario, String tipoEPI)
	{
		super(nome,Matricula,Cpf,dataNascimento,Senha,salario);
		this.setTipoEPI(tipoEPI);
		this.tipoEPI = tipoEPI;
	}

	public String getTipoEPI() {
		return tipoEPI;
	}

	public void setTipoEPI(String tipoEPI) {
		this.tipoEPI = tipoEPI;
	}
	
	public void MyPrint(){
		super.MyPrint();
		System.out.println("tipoEPI = " + this.getTipoEPI());
	}
	

}
