
public class AlunoTreinar implements Comparable<AlunoTreinar>{
	
	private String nome;
	private int cpf;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", cpf=" + cpf + "]";
	}
	
	public int compareTo(AlunoTreinar aluno)	{
		return getNome().compareTo(aluno.getNome());
	}

}
