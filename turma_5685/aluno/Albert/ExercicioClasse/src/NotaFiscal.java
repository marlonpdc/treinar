import java.util.List;


public class NotaFiscal {
	
	private Integer numeroNotaFiscal;
	private String dataEmissaoNotaFiscal;
	private Integer CNPJNotaFiscal;
	private Double valorNotaFiscal;
	
	List<Produto> produtos;
	
	
	public Integer getNumeroNotaFiscal() {
		return numeroNotaFiscal;
	}
	public void setNumeroNotaFiscal(Integer numeroNotaFiscal) {
		this.numeroNotaFiscal = numeroNotaFiscal;
	}
	public String getDataEmissaoNotaFiscal() {
		return dataEmissaoNotaFiscal;
	}
	public void setDataEmissaoNotaFiscal(String dataEmissaoNotaFiscal) {
		this.dataEmissaoNotaFiscal = dataEmissaoNotaFiscal;
	}
	public Integer getCNPJNotaFiscal() {
		return CNPJNotaFiscal;
	}
	public void setCNPJNotaFiscal(Integer cNPJNotaFiscal) {
		CNPJNotaFiscal = cNPJNotaFiscal;
	}
	
	
	

}
