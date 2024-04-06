package fcamara.concessionaria.repositories;
import fcamara.concessionaria.entities.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeiculoRepository extends JpaRepository <Veiculo, Integer>{

}
