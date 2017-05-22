package bogdanov.services.business;

import bogdanov.entity.common.Wrestler;
import bogdanov.repository.WrestlerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class WrestlerBusinessServiceImpl implements WrestlerBusinessService {

    @Autowired
    private WrestlerRepository wrestlerRepository;

    @Transactional
    public List<Wrestler> findAllWrestlers() {
        List<Wrestler> wrestlers = (List<Wrestler>) wrestlerRepository.findAll();
        for (Wrestler wrestler : wrestlers) {
            wrestler.getPersonalData().initLazyCollections();
        }
        return wrestlers;
    }

    public Wrestler createWrestler(Wrestler wrestler) {
        return wrestlerRepository.save(wrestler);
    }

    public Page<Wrestler> findAllWrestlers(Pageable pageable) {
        return wrestlerRepository.findAll(pageable);
    }

}
