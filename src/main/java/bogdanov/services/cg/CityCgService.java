package bogdanov.services.cg;


import bogdanov.dto.CityDTO;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface CityCgService {

    CityDTO createCity(CityDTO judgeDTO);

    List<CityDTO> findAllCities();

    List<CityDTO> findAllCities(int page, int size, Sort.Direction direction, String[] properties);

}
