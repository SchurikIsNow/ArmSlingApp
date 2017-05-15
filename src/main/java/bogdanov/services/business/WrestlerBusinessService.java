package bogdanov.services.business;


import bogdanov.entity.common.Wrestler;

import java.util.List;

public interface WrestlerBusinessService {

    Wrestler createWrestler(Wrestler wrestler);

    List<Wrestler> findAllWrestlers();
}
