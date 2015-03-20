package br.com.quartetoalegreto.orcamento.modelo;

public class InstrumentoMusical {

	private String nome;
	private TipoInstrumento tipo;
	private Double valorLocacao;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public TipoInstrumento getTipo() {
		return tipo;
	}
	public void setTipo(TipoInstrumento tipo) {
		this.tipo = tipo;
	}
	public Double getValorLocacao() {
		return valorLocacao;
	}
	public void setValorLocacao(Double valorLocacao) {
		this.valorLocacao = valorLocacao;
	}
}
