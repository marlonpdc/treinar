
public class ComandoCondicional {

	public static void main(String[] args) {
		
		String oi , cumprimento = "Bom dia";
		int hora = 12;
		
		if (hora < 12){
			System.out.println(cumprimento);
		} else {
			System.out.println("Boa tarde");
		}
		
		hora = 11;
		
		oi = hora < 12 ? "Bom dia!" : "Boa tarde";
		System.out.println(oi);
		
		oi = hora < 12 ? "Bom dia!" : "Boa tarde";
		System.out.println(oi);
		
		
		
		
	}	
}
