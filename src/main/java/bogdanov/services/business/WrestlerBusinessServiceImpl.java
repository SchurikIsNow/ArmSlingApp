package bogdanov.services.business;

import bogdanov.builders.predicate.WrestlerPredicates;
import bogdanov.entity.common.QWrestler;
import bogdanov.entity.common.Tournament;
import bogdanov.entity.common.Wrestler;
import bogdanov.entity.request.find.WrestlerRequest;
import bogdanov.repository.WrestlerRepository;
import com.querydsl.core.BooleanBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class WrestlerBusinessServiceImpl implements WrestlerBusinessService {

    @Autowired
    private WrestlerRepository wrestlerRepository;

    @Autowired
    private TournamentBusinessService tournamentBusinessService;

    public Wrestler createWrestler(Wrestler wrestler, long tournamentId) {
        tournamentBusinessService.addWrestler(wrestler, tournamentId);
        return wrestler;
    }

    public Page<Wrestler> findAllWrestlers(Pageable pageable) {
        return wrestlerRepository.findAll(pageable);
    }

    public List<Wrestler> findAll(WrestlerRequest wrestlerRequest) {
        BooleanBuilder filter = WrestlerPredicates.getWrestlerFilter(QWrestler.wrestler, wrestlerRequest);
        return (List<Wrestler>) wrestlerRepository.findAll(filter);
    }

}
