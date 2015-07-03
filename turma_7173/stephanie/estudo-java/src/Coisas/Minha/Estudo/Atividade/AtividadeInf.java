package Coisas.Minha.Estudo.Atividade;

public class AtividadeInf {

	public static void main(String[] args) {
		int hora = 2;
		String oi;

		if ( hora > 12){
			oi = " Boa Tarde :D ";
		}else {
			oi = " Boa Dia :) " ;
			}

		System.out.println(oi);
		hora = 20;

		oi= hora < 12 ? "Bom dia :) " : "Boa tarde :D";
		
System.out.println(oi);
System.out.println(hora < 12 ? "Bom dia :) " : "Boa tarde :D");

}

}