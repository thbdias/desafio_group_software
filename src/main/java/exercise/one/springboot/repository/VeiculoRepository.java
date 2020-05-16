package exercise.one.springboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import exercise.one.springboot.model.Veiculo;

@Repository
@Transactional
public interface VeiculoRepository extends CrudRepository<Veiculo, Long> {

}