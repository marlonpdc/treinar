package br.com.treinar.loja.modelo;

public class Produto {

	public String descricao;
	public Double preco;
	private Integer porcentagemComissao;
	
	public Integer pegarPorcentagemComissao() {
		return porcentagemComissao;
	}
	
	public void atribuirValorPorcentagemComissao(Integer porcentagemComissao) {
		if (porcentagemComissao >= 0) {
			this.porcentagemComissao = porcentagemComissao <= 10 ? porcentagemComissao : 10;			

//			if (porcentagemComissao <= 10) {
//				this.porcentagemComissao = porcentagemComissao;			
//			} else {
//				this.porcentagemComissao = 10;
//			}
			
		} else {
			this.porcentagemComissao = 0;
		}
	}
	
}
