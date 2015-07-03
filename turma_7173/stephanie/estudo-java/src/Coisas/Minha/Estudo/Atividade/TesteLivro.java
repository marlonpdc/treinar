package Coisas.Minha.Estudo.Atividade;

public class TesteLivro {
	public static void main(String[] args) {
		Livro l = new Livro();
		l.autor = "Jhon Green";
		l.titulo = "A culpa é das estrelas *** ";
		l.paginas = 800;
		System.out.println(l.titulo);
		System.out.println(l.autor);
	}
}
