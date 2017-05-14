package bogdanov.converter;

import bogdanov.dto.CityDTO;
import bogdanov.entity.common.City;

import java.util.List;

public interface CityConverter {
    CityDTO toDTO(City city);

    List<CityDTO> listToDTOs(List<City> cities);

    City toEntity(CityDTO cityDTO);

    List<City> listToEntitys(List<CityDTO> cityDTOs);
}
