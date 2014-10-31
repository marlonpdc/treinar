
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Estoque {
	
	
	private String estoqueNomeProduto;	
	private Map<Integer,Integer> listaItens;	
	

	public String getEstoqueNomeProduto() {
		return estoqueNomeProduto;
	}

	public void setEstoqueNomeProduto(String estoqueNomeProduto) {
		this.estoqueNomeProduto = estoqueNomeProduto;
	}

	
	public Estoque() {
		super();
		this.listaItens = new HashMap<Integer,Integer>();
	}	

	public void CadastraEstoque(Integer codigoProduto, Integer quantidadeItem)	{		
		
		Set<Integer> chaves = listaItens.keySet();
		
		for (Integer chave : chaves) {
			
			if(listaItens.get(chave) != codigoProduto){
				
				listaItens.put(codigoProduto, quantidadeItem);
			}
			
		}
	}
	
	
	

}
