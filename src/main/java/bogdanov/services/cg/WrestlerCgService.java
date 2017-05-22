package bogdanov.services.cg;


import bogdanov.dto.WrestlerDTO;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface WrestlerCgService {
    WrestlerDTO createWrestler(WrestlerDTO wrestlerDTO);

    List<WrestlerDTO> findAllWrestlers();

    List<WrestlerDTO> findAllWrestlers(int page, int size, Sort.Direction direction, String[] properties);
}
