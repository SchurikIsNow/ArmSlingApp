package bogdanov.services.cg;

import bogdanov.dto.CityDTO;
import bogdanov.dto.request.find.CityRequestDTO;
import bogdanov.entity.common.City;
import bogdanov.entity.request.find.CityRequest;
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

    public CityDTO createCity(CityDTO cityDTO) {
        City city = mappingService.map(cityDTO, City.class);
        City createdCity = cityBusinessService.createCity(city);
        return mappingService.map(createdCity, CityDTO.class);
    }


    public List<CityDTO> findAllCities(int page, int size, Sort.Direction direction, String[] properties) {
        Page<City> cities = cityBusinessService.findAllCities(new PageRequest(page, size, direction, properties));
        return mappingService.mapList(cities.getContent(), CityDTO.class);

    }

    public List<CityDTO> findAll(CityRequestDTO cityRequestDTO) {
        CityRequest cityRequest = mappingService.map(cityRequestDTO, CityRequest.class);
        List<City> citys = cityBusinessService.findAll(cityRequest);
        return mappingService.mapList(citys, CityDTO.class);
    }

}
