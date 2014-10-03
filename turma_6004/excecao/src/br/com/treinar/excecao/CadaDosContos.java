package br.com.treinar.excecao;

public class CadaDosContos {

	static FilhoMaisNovo maisNovo = new FilhoMaisNovo();
	
	public static void main(String[] args) {
		maisNovo.setNome("Giovanni");
		paiPedirFilhoBuscarPao();
		
		try {
			System.out.println("a");
		} finally {
			System.out.println("a");			
		}
		
	}
	
	public static void paiPedirFilhoBuscarPao() {
		try {
			irmaoIedirIrmaoMaisNovoBuscarPao();
			System.out.println("");
		} catch (NaoTemPaoException e) {
			System.out.println("comprar pao de doce");
		} finally {
			System.out.println("sempre sou executado");
		}
	}
	
	public static void irmaoIedirIrmaoMaisNovoBuscarPao() throws NaoTemPaoException {
		irmaoMaisNovobuscarPao(maisNovo);
	}
	
	public static void irmaoMaisNovobuscarPao(FilhoMaisNovo maisNovo) throws NaoTemPaoException {
		maisNovo.buscarPao();		
	}
}
