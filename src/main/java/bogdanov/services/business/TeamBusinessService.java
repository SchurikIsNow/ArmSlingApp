package bogdanov.services.business;

import bogdanov.entity.common.Team;
import bogdanov.entity.request.TeamRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface TeamBusinessService {

    Team createTeam(Team team);

    Page<Team> findAllTeams(Pageable pageable);

    List<Team> findAll(TeamRequest teamRequest);
}
