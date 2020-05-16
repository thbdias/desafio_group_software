package exercise.one.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import exercise.one.springboot.model.Pessoa;
import exercise.one.springboot.repository.PessoaRepository;

@SpringBootTest
class SpringbootApplicationTests {
	
	@Autowired
	PessoaRepository pessoaRepository;

	@Test
	void contextLoads() {
	}
	
	@Test
	public void testeSalvar(){		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("maria");
		pessoa.setSobrenome("jose");
		pessoaRepository.save(pessoa);
	}

}
