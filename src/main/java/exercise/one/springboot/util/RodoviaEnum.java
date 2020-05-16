package exercise.one.springboot.util;

public enum RodoviaEnum {

	RODOVIA_PAVIMENTADA(0.63),
	RODOVIA_NAO_PAVIMENTADA(0.72);
	
	private Double valor;
	
	private RodoviaEnum(Double valor) {
		 this.valor = valor;
	}
	
	public Double getValor() {
		return this.valor;
	}
}
