package exercise.one.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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
	
}
