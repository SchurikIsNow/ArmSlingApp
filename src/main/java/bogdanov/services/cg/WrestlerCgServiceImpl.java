package bogdanov.services.cg;

import bogdanov.dto.WrestlerDTO;
import bogdanov.dto.request.create.WrestlerCreateRequestDTO;
import bogdanov.dto.request.find.WrestlerRequestDTO;
import bogdanov.entity.common.Wrestler;
import bogdanov.entity.request.find.WrestlerRequest;
import bogdanov.services.AbstractService;
import bogdanov.services.business.WrestlerBusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class WrestlerCgServiceImpl extends AbstractService implements WrestlerCgService {

    @Autowired
    private WrestlerBusinessService wrestlerBusinessService;

    public WrestlerDTO createWrestler(WrestlerCreateRequestDTO requestDTO) {
        Wrestler wrestler = mappingService.map(requestDTO.getWrestlerDTO(), Wrestler.class);
        Wrestler createdWrestler = wrestlerBusinessService.createWrestler(wrestler, requestDTO.getTournamentId());
        return mappingService.map(createdWrestler, WrestlerDTO.class);
    }

    public List<WrestlerDTO> findAllWrestlers(int page, int size, Sort.Direction direction, String[] properties) {
        Page<Wrestler> wrestlers = wrestlerBusinessService.findAllWrestlers(new PageRequest(page, size, direction, properties));
        return mappingService.mapList(wrestlers.getContent(), WrestlerDTO.class);

    }

    public List<WrestlerDTO> findAll(WrestlerRequestDTO wrestlerRequestDTO) {
        WrestlerRequest wrestlerRequest = mappingService.map(wrestlerRequestDTO, WrestlerRequest.class);
        List<Wrestler> wrestlers = wrestlerBusinessService.findAll(wrestlerRequest);
        return mappingService.mapList(wrestlers, WrestlerDTO.class);
    }
}
