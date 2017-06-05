package bogdanov.repository;


import bogdanov.entity.common.PersonalData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

public interface PersonalDataRepository extends JpaRepository<PersonalData, Long>, QueryDslPredicateExecutor<PersonalData> {
}
