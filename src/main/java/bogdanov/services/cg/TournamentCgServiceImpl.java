package bogdanov.services.cg;

import bogdanov.converter.TournamentConverter;
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

    public List<TournamentDTO> findAll(TournamentRequestDTO tournamentRequestDTO) {
        TournamentRequest tournamentRequest = mappingService.map(tournamentRequestDTO, TournamentRequest.class);
        List<Tournament> tournaments = tournamentBusinessService.findAll(tournamentRequest);
        return mappingService.mapList(tournaments, TournamentDTO.class);
    }
}
