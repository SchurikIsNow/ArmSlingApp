package bogdanov.services.soap;

import bogdanov.dto.TeamDTO;
import bogdanov.dto.request.TeamRequestDTO;
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
    List<TeamDTO> findAll(TeamRequestDTO teamRequestDTO);
}
