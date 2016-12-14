package bogdanov.services.business;


import bogdanov.dto.wrestler.WrestlerDTO;
import bogdanov.entity.wrestler.Wrestler;

public interface ArmBusinessService {

  Wrestler createWrestler(WrestlerDTO wrestlerDTO);
}
