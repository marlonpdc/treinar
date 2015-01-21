package br.com.treinar.bradesco.controle;

import br.com.treinar.bradesco.CartaoCredito;
import br.com.treinar.bradesco.banco.BradescoUtil;

public class CartaoControle {

	public void cadastrarCartao(CartaoCredito cartao) {
		BradescoUtil util = BradescoUtil.getInstance();
		util.adicionarCartao(cartao);
	}
	
}
