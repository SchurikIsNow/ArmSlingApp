package bogdanov.converter;


import bogdanov.dto.TeamDTO;
import bogdanov.entity.common.Team;

import java.util.List;

public interface TeamConverter {
    TeamDTO toDTO(Team team);

    List<TeamDTO> listToDTOs(List<Team> teams);

    Team toEntity(TeamDTO teamDTO);

    List<Team> listToEntitys(List<TeamDTO> teamDTOs);
}


