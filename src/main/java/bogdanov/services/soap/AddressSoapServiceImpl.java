package bogdanov.services.soap;

import bogdanov.dto.AddressDTO;
import bogdanov.dto.request.find.AddressRequestDTO;
import bogdanov.services.cg.AddressCgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AddressSoapServiceImpl implements AddressSoapService {

    @Autowired
    private AddressCgService addressCgService;

    public List<AddressDTO> findAllAddressesWithFilter(int page, int size, Sort.Direction direction, String[] properties) {
        return addressCgService.findAllAddresses(page, size, direction, properties);
    }

    public AddressDTO createAddress(AddressDTO addressDTO) {
        return addressCgService.createAddress(addressDTO);
    }

    public List<AddressDTO> findAll(AddressRequestDTO addressRequestDTO) {
        return addressCgService.findAll(addressRequestDTO);
    }

}
