package bogdanov.repository;


import bogdanov.entity.tournament.AbstractTournament;
import org.springframework.data.repository.CrudRepository;

public interface AbstractTournamentRepository extends CrudRepository<AbstractTournament, Long>{
}
