package bogdanov.services.cg;


import bogdanov.dto.WrestlerDTO;
import bogdanov.dto.request.create.WrestlerCreateRequestDTO;
import bogdanov.dto.request.find.WrestlerRequestDTO;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface WrestlerCgService {
    WrestlerDTO createWrestler(WrestlerCreateRequestDTO requestDTO);

    List<WrestlerDTO> findAllWrestlers(int page, int size, Sort.Direction direction, String[] properties);

    List<WrestlerDTO> findAll(WrestlerRequestDTO wrestlerRequestDTO);
}
