package bogdanov.converter;

import bogdanov.dto.TeamDTO;
import bogdanov.entity.common.Team;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TeamConverterImpl implements TeamConverter {

    public TeamDTO toDTO(Team team) {
        TeamDTO teamDTO = new TeamDTO();

        teamDTO.setId(team.getId());
        teamDTO.setTeamName(team.getTeamName());

        return teamDTO;
    }

    public List<TeamDTO> listToDTOs(List<Team> teams) {
        List<TeamDTO> teamDTOs = new ArrayList<TeamDTO>();

        if (teams == null) {
            return teamDTOs;
        }

        for (Team team : teams) {
            teamDTOs.add(toDTO(team));
        }
        return teamDTOs;
    }

    public Team toEntity(TeamDTO teamDTO) {
        Team team = new Team();

        team.setId(teamDTO.getId());
        team.setTeamName(teamDTO.getTeamName());

        return team;
    }

    public List<Team> listToEntitys(List<TeamDTO> teamDTOs) {
        List<Team> teams = new ArrayList<Team>();

        if (teamDTOs == null) {
            return teams;
        }

        for (TeamDTO teamDTO : teamDTOs) {
            teams.add(toEntity(teamDTO));
        }
        return teams;
    }
}
