package bogdanov.services.business;


import bogdanov.entity.common.Wrestler;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface WrestlerBusinessService {

    Wrestler createWrestler(Wrestler wrestler);

    List<Wrestler> findAllWrestlers();

    Page<Wrestler> findAllWrestlers(Pageable pageable);
}
