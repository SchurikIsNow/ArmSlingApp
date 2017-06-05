package bogdanov.services.soap;

import bogdanov.dto.TournamentDTO;
import bogdanov.dto.request.TournamentRequestDTO;
import org.springframework.data.domain.Sort;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public interface TournamentSoapService {

    @WebMethod
    TournamentDTO createTournament(TournamentDTO tournamentDto);

    @WebMethod
    List<TournamentDTO> findAllTournamentsWithFilter(int page, int size, Sort.Direction direction, String[] properties);

    @WebMethod
    List<TournamentDTO> findAll(TournamentRequestDTO tournamentRequestDTO);
}
