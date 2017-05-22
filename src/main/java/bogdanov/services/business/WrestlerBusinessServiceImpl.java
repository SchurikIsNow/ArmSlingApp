package bogdanov.services.business;

import bogdanov.entity.common.Wrestler;
import bogdanov.repository.WrestlerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class WrestlerBusinessServiceImpl implements WrestlerBusinessService {

    @Autowired
    private WrestlerRepository wrestlerRepository;

    public List<Wrestler> findAllWrestlers() {
        return (List<Wrestler>) wrestlerRepository.findAll();
    }

    public Wrestler createWrestler(Wrestler wrestler) {
        return wrestlerRepository.save(wrestler);
    }

    public Page<Wrestler> findAllWrestlers(Pageable pageable) {
        return wrestlerRepository.findAll(pageable);
    }

}
