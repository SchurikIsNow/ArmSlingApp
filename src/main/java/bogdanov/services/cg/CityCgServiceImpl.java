package bogdanov.services.cg;

import bogdanov.converter.CityConverter;
import bogdanov.dto.CityDTO;
import bogdanov.dto.request.CityRequestDTO;
import bogdanov.entity.common.City;
import bogdanov.entity.request.CityRequest;
import bogdanov.services.AbstractService;
import bogdanov.services.business.CityBusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CityCgServiceImpl extends AbstractService implements CityCgService {

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

    public List<CityDTO> findAll(CityRequestDTO cityRequestDTO) {
        CityRequest cityRequest = mappingService.map(cityRequestDTO, CityRequest.class);
        List<City> citys = cityBusinessService.findAll(cityRequest);
        return mappingService.mapList(citys, CityDTO.class);
    }

}
