package bogdanov.services.cg;

import bogdanov.dto.TournamentDTO;
import bogdanov.dto.request.TournamentRequestDTO;
import bogdanov.entity.common.Tournament;
import bogdanov.entity.request.TournamentRequest;
import bogdanov.services.AbstractService;
import bogdanov.services.business.TournamentBusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TournamentCgServiceImpl extends AbstractService implements TournamentCgService {

    @Autowired
    private TournamentBusinessService tournamentBusinessService;


    public TournamentDTO createTournament(TournamentDTO tournamentDTO) {
        Tournament tournament = mappingService.map(tournamentDTO, Tournament.class);
        Tournament createdTournament = tournamentBusinessService.createTournament(tournament);
        return mappingService.map(createdTournament, TournamentDTO.class);
    }


    public List<TournamentDTO> findAllTournaments(int page, int size, Sort.Direction direction, String[] properties) {
        Page<Tournament> tournaments = tournamentBusinessService.findAllTournaments(new PageRequest(page, size, direction, properties));
        return mappingService.mapList(tournaments.getContent(), TournamentDTO.class);

    }

    public List<TournamentDTO> findAll(TournamentRequestDTO tournamentRequestDTO) {
        TournamentRequest tournamentRequest = mappingService.map(tournamentRequestDTO, TournamentRequest.class);
        List<Tournament> tournaments = tournamentBusinessService.findAll(tournamentRequest);
        return mappingService.mapList(tournaments, TournamentDTO.class);
    }
}
