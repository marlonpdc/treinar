package br.com.treinar.modelo;

public class Telefone {

	private Integer codPais;
	private Integer codCidade;
	private Integer numero;
	private TipoTelefone tipoTelefone;
	
	public Integer getCodPais() {
		return codPais;
	}
	public void setCodPais(Integer codPais) {
		this.codPais = codPais;
	}
	public Integer getCodCidade() {
		return codCidade;
	}
	public void setCodCidade(Integer codCidade) {
		this.codCidade = codCidade;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public TipoTelefone getTipoTelefone() {
		return tipoTelefone;
	}
	public void setTipoTelefone(TipoTelefone tipoTelefone) {
		this.tipoTelefone = tipoTelefone;
	}
	@Override
	public String toString() {
		return "Telefone [codPais=" + codPais + ", codCidade=" + codCidade
				+ ", numero=" + numero + ", tipoTelefone=" + tipoTelefone + "]";
	}
	
	
	
}
