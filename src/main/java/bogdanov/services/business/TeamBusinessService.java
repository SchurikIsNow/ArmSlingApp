package bogdanov.services.business;

import bogdanov.entity.common.Team;

import java.util.List;

public interface TeamBusinessService  {

    Team createTeam(Team team);

    List<Team> findAllTeams();
}
