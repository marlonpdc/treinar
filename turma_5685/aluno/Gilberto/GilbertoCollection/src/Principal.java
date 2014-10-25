import java.util.ArrayList;
import java.util.List;


public class Principal {
	public static void main(String[] args) {
		Sapato sap  = new Sapato();
		sap.setNome("Pisante");
		sap.setGenero("M");
		sap.setMarca("DC");
		sap.setPreco(12.01);
		
		Sapato sap1  = new Sapato();
		sap1.setNome("Pisante de correr");
		sap1.setGenero("M");
		sap1.setMarca("NIKE");
		sap1.setPreco(12.01);
		
		List<Sapato> listSap = new ArrayList<>();
		listSap.add(sap);
		listSap.add(sap1);
		
		
		for (int i = 0; i < listSap.size(); i++) {
			
			System.out.println(listSap.get(i).getGenero());
			System.out.println(listSap.get(i).getMarca());
			System.out.println(listSap.get(i).getPreco());
			System.out.println(listSap.get(i).getNome());
		}
	
	}
}
