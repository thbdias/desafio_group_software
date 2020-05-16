package exercise.one.springboot.controller;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import exercise.one.springboot.model.Veiculo;
import exercise.one.springboot.service.VeiculoService;

@Controller
public class VeiculoController {

	@Autowired
	VeiculoService veiculoService;
	
	
	@GetMapping(value = "/cadastroVeiculo")
	public String inicio() {		
		return "cadastro/cadastroVeiculo"; //arquivo html
	}	
	
	@PostMapping(value = "/salvarVeiculo")
	public String salvar(Veiculo veiculo) {
		veiculoService.salvar(veiculo);
		return "cadastro/cadastroVeiculo"; //arquivo html
	}
	
	@PostMapping(value = "/calcularCustoTotal")
	public String calcularCustoTotal(
						@RequestParam("distanciaRodoviaPavimentada") Integer distanciaRodoviaPavimentada,
						@RequestParam("distanciaNaoRodoviaPavimentada") Integer distanciaNaoRodoviaPavimentada,
						@RequestParam("nomeVeiculo") String nomeVeiculo,
						@RequestParam("carga") Integer carga) {
		
		
		Veiculo veiculo = veiculoService.getVeiculoPorNome(nomeVeiculo);		
		Double custoTotal = veiculoService.obterCustoTotal(distanciaRodoviaPavimentada, distanciaNaoRodoviaPavimentada, veiculo, carga);		
		Double custoTotalFormatado = BigDecimal.valueOf(custoTotal)
									    			.setScale(2, RoundingMode.HALF_UP)
									    			.doubleValue();
		
		System.out.println("\n\n custo = " + custoTotal);
		System.out.println("\n\n custo = " + custoTotalFormatado);
		return "index"; //arquivo html
		
	}
	
}

