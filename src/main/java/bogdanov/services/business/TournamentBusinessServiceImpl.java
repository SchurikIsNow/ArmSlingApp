package bogdanov.services.business;


import bogdanov.builders.predicate.TournamentPredicates;
import bogdanov.entity.common.QTournament;
import bogdanov.entity.common.Tournament;
import bogdanov.entity.common.Wrestler;
import bogdanov.entity.request.find.TournamentRequest;
import bogdanov.repository.TournamentRepository;
import com.querydsl.core.BooleanBuilder;
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


    public Tournament createTournament(Tournament tournament) {
        return tournamentRepository.save(tournament);
    }

    @Transactional
    public Page<Tournament> findAllTournaments(Pageable pageable) {

        Page<Tournament> list = tournamentRepository.findAll(pageable);

        for (Tournament tournament : list) {
            tournament.initializeLazy();
        }
        return list;
    }

    @Transactional
    public List<Tournament> findAll(TournamentRequest tournamentRequest) {
        BooleanBuilder filter = TournamentPredicates.getTournamentFilter(QTournament.tournament, tournamentRequest);
        List<Tournament> tournaments = (List<Tournament>) tournamentRepository.findAll(filter);

        for (Tournament tournament : tournaments) {
            tournament.initializeLazy();
        }
        return tournaments;
    }

    @Transactional
    public void addWrestler(Wrestler wrestler, long tournamentId) {
        Tournament tournament = tournamentRepository.getOne(tournamentId);
        tournament.initializeLazy();
        tournament.addWrestler(wrestler);
    }
}
