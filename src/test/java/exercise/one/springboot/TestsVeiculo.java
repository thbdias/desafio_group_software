package exercise.one.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import exercise.one.springboot.model.Pessoa;
import exercise.one.springboot.model.Veiculo;
import exercise.one.springboot.repository.VeiculoRepository;

@SpringBootTest
class TestsVeiculo {
	
	@Autowired
	VeiculoRepository veiculoRepository;

	@Test
	void contextLoads() {
	}
	
	@Test
	public void testeSalvar(){		
		Veiculo veiculo = new Veiculo();
		veiculo.setNome("Caminhão 3/4");
		veiculo.setFatorMultiplidor(1.5);
		veiculoRepository.save(veiculo);
	}

}
