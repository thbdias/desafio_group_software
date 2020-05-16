package exercise.one.springboot;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import exercise.one.springboot.model.Pessoa;
import exercise.one.springboot.model.Veiculo;
import exercise.one.springboot.repository.VeiculoRepository;
import exercise.one.springboot.service.VeiculoService;
import exercise.one.springboot.util.RodoviaEnum;

@SpringBootTest
class TestsVeiculo {
	
	@Autowired
	VeiculoService veiculoService;
	
	@Test
	public void testeSalvar(){		
		List<Veiculo> listVeiculo = new ArrayList<>();
		
		Veiculo veiculo = new Veiculo();		
		veiculo.setNome("Veículo urbano de carga (VUC)");
		veiculo.setFatorMultiplidor(1.0);
		listVeiculo.add(veiculo);
		
		veiculo = new Veiculo();
		veiculo.setNome("Caminhão 3/4");
		veiculo.setFatorMultiplidor(1.05);
		listVeiculo.add(veiculo);
		
		veiculo = new Veiculo();
		veiculo.setNome("Caminhão toco");
		veiculo.setFatorMultiplidor(1.08);
		listVeiculo.add(veiculo);
		
		veiculo = new Veiculo();
		veiculo.setNome("Carreta simples");
		veiculo.setFatorMultiplidor(1.13);
		listVeiculo.add(veiculo);
		
		veiculo = new Veiculo();
		veiculo.setNome("Carreta eixo estendido");
		veiculo.setFatorMultiplidor(1.19);
		listVeiculo.add(veiculo);
		
		veiculoService.salvarLista(listVeiculo);
	}
	
	
//	@Test
//	public void testeObeterCustoTotal(){
//		Double custoTotal = veiculoService.obterCustoTotal(70, 20);
//	}

}
