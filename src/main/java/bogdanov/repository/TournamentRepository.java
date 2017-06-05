package bogdanov.repository;


import bogdanov.entity.common.Tournament;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

public interface TournamentRepository extends JpaRepository<Tournament, Long>, QueryDslPredicateExecutor<Tournament> {
}
