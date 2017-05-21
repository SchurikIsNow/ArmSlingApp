package bogdanov.services.business;

import bogdanov.entity.common.Team;
import bogdanov.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TeamBusinessServiceImpl implements TeamBusinessService {
    @Autowired
    private TeamRepository teamRepository;


    public List<Team> findAllTeams() {
        return (List<Team>) teamRepository.findAll();
    }

    public Team createTeam(Team city) {
        return teamRepository.save(city);
    }
}