package br.com.treinar.excecao;

public class Filho {
	
	private String nome;
	private Pai pai;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void pedirIrmaoMaisNovoBuscarPao() {
		System.out.println("estou pedindo meu irmao mais novo para buscar o pão");
	}

	public Pai getPai() {
		return pai;
	}

	public void setPai(Pai pai) {
		this.pai = pai;
	}
	
}
