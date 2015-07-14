import java.util.Collection;
import java.util.HashSet;


public class AtividadeCollection {
	public static void main(String[] args) {
		
		Collection<String> nome = new HashSet<>();
		
		nome.add("João"); 
		nome.add("Maria"); 
		nome.add("Eduardo"); 
		nome.add("Silvana"); 
		nome.add("Mário"); 
		nome.add("5");
		
        System.out.println("Nomes :" + nome.toString());
		
	}

}

//Nomes :[Silvana, João, Maria, Mário, Eduardo]
//Nomes :[João, Maria, Eduardo, Silvana, Mário]