package bogdanov.repository;


import bogdanov.entity.common.Wrestler;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

public interface WrestlerRepository extends JpaRepository<Wrestler, Long>, QueryDslPredicateExecutor<Wrestler> {
}
