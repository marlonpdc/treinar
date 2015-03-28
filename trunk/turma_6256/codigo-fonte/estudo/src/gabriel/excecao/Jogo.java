package gabriel.excecao;

public class Jogo {

	private Personagem personagem;
	private Integer dinheiro;

	public void comprarPersonagem() throws DinheiroInsuficienteException {
		Personagem p = new Personagem();
		p.setNome("Draven");
		if (dinheiro >= p.getValor()) {
			personagem = p;
		} else {
			throw new DinheiroInsuficienteException();
		}
	}

	public Personagem getPersonagem() {
		return personagem;
	}

	public void setPersonagem(Personagem personagem) {
		this.personagem = personagem;
	}

	public Integer getDinheiro() {
		return dinheiro;
	}

	public void setDinheiro(Integer dinheiro) {
		this.dinheiro = dinheiro;
	}

}
