package bogdanov.repository;

import bogdanov.entity.common.City;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CityRepository extends PagingAndSortingRepository<City, Long> {

}
