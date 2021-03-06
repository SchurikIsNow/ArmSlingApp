package bogdanov.services.business;

import bogdanov.builders.predicate.TeamPredicates;
import bogdanov.entity.common.QTeam;
import bogdanov.entity.common.Team;
import bogdanov.entity.request.find.TeamRequest;
import bogdanov.repository.TeamRepository;
import com.querydsl.core.BooleanBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TeamBusinessServiceImpl implements TeamBusinessService {
    @Autowired
    private TeamRepository teamRepository;


    public Team createTeam(Team team) {
        return teamRepository.save(team);
    }

    public Page<Team> findAllTeams(Pageable pageable) {
        return teamRepository.findAll(pageable);
    }

    public List<Team> findAll(TeamRequest teamRequest) {
        BooleanBuilder filter = TeamPredicates.getTeamFilter(QTeam.team, teamRequest);
        return (List<Team>) teamRepository.findAll(filter);
    }

}