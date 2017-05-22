package bogdanov.services.cg;

import bogdanov.converter.CityConverter;
import bogdanov.dto.CityDTO;
import bogdanov.entity.common.City;
import bogdanov.services.business.CityBusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CityCgServiceImpl implements CityCgService {
    @Autowired
    private CityBusinessService cityBusinessService;

    @Autowired
    private CityConverter cityConverter;

    public CityDTO createCity(CityDTO cityDTO) {
        City city = cityConverter.toEntity(cityDTO);
        City createdCity = cityBusinessService.createCity(city);
        return cityConverter.toDTO(createdCity);
    }

    public List<CityDTO> findAllCities() {
        List<City> cities = cityBusinessService.findAllCities();
        return cityConverter.listToDTOs(cities);
    }

    public List<CityDTO> findAllCities(int page, int size, Sort.Direction direction, String[] properties) {
        Page<City> cities = cityBusinessService.findAllCities(new PageRequest(page, size, direction, properties));
        return cityConverter.listToDTOs(cities.getContent());

    }

}
