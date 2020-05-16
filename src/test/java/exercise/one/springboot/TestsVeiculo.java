package exercise.one.springboot;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import exercise.one.springboot.model.Veiculo;
import exercise.one.springboot.service.VeiculoService;

@SpringBootTest
class TestsVeiculo {
	
	@Autowired
	VeiculoService veiculoService;
	
//	@Test
//	public void testeSalvar(){		
//		Veiculo veiculo = new Veiculo();		
//		veiculo.setNome("Caminhonete");
//		veiculo.setFatorMultiplidor(2.3);		
//		veiculoService.salvar(veiculo);
//	}
	
//	@Test
//	public void testeSalvarLista(){		
//		List<Veiculo> listVeiculo = new ArrayList<>();
//		
//		Veiculo veiculo = new Veiculo();		
//		veiculo.setNome("Veículo urbano de carga (VUC)");
//		veiculo.setFatorMultiplidor(1.0);
//		listVeiculo.add(veiculo);
//		
//		veiculo = new Veiculo();
//		veiculo.setNome("Caminhão 3/4");
//		veiculo.setFatorMultiplidor(1.05);
//		listVeiculo.add(veiculo);
//		
//		veiculo = new Veiculo();
//		veiculo.setNome("Caminhão toco");
//		veiculo.setFatorMultiplidor(1.08);
//		listVeiculo.add(veiculo);
//		
//		veiculo = new Veiculo();
//		veiculo.setNome("Carreta simples");
//		veiculo.setFatorMultiplidor(1.13);
//		listVeiculo.add(veiculo);
//		
//		veiculo = new Veiculo();
//		veiculo.setNome("Carreta eixo estendido");
//		veiculo.setFatorMultiplidor(1.19);
//		listVeiculo.add(veiculo);		
//		veiculoService.salvarLista(listVeiculo);
//	}
	
	
//	@Test
//	public void testeObeterCustoTotal(){
//		Veiculo veiculo = veiculoService.getVeiculoPorId(25L);
//		Double custoTotal = veiculoService.obterCustoTotal(70, 20, veiculo, 5);
//		Double custoTotalFormatado = BigDecimal.valueOf(custoTotal)
//						    			.setScale(3, RoundingMode.HALF_UP)
//						    			.doubleValue();		
//		
//		assertEquals(custoTotalFormatado, 63.18);
//	}
	
	@Test
	public void testeGetVeiculoPorNome(){
		Veiculo veiculo = veiculoService.getVeiculoPorNome("Carreta simples");
		assertEquals(veiculo.getNome(), "Carreta simples");
		
		veiculo = veiculoService.getVeiculoPorNome("Veículo urbano de carga (VUC)");
		assertEquals(veiculo.getNome(), "Veículo urbano de carga (VUC)");
		
		veiculo = veiculoService.getVeiculoPorNome("Caminhão 3/4");
		assertEquals(veiculo.getNome(), "Caminhão 3/4");
		
		veiculo = veiculoService.getVeiculoPorNome("Caminhão toco");
		assertEquals(veiculo.getNome(), "Caminhão toco");
		
		veiculo = veiculoService.getVeiculoPorNome("Carreta eixo estendido");
		assertEquals(veiculo.getNome(), "Carreta eixo estendido");
	}

}
