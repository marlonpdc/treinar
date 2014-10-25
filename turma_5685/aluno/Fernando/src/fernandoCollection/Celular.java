package fernandoCollection;

public class Celular {
	private String modelo;
	private String marca;
	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Celular [modelo=" + modelo + ", marca=" + marca + "]";
	}
	
}
