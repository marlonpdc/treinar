package br.com.treinar.bradesco.banco;

import br.com.treinar.bradesco.CartaoCredito;
import br.com.treinar.bradesco.PrevidenciaPrivada;


public class BradescoUtil {
	
	private static BradescoUtil instance;
	
	private Banco banco;
	
	private BradescoUtil() {
		super();
		banco = new Banco();
	}
	
	static {
		instance = new BradescoUtil();
	}
	
	public static BradescoUtil getInstance() {
		return instance;
	}
	
	public Integer soma(Integer a, Integer b) {
		return a + b;
	}

	public Boolean adicionarConta(Conta c) {
		return banco.adicionarProduto(c);
	}
	
	public Boolean adicionarCartao(CartaoCredito c) {
		return banco.adicionarProduto(c);
	}
	
	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public Conta recuperarConta(Long numeroConta) {
		Conta contaEncontrada = null;
		for (Conta conta : banco.getContas()) {
			if (conta.getNumeroConta().equals(numeroConta)) {
				contaEncontrada = conta;
				break;
			}
		}			
		return contaEncontrada;
	}

	public void tarifar() {
		for (Conta c : banco.getContas()) {
			if (c != null) {
				if (c instanceof ITarifavel) {
					ITarifavel produtoTarifavel = (ITarifavel) c;
					tarifar(produtoTarifavel);
				}
			}
		}
		for (CartaoCredito cc : banco.getCartoesCredito()) {
			tarifar(cc);
		}
	}

	private void tarifar(ITarifavel c) {
		c.tarifar();
	}

	public void adicionarPrevidencia(PrevidenciaPrivada titulo) {
		banco.adicionarProduto(titulo);
	}

}
