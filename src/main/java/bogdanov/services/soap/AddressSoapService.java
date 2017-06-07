package bogdanov.services.soap;


import bogdanov.dto.AddressDTO;
import bogdanov.dto.request.find.AddressRequestDTO;
import org.springframework.data.domain.Sort;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public interface AddressSoapService {

    @WebMethod
    AddressDTO createAddress(AddressDTO addressDTO);

    @WebMethod
    List<AddressDTO> findAllAddressesWithFilter(int page, int size, Sort.Direction direction, String[] properties);

    @WebMethod
    List<AddressDTO> findAll(AddressRequestDTO addressRequestDTO);
}
