package daniel;

public class Cruzeiro {

	public static void main(String[] args) {
		
		Time time = new Time();
		time.nome = "Cruzeiro";
		
		time.atacante = new Jogador();
		
		time.atacante.nome = "Macelo moreno";
		time.atacante.idade = 30;
		time.atacante.posicao = "Atacante";
		
		time.treinador = new Treinador();
		
		time.treinador.nome = "Marcelo Oliveira";
		time.treinador.anosExperiencia = 5;
		time.treinador.idade = 40;
		
		time.goleiro = new Jogador();
		
		time.goleiro.nome = "Fabio";
		time.goleiro.idade = 29;
		time.goleiro.posicao = "Goleiro";
		
		System.out.println("Time " + time.nome);
		System.out.println("Treinado " + time.treinador.nome);
		System.out.println("Goleiro " + time.goleiro.nome);
		System.out.println("Atacante " + time.atacante.nome);
		
		
	}

}
