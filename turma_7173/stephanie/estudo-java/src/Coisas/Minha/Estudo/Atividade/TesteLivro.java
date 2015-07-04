package Coisas.Minha.Estudo.Atividade;

public class TesteLivro {
	public static void main(String[] args) {
		Livro l = new Livro();
		l.autor = "Jhon Green";
		l.titulo = "A culpa é das estrelas *** ";
		l.paginas = 800;
		
		Livro novo = l;
		
		novo.titulo = "O teorema de Katarine";
		System.out.println(novo.titulo);
		System.out.println(novo.autor);
	}
}
