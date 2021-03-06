package bogdanov.services.business;

import bogdanov.entity.common.Tournament;
import bogdanov.entity.common.Wrestler;
import bogdanov.entity.request.find.TournamentRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface TournamentBusinessService {

    Tournament createTournament(Tournament tournament);

    Page<Tournament> findAllTournaments(Pageable pageable);

    List<Tournament> findAll(TournamentRequest tournamentRequest);

    void addWrestler(Wrestler wrestler, long tournamentId);
}
