package bogdanov.services.business;


import bogdanov.entity.common.Wrestler;
import bogdanov.entity.request.find.WrestlerRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface WrestlerBusinessService {

    Wrestler createWrestler(Wrestler wrestler, long tournamentId);

    Page<Wrestler> findAllWrestlers(Pageable pageable);

    List<Wrestler> findAll(WrestlerRequest wrestlerRequest);
}
