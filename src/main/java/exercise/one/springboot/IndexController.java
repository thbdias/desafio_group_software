package exercise.one.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import exercise.one.springboot.model.CustoTotal;
import exercise.one.springboot.model.Veiculo;
import exercise.one.springboot.service.VeiculoService;

@Controller
public class IndexController {
	
	@Autowired
	VeiculoService veiculoService;
	
	@RequestMapping("/")
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView("index");
		
		List<Veiculo> listVeiculo = veiculoService.getTodosVeiculos();
		
		modelAndView.addObject("custoObj", new CustoTotal());
		modelAndView.addObject("veiculosObj", listVeiculo);
		return modelAndView;
	}
	
}
