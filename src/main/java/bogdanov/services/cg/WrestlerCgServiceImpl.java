package bogdanov.services.cg;

import bogdanov.converter.WrestlerConverter;
import bogdanov.dto.WrestlerDTO;
import bogdanov.dto.request.WrestlerRequestDTO;
import bogdanov.entity.common.Wrestler;
import bogdanov.entity.request.WrestlerRequest;
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

    public List<WrestlerDTO> findAllWrestlers(int page, int size, Sort.Direction direction, String[] properties) {
        Page<Wrestler> wrestlers = wrestlerBusinessService.findAllWrestlers(new PageRequest(page, size, direction, properties));
        return wrestlerConverter.listToDTOs(wrestlers.getContent());

    }

    public List<WrestlerDTO> findAll(WrestlerRequestDTO wrestlerRequestDTO) {
        WrestlerRequest wrestlerRequest = mappingService.map(wrestlerRequestDTO, WrestlerRequest.class);
        List<Wrestler> wrestlers = wrestlerBusinessService.findAll(wrestlerRequest);
        return mappingService.mapList(wrestlers, WrestlerDTO.class);
    }
}
