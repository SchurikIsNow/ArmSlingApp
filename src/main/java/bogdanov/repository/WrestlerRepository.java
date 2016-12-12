package bogdanov.repository;


import bogdanov.entity.wrestler.Wrestler;
import org.springframework.data.repository.CrudRepository;

public interface WrestlerRepository extends CrudRepository<Wrestler, Long>{
}
