package exercise.one.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import exercise.one.springboot.model.CustoTotal;

@Controller
public class IndexController {
	
	@RequestMapping("/")
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView("index");
		modelAndView.addObject("custoObj", new CustoTotal());
		return modelAndView;
	}
	
}
