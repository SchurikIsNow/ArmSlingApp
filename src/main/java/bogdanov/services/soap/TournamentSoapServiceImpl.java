package bogdanov.services.soap;

import bogdanov.dto.TournamentDTO;
import bogdanov.dto.request.TournamentRequestDTO;
import bogdanov.services.cg.TournamentCgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class TournamentSoapServiceImpl implements TournamentSoapService {

    @Autowired
    private TournamentCgService tournamentCgService;

    public TournamentDTO createTournament(TournamentDTO tournamentDto) {
        return tournamentCgService.createTournament(tournamentDto);
    }

    public List<TournamentDTO> findAllTournaments() {
        return tournamentCgService.findAllTournaments();
    }

    public List<TournamentDTO> findAllTournamentsWithFilter(int page, int size, Sort.Direction direction, String[] properties) {
        return tournamentCgService.findAllTournaments(page, size, direction, properties);
    }

    public List<TournamentDTO> findAll(TournamentRequestDTO tournamentRequestDTO) {
        return tournamentCgService.findAll(tournamentRequestDTO);
    }

}
