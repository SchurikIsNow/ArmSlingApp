package bogdanov.repository;


import bogdanov.entity.common.Judge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

public interface JudgeRepository extends JpaRepository<Judge, Long>, QueryDslPredicateExecutor<Judge> {
}

