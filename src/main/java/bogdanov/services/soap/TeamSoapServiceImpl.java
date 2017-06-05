package bogdanov.services.soap;

import bogdanov.dto.TeamDTO;
import bogdanov.dto.request.find.TeamRequestDTO;
import bogdanov.services.cg.TeamCgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TeamSoapServiceImpl implements TeamSoapService {

    @Autowired
    private TeamCgService teamCgService;

    public List<TeamDTO> findAllTeamsWithFilter(int page, int size, Sort.Direction direction, String[] properties) {
        return teamCgService.findAllTeams(page, size, direction, properties);
    }

    public TeamDTO createTeam(TeamDTO teamDTO) {
        return teamCgService.createTeam(teamDTO);
    }

    public List<TeamDTO> findAll(TeamRequestDTO teamRequestDTO) {
        return teamCgService.findAll(teamRequestDTO);
    }

}
