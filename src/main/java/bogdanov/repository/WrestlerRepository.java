package bogdanov.repository;


import bogdanov.entity.common.Wrestler;
import org.springframework.data.repository.CrudRepository;

public interface WrestlerRepository extends CrudRepository<Wrestler, Long> {
}
