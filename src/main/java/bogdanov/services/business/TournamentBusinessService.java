package bogdanov.services.business;

import bogdanov.entity.common.Tournament;
import bogdanov.entity.request.TournamentRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface TournamentBusinessService {


    List<Tournament> findAllTournaments();

    Tournament createTournament(Tournament tournament);

    Page<Tournament> findAllTournaments(Pageable pageable);

    List<Tournament> findAll(TournamentRequest tournamentRequest);
}
