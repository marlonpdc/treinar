package br.com.treinar.estudo.array;


public class TesteParametroArray {

	public static void main(String[] args) {
		ParametroArray pa = new ParametroArray();
		String[] nomes = {"Nome Um","Nome Dois","Nome Tres","Nome Quatro","Nome Cinco"};
		pa.testeParametroArray(1, nomes);
		pa.testeParametroArray(nomes);
		pa.testeParametroArray(1, "Nome Um", "Nome Dois", "Nome Tres",
							   "Nome Quatro", "Nome Cinco");
		
		pa.testeParametroArray(1);
	}
	
}
