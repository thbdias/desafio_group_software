package exercise.one.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import exercise.one.springboot.model.Veiculo;
import exercise.one.springboot.repository.VeiculoRepository;
import exercise.one.springboot.util.RodoviaEnum;

@Service
public class VeiculoService {

	@Autowired
	VeiculoRepository veiculoRepository;
	private static final Integer LIMITE_CARGA = 5;
	private static final Double VALOR_POR_TONELADA_POR_KM = 0.03;
	
	public void salvar(Veiculo veiculo) {
		veiculoRepository.save(veiculo);
	}
	
	public void salvarLista(List<Veiculo> listVeiculo) {
		veiculoRepository.saveAll(listVeiculo);
	}
	
	public Veiculo getVeiculoPorId(Long id) {
		return veiculoRepository.findById(id).get();
	}
	
	
	public Double obterCustoTotal(Integer distPavimento, Integer distNaoPavimento, Veiculo veiculo, Integer carga) {
		Double custoTotal = 0.0;		
		Integer distanciaTotal = distPavimento + distNaoPavimento;
		
		custoTotal = ((distPavimento*RodoviaEnum.RODOVIA_PAVIMENTADA.getValor()) + 
						(distNaoPavimento*RodoviaEnum.RODOVIA_NAO_PAVIMENTADA.getValor())) * veiculo.getFatorMultiplidor();
		
		if (carga > LIMITE_CARGA) {
			custoTotal += distanciaTotal * VALOR_POR_TONELADA_POR_KM * (carga - LIMITE_CARGA);
		}
		
		return custoTotal;
	}
	
}
