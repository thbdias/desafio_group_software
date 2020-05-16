package exercise.one.springboot.model;

public class CustoTotal {

	private Double valorCustoTotal;
	private Integer distanciaRodoviaPavimentada;
	private Integer distanciaNaoRodoviaPavimentada;
	private String nomeVeiculo;
	private Integer carga;
	private Veiculo veiculo;
	
	
	
	
	
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	
	public Veiculo getVeiculo() {
		return veiculo;
	}

	public Double getValorCustoTotal() {
		return valorCustoTotal;
	}

	public void setValorCustoTotal(Double valorCustoTotal) {
		this.valorCustoTotal = valorCustoTotal;
	}

	public Integer getDistanciaRodoviaPavimentada() {
		return distanciaRodoviaPavimentada;
	}

	public void setDistanciaRodoviaPavimentada(Integer distanciaRodoviaPavimentada) {
		this.distanciaRodoviaPavimentada = distanciaRodoviaPavimentada;
	}

	public Integer getDistanciaNaoRodoviaPavimentada() {
		return distanciaNaoRodoviaPavimentada;
	}

	public void setDistanciaNaoRodoviaPavimentada(Integer distanciaNaoRodoviaPavimentada) {
		this.distanciaNaoRodoviaPavimentada = distanciaNaoRodoviaPavimentada;
	}

	public String getNomeVeiculo() {
		return nomeVeiculo;
	}

	public void setNomeVeiculo(String nomeVeiculo) {
		this.nomeVeiculo = nomeVeiculo;
	}

	public Integer getCarga() {
		return carga;
	}

	public void setCarga(Integer carga) {
		this.carga = carga;
	}

}
