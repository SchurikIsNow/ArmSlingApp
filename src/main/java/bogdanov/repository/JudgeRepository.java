package bogdanov.repository;


import bogdanov.entity.common.Judge;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface JudgeRepository extends PagingAndSortingRepository<Judge, Long> {
}

