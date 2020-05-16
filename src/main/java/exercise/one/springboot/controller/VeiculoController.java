package exercise.one.springboot.controller;

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
						@RequestParam("distanciaRodoviaPavimentada") Double distanciaRodoviaPavimentada,
						@RequestParam("distanciaNaoRodoviaPavimentada") Double distanciaNaoRodoviaPavimentada,
						@RequestParam("nomeVeiculo") String nomeVeiculo,
						@RequestParam("carga") Integer carga) {
		
		System.out.println("\n\n rp = " + distanciaRodoviaPavimentada);
		System.out.println("\n\n rp = " + distanciaNaoRodoviaPavimentada);
		System.out.println("\n\n rp = " + nomeVeiculo);
		System.out.println("\n\n rp = " + carga);
		return "index"; //arquivo html
		
	}
	
}

