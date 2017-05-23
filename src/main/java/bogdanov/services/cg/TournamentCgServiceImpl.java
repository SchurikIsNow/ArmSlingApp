package bogdanov.services.cg;

import bogdanov.converter.TournamentConverter;
import bogdanov.dto.TournamentDTO;
import bogdanov.entity.common.Tournament;
import bogdanov.services.business.TournamentBusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TournamentCgServiceImpl implements TournamentCgService {

    @Autowired
    private TournamentBusinessService tournamentBusinessService;

    @Autowired
    private TournamentConverter tournamentConverter;

    public TournamentDTO createTournament(TournamentDTO tournamentDTO) {
        Tournament tournament = tournamentConverter.toEntity(tournamentDTO);
        Tournament createdTournament = tournamentBusinessService.createTournament(tournament);
        return tournamentConverter.toDTO(createdTournament);
    }

    public List<TournamentDTO> findAllTournaments() {
        List<Tournament> tournaments = tournamentBusinessService.findAllTournaments();
        return tournamentConverter.listToDTOs(tournaments);
    }

    public List<TournamentDTO> findAllTournaments(int page, int size, Sort.Direction direction, String[] properties) {
        Page<Tournament> Tournaments = tournamentBusinessService.findAllTournaments(new PageRequest(page, size, direction, properties));
        return tournamentConverter.listToDTOs(Tournaments.getContent());

    }
}
