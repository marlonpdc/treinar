package TurmaTreinoHeranca;

import ExceptionGeneric.CpfException;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aluno aluno = new Aluno();
		
		try {
			aluno.setCPF("111111111111");
		} catch (CpfException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
