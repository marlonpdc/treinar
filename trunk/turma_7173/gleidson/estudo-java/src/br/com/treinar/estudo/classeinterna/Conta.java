package br.com.treinar.estudo.classeinterna;

public class Conta {
	
    private double saldo;
    private EstadoDaConta estado;
 
    private void atualizaEstado() {
        this.estado = saldo >= 0 ? new Positivo() : new Negativo();
    }
 
    public void deposita(double valor) {
        this.estado.deposita(valor);
        atualizaEstado();
    }
 
    public void saca(double valor) {
        this.estado.saca(valor);
        atualizaEstado();
    }
 
    private interface EstadoDaConta {
        void saca(double valor);
        void deposita(double valor);
    }
 
    private class Positivo implements EstadoDaConta {
        public void deposita(double valor) {
            saldo += valor * 0.98;
        }
 
        public void saca(double valor) {
            saldo -= valor;
        }
    }
 
    private class Negativo implements EstadoDaConta {
        public void deposita(double valor) {
            saldo += valor * 0.95;
        }
 
        public void saca(double valor) {
            throw new IllegalStateException();
        }
    }
}