package bogdanov.repository;


import bogdanov.entity.common.Wrestler;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface WrestlerRepository extends PagingAndSortingRepository<Wrestler, Long> {
}
