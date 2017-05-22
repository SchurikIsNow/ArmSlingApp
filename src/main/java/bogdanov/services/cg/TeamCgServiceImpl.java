package bogdanov.services.cg;

import bogdanov.converter.TeamConverter;
import bogdanov.dto.TeamDTO;
import bogdanov.entity.common.Team;
import bogdanov.services.business.TeamBusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TeamCgServiceImpl implements TeamCgService {
    @Autowired
    private TeamBusinessService teamBusinessService;

    @Autowired
    private TeamConverter teamConverter;

    public TeamDTO createTeam(TeamDTO teamDTO) {
        Team team = teamConverter.toEntity(teamDTO);
        Team createdTeam = teamBusinessService.createTeam(team);
        return teamConverter.toDTO(createdTeam);
    }

    public List<TeamDTO> findAllTeams() {
        List<Team> teams = teamBusinessService.findAllTeams();
        return teamConverter.listToDTOs(teams);
    }

    public List<TeamDTO> findAllTeams(int page, int size, Sort.Direction direction, String[] properties) {
        Page<Team> teams = teamBusinessService.findAllTeams(new PageRequest(page, size, direction, properties));
        return teamConverter.listToDTOs(teams.getContent());

    }
}
