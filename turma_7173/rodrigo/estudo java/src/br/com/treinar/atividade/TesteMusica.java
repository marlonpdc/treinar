package br.com.treinar.atividade;

public class TesteMusica {
	public static void main(String[] args) {
		Musica c = new Musica();
		c.tipo = "Sertanejo";
		c.nome = "amor";
		c.tocar();
		c.tocar();
		c.tocar();
		c.tocar();
		c.tocar();
		c.tocar();
		c.tocar();
		c.tocar();
		c.tocar();
		System.out.println(c.tempo);
		c.pararExecucao();
		System.out.println(c.tempo);
	}
}
