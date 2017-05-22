package bogdanov.services.soap;

import bogdanov.dto.TeamDTO;
import org.springframework.data.domain.Sort;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public interface TeamSoapService {

    @WebMethod
    TeamDTO createTeam(TeamDTO teamDTO);

    @WebMethod
    List<TeamDTO> findAllTeamsWithFilter(int page, int size, Sort.Direction direction, String[] properties);

    @WebMethod
    List<TeamDTO> findAllTeams();
}
