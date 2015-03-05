package br.com.treinar.estudo.object;


public class Equals {
	public static void main(String[] args) {
		
		ControleRemoto controle = new ControleRemoto();
		controle.cor = "Preto";
		controle.peso = 150;
		
		ControleRemoto outro = new ControleRemoto();
		outro.cor = "Preto";
		outro.peso = 150;
		
		System.out.println(controle.equals(outro));
		System.out.println(controle.hashCode());
		System.out.println(outro.hashCode());
		
	}

	
	static class ControleRemoto {
		String cor;
		Integer peso;
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((cor == null) ? 0 : cor.hashCode());
			result = prime * result + ((peso == null) ? 0 : peso.hashCode());
			return result;
		}
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj) {
				return true;
			}
			if (obj == null) {
				return false;
			}
			if (getClass() != obj.getClass()) {
				return false;				
			}
			ControleRemoto other = (ControleRemoto) obj;
			if (cor == null) {
				if (other.cor != null) {
					return false;					
				}
			} else if (!cor.equals(other.cor)) {
				return false;
			}
			if (peso == null) {
				if (other.peso != null) {
					return false;
				}
			} else if (!peso.equals(other.peso)) {
				return false;
			}
			return true;
		}
		
		
		

	}
}
