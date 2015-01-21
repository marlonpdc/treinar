package br.com.treinar.aula.map;

public class MensagemErro {

	private String msg;
	private String categoria;
	private String pop;
	private Integer codigo;
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getPop() {
		return pop;
	}
	public void setPop(String pop) {
		this.pop = pop;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	@Override
	public String toString() {
		return "MensagemErro [msg=" + msg + ", categoria=" + categoria
				+ ", pop=" + pop + ", codigo=" + codigo + "]";
	}

}
