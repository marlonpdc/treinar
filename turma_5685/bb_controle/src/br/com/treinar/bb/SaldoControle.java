package br.com.treinar.bb;

import br.com.treinar.bb.dado.BaseDados;


public class SaldoControle {

	     public Double recuperarSaldo(){
	    	 
	    	 return BaseDados.getInstance().conta.saldo;
	    	 
	     }          
          
}