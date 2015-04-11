package br.com.treinar.itau.controle;

public class ControleFactory {

	public static IControle getControle(Class<?> classe) throws ClassNotFoundException {
		IControle controle = null;
		switch (classe.getClass().getName()) {
		case "ItauControleArray":
			controle = new ItauControleArray();
			break;
		case "ItauControleCollection":
			controle = new ItauControleCollection();
			break;
		case "ItauControleJDBC":
			controle = new ItauControleJDBC();
			break;
		default:
			throw new ClassNotFoundException();
		}
		return controle;
	}
	
}
