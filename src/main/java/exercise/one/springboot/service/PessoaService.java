package exercise.one.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import exercise.one.springboot.model.Pessoa;
import exercise.one.springboot.repository.PessoaRepository;

@Service
public class PessoaService {

	@Autowired
	PessoaRepository pessoaRepository;
	
	public void salvar(Pessoa pessoa) {
		pessoaRepository.save(pessoa);
	}
	
}
