package bogdanov.repository;

import bogdanov.entity.common.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TeamRepository extends JpaRepository<Team, Long>, QueryDslPredicateExecutor<Team> {
}
