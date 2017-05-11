package bogdanov.repository;

import bogdanov.entity.common.Team;
import org.springframework.data.repository.CrudRepository;

public interface TeamRepository extends CrudRepository<Team, Long> {
}
