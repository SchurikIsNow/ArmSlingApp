package bogdanov.converter;

import bogdanov.dto.CityDTO;
import bogdanov.entity.common.City;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CityConverterImpl implements CityConverter {

    public CityDTO toDTO(City city) {
        CityDTO cityDTO = new CityDTO();

        cityDTO.setId(city.getId());
        cityDTO.setCityName(city.getCityName());

        return cityDTO;
    }

    public List<CityDTO> listToDTOs(List<City> cities) {
        List<CityDTO> cityDTOs = new ArrayList<CityDTO>();

        if (cities == null) {
            return cityDTOs;
        }

        for (City city : cities) {
            cityDTOs.add(toDTO(city));
        }
        return cityDTOs;
    }

    public City toEntity(CityDTO cityDTO) {
        City city = new City();

        city.setId(cityDTO.getId());
        city.setCityName(cityDTO.getCityName());

        return city;
    }

    public List<City> listToEntitys(List<CityDTO> cityDTOs) {
        List<City> cities = new ArrayList<City>();

        if (cityDTOs == null) {
            return cities;
        }

        for (CityDTO cityDTO : cityDTOs) {
            cities.add(toEntity(cityDTO));
        }
        return cities;
    }
}
