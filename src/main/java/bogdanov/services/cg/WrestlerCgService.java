package bogdanov.services.cg;


import bogdanov.dto.WrestlerDTO;

import java.util.List;

public interface WrestlerCgService {
    WrestlerDTO createWrestler(WrestlerDTO wrestlerDTO);

    List<WrestlerDTO> findAllWrestlers();
}
