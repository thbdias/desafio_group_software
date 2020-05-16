package exercise.one.springboot;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import exercise.one.springboot.model.Veiculo;
import exercise.one.springboot.service.VeiculoService;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class TestsVeiculo {
	
	@Autowired
	VeiculoService veiculoService;
	
	@Test
	@Order(1)
	public void a_testeSalvar(){		
		Veiculo veiculo = new Veiculo();		
		veiculo.setNome("Caminhonete");
		veiculo.setFatorMultiplidor(2.3);		
		veiculoService.salvar(veiculo);
	}
	
	@Test
	@Order(2)
	public void b_testeSalvarLista(){		
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
	
	
	@Test
	@Order(3)
	public void c_testeObeterCustoTotal(){
		Veiculo veiculo = veiculoService.getVeiculoPorNome("Caminhão toco");
		Double custoTotal = veiculoService.obterCustoTotal(70, 20, veiculo, 5);
		Double custoTotalFormatado = BigDecimal.valueOf(custoTotal)
						    			.setScale(3, RoundingMode.HALF_UP)
						    			.doubleValue();		
		
		assertEquals(custoTotalFormatado, 63.18);
	}
	
	@Test
	@Order(4)
	public void d_testeGetVeiculoPorNome(){
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
	
	@Test
	@Order(5)
	public void e_testeObeterCustoTotal2(){
		Veiculo veiculo = veiculoService.getVeiculoPorNome("Carreta simples");
		Double custoTotal = veiculoService.obterCustoTotal(90, 0, veiculo, 8);
		Double custoTotalFormatado = BigDecimal.valueOf(custoTotal)
						    			.setScale(2, RoundingMode.HALF_UP)
						    			.doubleValue();
		assertEquals(custoTotalFormatado, 72.17);
		
		veiculo = veiculoService.getVeiculoPorNome("Veículo urbano de carga (VUC)");
		custoTotal = veiculoService.obterCustoTotal(0, 85, veiculo, 1);
		custoTotalFormatado = BigDecimal.valueOf(custoTotal)
						    			.setScale(2, RoundingMode.HALF_UP)
						    			.doubleValue();
		assertEquals(custoTotalFormatado, 61.2);
		
		veiculo = veiculoService.getVeiculoPorNome("Carreta eixo estendido");
		custoTotal = veiculoService.obterCustoTotal(20, 80, veiculo, 12);
		custoTotalFormatado = BigDecimal.valueOf(custoTotal)
						    			.setScale(2, RoundingMode.HALF_UP)
						    			.doubleValue();
		assertEquals(custoTotalFormatado, 104.54);
		
		veiculo = veiculoService.getVeiculoPorNome("Caminhão toco");
		custoTotal = veiculoService.obterCustoTotal(70, 20, veiculo, 5);
		custoTotalFormatado = BigDecimal.valueOf(custoTotal)
						    			.setScale(2, RoundingMode.HALF_UP)
						    			.doubleValue();
		assertEquals(custoTotalFormatado, 63.18);
	}	

	@Test
	@Order(6)
	public void f_testeGetAllVeiculos(){
		List<Veiculo> listaVeiculo = veiculoService.getTodosVeiculos();
		System.out.println(listaVeiculo);
		assertEquals(6, listaVeiculo.size());
	}
}
