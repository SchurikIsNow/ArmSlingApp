package bogdanov.services.business;


import bogdanov.entity.common.Tournament;
import bogdanov.repository.TournamentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class TournamentBusinessServiceImpl implements TournamentBusinessService {

    @Autowired
    private TournamentRepository tournamentRepository;

    @Transactional
    public List<Tournament> findAllTournaments() {
        List<Tournament> list = (List<Tournament>) tournamentRepository.findAll();

        for (Tournament tournament : list) {
            tournament.initializeLazy();
        }
        return list;

    }

    public Tournament createTournament(Tournament tournament) {
        return tournamentRepository.save(tournament);
    }

    @Transactional
    public Page<Tournament> findAllTournaments(Pageable pageable) {

        Page<Tournament> list = (Page<Tournament>) tournamentRepository.findAll();

        for (Tournament tournament : list) {
            tournament.initializeLazy();
        }
        return list;
    }

}
