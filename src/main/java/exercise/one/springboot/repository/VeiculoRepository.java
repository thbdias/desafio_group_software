package exercise.one.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import exercise.one.springboot.model.Veiculo;

@Repository
@Transactional
public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {
	
	@Query("select v from Veiculo v where v.nome like ?1")
	Veiculo findVeiculoByName(String nome);

}