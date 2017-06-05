package bogdanov.repository;


import bogdanov.entity.common.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;


public interface CityRepository extends JpaRepository<City, Long>, QueryDslPredicateExecutor<City> {

}
