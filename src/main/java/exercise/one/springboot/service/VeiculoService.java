package exercise.one.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import exercise.one.springboot.model.Veiculo;
import exercise.one.springboot.repository.VeiculoRepository;

@Service
public class VeiculoService {

	@Autowired
	VeiculoRepository veiculoRepository;
	
	public void salvar(Veiculo veiculo) {
		veiculoRepository.save(veiculo);
	}
	
}
