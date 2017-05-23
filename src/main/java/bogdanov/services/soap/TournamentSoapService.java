package bogdanov.services.soap;

import bogdanov.dto.TournamentDTO;
import org.springframework.data.domain.Sort;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public interface TournamentSoapService {

    @WebMethod
    List<TournamentDTO> findAllTournaments();

    @WebMethod
    TournamentDTO createTournament(TournamentDTO tournamentDto);

    @WebMethod
    List<TournamentDTO> findAllTournamentsWithFilter(int page, int size, Sort.Direction direction, String[] properties);
}
