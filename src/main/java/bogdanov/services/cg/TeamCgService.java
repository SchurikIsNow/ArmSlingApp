package bogdanov.services.cg;

import bogdanov.dto.TeamDTO;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface TeamCgService {

    TeamDTO createTeam(TeamDTO teamDTO);

    List<TeamDTO> findAllTeams();

    List<TeamDTO> findAllTeams(int page, int size, Sort.Direction direction, String[] properties);
    
    
}
