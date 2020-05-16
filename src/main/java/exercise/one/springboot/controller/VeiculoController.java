package exercise.one.springboot.controller;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

import javax.swing.text.html.ListView;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import exercise.one.springboot.model.CustoTotal;
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
	public ModelAndView calcularCustoTotal(CustoTotal custoTotal) {
		
//		Veiculo veiculo = veiculoService.getVeiculoPorNome(custoTotal.getNomeVeiculo());		
		Double valorCustoTotal = veiculoService.obterCustoTotal(custoTotal.getDistanciaRodoviaPavimentada() , 
																custoTotal.getDistanciaNaoRodoviaPavimentada(), 
																custoTotal.getVeiculo(), 
																custoTotal.getCarga());
		
		Double valorCustoTotalFormatado = BigDecimal.valueOf(valorCustoTotal)
									    			.setScale(2, RoundingMode.HALF_UP)
									    			.doubleValue();
		
		custoTotal.setValorCustoTotal(valorCustoTotalFormatado);
		
//		System.out.println("\n custo = " + valorCustoTotal);
//		System.out.println("\n custo = " + valorCustoTotalFormatado);

		List<Veiculo> listVeiculo = veiculoService.getTodosVeiculos();
		
		ModelAndView modelAndView = new ModelAndView("index");
		modelAndView.addObject("custoObj", custoTotal);
		modelAndView.addObject("veiculosObj", listVeiculo);
		return modelAndView; 
		
	}
	
}

