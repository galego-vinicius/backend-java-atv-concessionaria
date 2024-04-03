package fcamara.concessionaria.repositories;
import fcamara.concessionaria.entities.Estabelecimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstabelecimentoRepository extends JpaRepository<Estabelecimento, Integer> {
}
