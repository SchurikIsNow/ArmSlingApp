package bogdanov.services.business;

import bogdanov.entity.common.Team;
import bogdanov.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TeamBusinessServiceImpl implements TeamBusinessService {
    @Autowired
    private TeamRepository teamRepository;


    public List<Team> findAllTeams() {
        return (List<Team>) teamRepository.findAll();
    }

    public Team createTeam(Team team) {
        return teamRepository.save(team);
    }

    public Page<Team> findAllTeams(Pageable pageable) {
        return teamRepository.findAll(pageable);
    }
}