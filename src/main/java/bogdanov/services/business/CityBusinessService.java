package bogdanov.services.business;

import bogdanov.entity.common.City;

import java.util.List;

public interface CityBusinessService {

    City createCity(City city);

    List<City> findAllCities();
}
