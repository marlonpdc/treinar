package br.com.treinar.bb.controle;

import br.com.treinar.bb.util.BBUtil;

public class BancoControle {

private BBUtil util;
	
	public BancoControle() {
		util = BBUtil.getInstance();
	}
	
	public void carregarContas() throws Exception {
		util.carregarContas();
	}
	
}
