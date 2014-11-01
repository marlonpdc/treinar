package TurmaTreinoHeranca;


import ExceptionGeneric.CpfException;


public class Pessoa {
	
	private String nome;
	private String CPF;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) throws CpfException{
		if(cPF.length() < 11)
		{
			CPF = cPF;
			
		}
		
		/*else{
			throw new IllegalArgumentException("ilegal exception........");
			
		}*/
	}
	
	
	
	
	

}

	