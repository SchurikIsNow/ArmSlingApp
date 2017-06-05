package bogdanov.services.cg;


import bogdanov.dto.WrestlerDTO;
import bogdanov.dto.request.WrestlerRequestDTO;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface WrestlerCgService {
    WrestlerDTO createWrestler(WrestlerDTO wrestlerDTO);

    List<WrestlerDTO> findAllWrestlers(int page, int size, Sort.Direction direction, String[] properties);

    List<WrestlerDTO> findAll(WrestlerRequestDTO wrestlerRequestDTO);
}
