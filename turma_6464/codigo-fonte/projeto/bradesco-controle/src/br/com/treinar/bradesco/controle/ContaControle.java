package br.com.treinar.bradesco.controle;

import java.util.Date;

import br.com.treinar.bradesco.banco.BradescoUtil;
import br.com.treinar.bradesco.banco.Conta;

public class ContaControle {

	public void cadastrarConta(Conta conta) {
		BradescoUtil util = BradescoUtil.getInstance();
		conta.setDataCriacao(new Date());
		util.setConta(conta);
	}
	
}
