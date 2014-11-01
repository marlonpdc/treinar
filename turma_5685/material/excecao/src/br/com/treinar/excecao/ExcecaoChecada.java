package br.com.treinar.excecao;

public class ExcecaoChecada {

	public static void main(String[] args) {
		try {
			System.out.println("antes do erro");
			criarPessoa();
			System.out.println("depois do erro");
		} catch (RuntimeException e) {
			e.printStackTrace();
		} catch (Exception ed) {
			ed.printStackTrace();
		} finally {
			System.out.println("sempre executado");
		}
	}

	private static void criarPessoa() throws Exception {
		Pessoa p = new Pessoa();
		p.setCpf(55L);
	}
	
}
