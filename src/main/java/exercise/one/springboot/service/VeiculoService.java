package exercise.one.springboot.service;

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
	
	
	public Double obterCustoTotal(Integer distPavimento, Integer distNaoPavimento) {
		
		System.out.println("/n/n/n/p = " + distPavimento + "(" + RodoviaEnum.RODOVIA_PAVIMENTADA.getValor() + ")"); 
		System.out.println("/n/n/n/p = " + distNaoPavimento + "(" + RodoviaEnum.RODOVIA_NAO_PAVIMENTADA.getValor() + ")");
		return null;
	}
	
}
