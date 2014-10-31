import java.util.Map;
import java.util.Set;


public class Produto extends Estoque {
	
		
	private Map<Integer,String> listaProduto;
	
		
	public void CadastraProduto(Integer codigoProduto, String nomeProduto)	{		
			
			Set<Integer> chaves = listaProduto.keySet();					
			listaProduto.put(codigoProduto, nomeProduto);
				
				
			
		}
	

}
