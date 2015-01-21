package br.com.treinar.bradesco.controle;

import br.com.treinar.bradesco.banco.BradescoUtil;


public class BradescoControle {

	public void tarifar() {
		BradescoUtil util = BradescoUtil.getInstance();
		util.tarifar();
	}
	
}
