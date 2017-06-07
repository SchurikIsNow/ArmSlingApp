package bogdanov.services.cg;


import bogdanov.dto.AddressDTO;
import bogdanov.dto.request.find.AddressRequestDTO;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface AddressCgService {

    AddressDTO createAddress(AddressDTO addressDTO);

    List<AddressDTO> findAllAddresses(int page, int size, Sort.Direction direction, String[] properties);

    List<AddressDTO> findAll(AddressRequestDTO addressRequestDTO);

}
