package br.com.treinar.bradesco.controle;

import br.com.treinar.bradesco.PrevidenciaPrivada;
import br.com.treinar.bradesco.banco.BradescoUtil;

public class PrevidenciaControle {

	public void cadastrarPlanoPrevidencia(PrevidenciaPrivada titulo) {
		BradescoUtil util = BradescoUtil.getInstance();
		util.adicionarPrevidencia(titulo);
	}
	
}
