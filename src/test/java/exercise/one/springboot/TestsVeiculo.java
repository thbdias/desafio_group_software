package exercise.one.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import exercise.one.springboot.model.Pessoa;
import exercise.one.springboot.model.Veiculo;
import exercise.one.springboot.repository.VeiculoRepository;
import exercise.one.springboot.service.VeiculoService;

@SpringBootTest
class TestsVeiculo {
	
	@Autowired
	VeiculoService VeiculoService;

	@Test
	void contextLoads() {
	}
	
	@Test
	public void testeSalvar(){		
		Veiculo veiculo = new Veiculo();
		veiculo.setNome("busu");
		veiculo.setFatorMultiplidor(7.5);
		VeiculoService.salvar(veiculo);
	}

}
