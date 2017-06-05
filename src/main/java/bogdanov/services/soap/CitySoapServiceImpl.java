package bogdanov.services.soap;

import bogdanov.dto.CityDTO;
import bogdanov.dto.request.CityRequestDTO;
import bogdanov.services.cg.CityCgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CitySoapServiceImpl implements CitySoapService {

    @Autowired
    private CityCgService cityCgService;

    public List<CityDTO> findAllCitiesWithFilter(int page, int size, Sort.Direction direction, String[] properties) {
        return cityCgService.findAllCities(page, size, direction, properties);
    }

    public List<CityDTO> findAllCities() {
        return cityCgService.findAllCities();
    }

    public CityDTO createCity(CityDTO cityDTO) {
        return cityCgService.createCity(cityDTO);
    }

    public List<CityDTO> findAll(CityRequestDTO cityRequestDTO) {
        return cityCgService.findAll(cityRequestDTO);
    }

}
