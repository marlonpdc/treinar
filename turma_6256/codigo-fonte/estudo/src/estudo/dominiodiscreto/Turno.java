package estudo.dominiodiscreto;

public enum Turno {

	MANHA("Manhã", 4, 12),
	TARDE("Tarde", 13, 18),
	NOITE("Noite", 19, 3);
	
	private Turno(String descricao, Integer horaInicio, Integer horaTermino) {
		this.descricao = descricao;
	}
	
	private Integer horaInicio;
	private Integer horaTermino;
	
	private String descricao;
	
	public String getDescricao() {
		return descricao;
	}
	public Integer getHoraInicio() {
		return horaInicio;
	}
	public Integer getHoraTermino() {
		return horaTermino;
	}
	
}
