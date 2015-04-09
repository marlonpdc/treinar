package estudo.string;

public class ExemploStringBuilder {

	
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < 1000; i++) {
			sb.append("Gleidson" + " - " + i);
			sb.append("\t ").append(i).append("\n");
		}
		System.out.println(sb);
		
	}
	
	
}
