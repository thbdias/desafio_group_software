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
	
	public void salvar(Veiculo veiculo) {
		veiculoRepository.save(veiculo);
	}
	
	public void salvarLista(List<Veiculo> listVeiculo) {
		veiculoRepository.saveAll(listVeiculo);
	}
	
	
	public Double obterCustoTotal(Integer distPavimento, Integer distNaoPavimento, Veiculo veiculo, Integer carga) {
		
		System.out.println("/n/n/n/p = " + distPavimento + "(" + RodoviaEnum.RODOVIA_PAVIMENTADA.getValor() + ")"); 
		System.out.println("/n/n/n/p = " + distNaoPavimento + "(" + RodoviaEnum.RODOVIA_NAO_PAVIMENTADA.getValor() + ")");
		return null;
	}
	
}
