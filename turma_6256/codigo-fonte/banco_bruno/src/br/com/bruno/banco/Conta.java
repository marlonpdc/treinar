package br.com.bruno.banco;

public class Conta {
	private Integer numeroConta;
    private Double valorTotalConta;
    private Double saldoConta = 0d;
    private Double limiteConta= 0d;
    private Cliente cliente ;
    
    public Integer getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}
	public Double getValorTotalConta() {
		return valorTotalConta;
	}
	public void setValorTotalConta(Double valorTotalConta) {
		this.valorTotalConta = valorTotalConta;
	}
	public Double getSaldoConta() {
		return saldoConta;
	}
	public void setSaldoConta(Double saldoConta) {
		this.saldoConta = saldoConta;
	}
	public Double getLimiteConta() {
		return limiteConta;
	}
	public void setLimiteConta(Double limiteConta) {
		this.limiteConta = limiteConta;
	}
	//construtor que instancia o cliente toda vez que a conta for criada.
	public Conta(){
		this.setCliente(new Cliente());
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	void depositoConta(Double quantia){
		this.saldoConta += quantia;
	}
	
	void saqueConta(Double quantia){
		
		this.valorTotalConta = this.saldoConta + this.limiteConta;
		
		if (quantia <= this.saldoConta) {
			this.valorTotalConta -=quantia;
			this.saldoConta -=quantia;
			System.out.println("Saldo da Conta Total:" + this.valorTotalConta);
			System.out.println("Saldo da Conta:" + this.saldoConta);
			System.out.println("Saldo do limite:"+ this.limiteConta );
		}
		if(quantia > this.saldoConta && quantia <= this.limiteConta){
			this.valorTotalConta -=quantia;
			this.saldoConta -=quantia;
			
			if(this.saldoConta < 0){
				this.limiteConta -=(-this.saldoConta);
				this.setSaldoConta(0d);
			}	
			System.out.println("Saldo da Conta Total:" + this.valorTotalConta);
			System.out.println("Saldo da Conta:" + this.saldoConta);
			System.out.println("Saldo do limite:"+ this.limiteConta );
		}
		if(quantia > this.saldoConta && quantia > this.limiteConta){
			System.out.println("Saldo insuficiente para saque.");
		}
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((numeroConta == null) ? 0 : numeroConta.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (numeroConta == null) {
			if (other.numeroConta != null)
				return false;
		} else if (!numeroConta.equals(other.numeroConta))
			return false;
		return true;
	}
	
}
