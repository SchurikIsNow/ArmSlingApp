package bogdanov.repository;

import bogdanov.entity.common.Team;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TeamRepository extends PagingAndSortingRepository<Team, Long> {

}
