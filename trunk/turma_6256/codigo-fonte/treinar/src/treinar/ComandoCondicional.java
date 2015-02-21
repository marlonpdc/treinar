package treinar;

public class ComandoCondicional {

	public static void main(String[] args) {
		boolean temIngresso = true;
		boolean ehMaiorDeIdade = false;
		boolean ehConvidado = true;
		
		//if encadeado
		if (temIngresso && ehMaiorDeIdade) {
			System.out.println("Pode entrar!");
		} else {
			if (ehConvidado) {
				System.out.println("pode entrar");
			} else {
				System.out.println("Não pode entrar!");				
			}
		}
		
		//com senão se
		if (temIngresso && ehMaiorDeIdade) {
			System.out.println("Pode entrar!");
		} else if (ehConvidado) {
			System.out.println("Pode entrar");
		} else {
			System.out.println("Nao pode entrar");
		}
		
		if (ehMaiorDeIdade) {
			System.out.println("Eh maior de idade");
			System.out.println(26);
		} 
		
		//ternario
		String mensagem = ehMaiorDeIdade && temIngresso ? "Pode Entrar" : "Nao pode entrar";
		System.out.println("Ternario: " + mensagem);
		System.out.println("Fim do programa");
		
		System.out.println("bloco switch case");
		String nome = "Amanda";
		switch (nome) {
			case "Sophia":
				System.out.println("Afilhada");
				break;
			case "Nathalia":
				System.out.println("Afilhada e Sobrinha");
				break;
			case "Amanda":
				System.out.println("Afilhada e Sobrinha mais nova");
				break;
			case "Ana Madalena":
				System.out.println("Mãe");
				break;
			case "Getúlio":
				System.out.println("Pai");
				break;
			default:
				System.out.println("Não eh parente");
				break;
		}
	}
	
}
