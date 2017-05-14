package bogdanov.repository;


import bogdanov.entity.common.Judge;
import org.springframework.data.repository.CrudRepository;

public interface JudgeRepository extends CrudRepository<Judge, Long> {
}

