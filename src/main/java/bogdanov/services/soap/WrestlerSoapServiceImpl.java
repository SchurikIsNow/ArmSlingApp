package bogdanov.services.soap;

import bogdanov.dto.WrestlerDTO;
import bogdanov.dto.request.WrestlerRequestDTO;
import bogdanov.services.cg.WrestlerCgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class WrestlerSoapServiceImpl implements WrestlerSoapService {

    @Autowired
    private WrestlerCgService wrestlerCgService;

    public WrestlerDTO createWrestler(WrestlerDTO wrestlerDto) {
        return wrestlerCgService.createWrestler(wrestlerDto);
    }

    public List<WrestlerDTO> findAllWrestlersWithFilter(int page, int size, Sort.Direction direction, String[] properties) {
        return wrestlerCgService.findAllWrestlers(page, size, direction, properties);
    }

    public List<WrestlerDTO> findAll(WrestlerRequestDTO wrestlerRequestDTO) {
        return wrestlerCgService.findAll(wrestlerRequestDTO);
    }
}
