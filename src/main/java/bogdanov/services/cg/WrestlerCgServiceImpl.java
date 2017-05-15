package bogdanov.services.cg;

import bogdanov.converter.WrestlerConverter;
import bogdanov.dto.WrestlerDTO;
import bogdanov.entity.common.Wrestler;
import bogdanov.services.business.WrestlerBusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class WrestlerCgServiceImpl implements WrestlerCgService {

    @Autowired
    private WrestlerBusinessService wrestlerBusinessService;

    @Autowired
    private WrestlerConverter wrestlerConverter;

    public WrestlerDTO createWrestler(WrestlerDTO wrestlerDTO) {
        Wrestler wrestler = wrestlerConverter.toEntity(wrestlerDTO);
        Wrestler createdWrestler = wrestlerBusinessService.createWrestler(wrestler);
        return wrestlerConverter.toDTO(createdWrestler);
    }

    public List<WrestlerDTO> findAllWrestlers() {
        List<Wrestler> wrestlers = wrestlerBusinessService.findAllWrestlers();
        return wrestlerConverter.listToDTOs(wrestlers);
    }
}
