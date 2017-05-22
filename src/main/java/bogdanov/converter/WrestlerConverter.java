package bogdanov.converter;

import bogdanov.dto.WrestlerDTO;
import bogdanov.entity.common.Wrestler;

import java.util.List;

public interface WrestlerConverter {


    WrestlerDTO toDTO(Wrestler wrestler);

    List<WrestlerDTO> listToDTOs(List<Wrestler> wrestler);

    Wrestler toEntity(WrestlerDTO wrestlerDTO);

    List<Wrestler> listToEntitys(List<WrestlerDTO> wrestlerDTOs);
}
