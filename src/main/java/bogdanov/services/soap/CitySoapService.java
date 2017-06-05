package bogdanov.services.soap;


import bogdanov.dto.CityDTO;
import bogdanov.dto.request.CityRequestDTO;
import org.springframework.data.domain.Sort;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public interface CitySoapService {

    @WebMethod
    CityDTO createCity(CityDTO cityDTO);

    @WebMethod
    List<CityDTO> findAllCitiesWithFilter(int page, int size, Sort.Direction direction, String[] properties);

    @WebMethod
    List<CityDTO> findAllCities();

    @WebMethod
    List<CityDTO> findAll(CityRequestDTO cityRequestDTO);
}
