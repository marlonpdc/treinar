package gilberto.excecao;

public class Venda {

	public Venda(){
		
	}
	public void adicionarProduto() throws ProdutoNaoDisponivelException{
		 throw new ProdutoNaoDisponivelException();
	}
}
