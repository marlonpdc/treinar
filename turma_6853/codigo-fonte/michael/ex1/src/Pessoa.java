
public class Pessoa {
	private String Nome;
	private String Matricula;
	private String Cpf;
	private String dataNascimento;
	private String Senha;
	private double salario;
	
	static int NumeroObjetos = 0;
	static final int  NumeroLimiteObjetos = 10;
		
	Pessoa(){
		Pessoa.NumeroObjetos+=1;
		this.setNome("");
		this.setMatricula("");
		this.setCpf("");
		this.setDataNascimento("");
		this.setSenha("");
		this.setSalario(0);
		this.Nome = " midf";
	}
	
	Pessoa(String nome, String Matricula,String Cpf, String dataNascimento, String Senha, double salario){
		Pessoa.NumeroObjetos+=1;
		this.setNome(nome);
		this.setMatricula(Matricula);
		this.setCpf(Cpf);
		this.setDataNascimento(dataNascimento);
		this.setSenha(Senha);
		this.setSalario(salario);
		
	}
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getMatricula() {
		return Matricula;
	}
	public void setMatricula(String matricula) {
		Matricula = matricula;
	}
	public String getCpf() {
		return Cpf;
	}
	public void setCpf(String cpf) {
		Cpf = cpf;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getSenha() {
		return Senha;
	}
	public void setSenha(String senha) {
		Senha = senha;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void MyPrint()
	{
		System.out.println("Nome = " + this.getNome());
		System.out.println("Matricula = " + this.getMatricula());
		System.out.println("CPF = " + this.getCpf());
		System.out.println("Data Nascimento = " + this.getDataNascimento());
		System.out.println("Senha = " + this.getSenha());
		System.out.println("Salario = " + this.getSalario());
		
	}
}
