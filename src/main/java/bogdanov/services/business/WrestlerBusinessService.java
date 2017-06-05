package bogdanov.services.business;


import bogdanov.entity.common.Wrestler;
import bogdanov.entity.request.WrestlerRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface WrestlerBusinessService {

    Wrestler createWrestler(Wrestler wrestler);

    Page<Wrestler> findAllWrestlers(Pageable pageable);

    List<Wrestler> findAll(WrestlerRequest wrestlerRequest);
}
