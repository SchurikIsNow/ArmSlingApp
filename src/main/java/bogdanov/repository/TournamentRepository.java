package bogdanov.repository;


import bogdanov.entity.common.Tournament;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TournamentRepository extends PagingAndSortingRepository<Tournament, Long> {
}
