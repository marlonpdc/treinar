package atividade;

public class AtividadeIf {
	public static void main(String[] args) {

		String oi;
		oi = "";

		int h = 1;;
		
		if (h <= 12 && h > 3) {
			oi = "guten morgen"; 
		} else if (h < 18 && h > 12) {
			oi = "guten tag";
		} else if (h < 23 && h > 18) {
			oi = "guten abend";
		} else {
			oi = "guten nacht";
		}

		System.out.println(oi);

	}

}
