package bogdanov.services.cg;

import bogdanov.dto.TeamDTO;
import bogdanov.dto.request.TeamRequestDTO;
import bogdanov.entity.common.Team;
import bogdanov.entity.request.TeamRequest;
import bogdanov.services.AbstractService;
import bogdanov.services.business.TeamBusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TeamCgServiceImpl extends AbstractService implements TeamCgService {

    @Autowired
    private TeamBusinessService teamBusinessService;


    public TeamDTO createTeam(TeamDTO teamDTO) {
        Team team = mappingService.map(teamDTO, Team.class);
        Team createdTeam = teamBusinessService.createTeam(team);
        return mappingService.map(createdTeam, TeamDTO.class);
    }

    public List<TeamDTO> findAllTeams(int page, int size, Sort.Direction direction, String[] properties) {
        Page<Team> teams = teamBusinessService.findAllTeams(new PageRequest(page, size, direction, properties));
        return mappingService.mapList(teams.getContent(), TeamDTO.class);

    }

    public List<TeamDTO> findAll(TeamRequestDTO teamRequestDTO) {
        TeamRequest teamRequest = mappingService.map(teamRequestDTO, TeamRequest.class);
        List<Team> teams = teamBusinessService.findAll(teamRequest);
        return mappingService.mapList(teams, TeamDTO.class);
    }
}
