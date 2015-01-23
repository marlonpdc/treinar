package br.com.treinar.bradesco.controle;

import br.com.treinar.bradesco.banco.BradescoUtil;
import br.com.treinar.bradesco.banco.SaldoInsuficienteException;


public class BradescoControle {

	public void tarifar() throws SaldoInsuficienteException {
		BradescoUtil util = BradescoUtil.getInstance();
		util.tarifar();
	}
	
}
