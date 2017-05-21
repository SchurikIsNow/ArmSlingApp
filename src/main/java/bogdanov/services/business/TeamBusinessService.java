package bogdanov.services.business;

import bogdanov.entity.common.City;
import bogdanov.entity.common.Team;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface TeamBusinessService  {

    Team createTeam(Team team);

    List<Team> findAllTeams();

    Page<Team> findAllTeams(Pageable pageable);


}
