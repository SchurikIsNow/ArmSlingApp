package bogdanov.services.business;

import bogdanov.entity.common.City;
import bogdanov.entity.request.CityRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CityBusinessService {

    City createCity(City city);

    List<City> findAllCities();

    Page<City> findAllCities(Pageable pageable);

    List<City> findAll(CityRequest cityRequest);
}
