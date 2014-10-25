package colecoes;

public class Automovel {
	private String tipo;
	private Integer chassi;
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Integer getChassi() {
		return chassi;
	}
	public void setChassi(Integer chassi) {
		this.chassi = chassi;
	}
	@Override
	public String toString() {
		return "Automovel [tipo=" + tipo + ", chassi=" + chassi + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((chassi == null) ? 0 : chassi.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Automovel other = (Automovel) obj;
		if (chassi == null) {
			if (other.chassi != null)
				return false;
		} else if (!chassi.equals(other.chassi))
			return false;
		return true;
	}




}
