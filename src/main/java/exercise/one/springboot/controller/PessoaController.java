package exercise.one.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import exercise.one.springboot.model.Pessoa;
import exercise.one.springboot.repository.PessoaRepository;

@Controller
public class PessoaController {
	
	@Autowired
	PessoaRepository pessoaRepository;
	
	@GetMapping(value = "/cadastroPessoa")
	public String inicio() {		
		return "cadastro/cadastroPessoa";
	}	
	
	@PostMapping(value = "/salvarPessoa")
	public String salvar(Pessoa pessoa) {
		pessoaRepository.save(pessoa);
		return "cadastro/cadastroPessoa";
	}

}
