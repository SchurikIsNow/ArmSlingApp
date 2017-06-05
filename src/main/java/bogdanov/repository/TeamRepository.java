package bogdanov.repository;

import bogdanov.entity.common.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

public interface TeamRepository extends JpaRepository<Team, Long>, QueryDslPredicateExecutor<Team> {
}
