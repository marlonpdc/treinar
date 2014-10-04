package br.com.treinar.bb;



import br.com.treinar.bb.dado.BaseDados;

public class SaqueControle {
		
	
	public void sacarConta(Double valorSaque)
	{				
			BaseDados.getInstance().conta.sacar(valorSaque);				
		
	}
	
	
	
}
