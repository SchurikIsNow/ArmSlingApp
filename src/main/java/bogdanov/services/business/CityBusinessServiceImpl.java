package bogdanov.services.business;

import bogdanov.entity.common.City;
import bogdanov.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CityBusinessServiceImpl implements CityBusinessService {
    @Autowired
    private CityRepository cityRepository;

    public List<City> findAllCities() {
        return (List<City>) cityRepository.findAll();
    }

    public City createCity(City city) {
        return cityRepository.save(city);
    }

    public Page<City> findAllCities(Pageable pageable) {
        return cityRepository.findAll(pageable);
    }
}
