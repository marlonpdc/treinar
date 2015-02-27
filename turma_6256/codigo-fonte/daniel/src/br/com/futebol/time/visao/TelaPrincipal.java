package br.com.futebol.time.visao;

import br.com.futebol.time.modelo.Campeonato;
import br.com.futebol.time.modelo.Jogador;
import br.com.futebol.time.modelo.Time;
import br.com.futebol.time.modelo.Treinador;

public class TelaPrincipal {

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
		
		Campeonato campeonatoMineiro = new Campeonato();
		campeonatoMineiro.nome = "Campeonato Mineiro";
		campeonatoMineiro.comecou = true;
		campeonatoMineiro.time = time;
		
		
		if (campeonatoMineiro.comecou) {
			System.out.println("Atacante");
			time.atacante.chutar();
			System.out.println("Goleiro");
			time.goleiro.chutar();
		} else {
			System.out.println("Entrar em um campeonato.");
		}
		
		System.out.println("depois de executar o metodo chutar...");
		
		System.out.println("Time " + time.nome);
		System.out.println("Treinado " + time.treinador.nome);
		System.out.println("Goleiro " + time.goleiro.nome);
		System.out.println("Atacante " + time.atacante.nome);
		
		time = null;
		campeonatoMineiro = null;
		
		
	}

}
