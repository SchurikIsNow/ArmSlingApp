package bogdanov.services.cg;


import bogdanov.dto.TournamentDTO;
import bogdanov.dto.request.TournamentRequestDTO;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface TournamentCgService {

    TournamentDTO createTournament(TournamentDTO tournamentDTO);

    List<TournamentDTO> findAllTournaments(int page, int size, Sort.Direction direction, String[] properties);

    List<TournamentDTO> findAll(TournamentRequestDTO tournamentRequestDTO);
}
