package bogdanov.services.cg;

import bogdanov.dto.AddressDTO;
import bogdanov.dto.request.find.AddressRequestDTO;
import bogdanov.entity.common.Address;
import bogdanov.entity.request.find.AddressRequest;
import bogdanov.services.AbstractService;
import bogdanov.services.business.AddressBusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AddressCgServiceImpl extends AbstractService implements AddressCgService {

    @Autowired
    private AddressBusinessService addressBusinessService;

    public AddressDTO createAddress(AddressDTO cityDTO) {
        Address address = mappingService.map(cityDTO, Address.class);
        Address createdAddress = addressBusinessService.createAddress(address);
        return mappingService.map(createdAddress, AddressDTO.class);
    }


    public List<AddressDTO> findAllAddresses(int page, int size, Sort.Direction direction, String[] properties) {
        Page<Address> addresses = addressBusinessService.findAllAddresses(new PageRequest(page, size, direction, properties));
        return mappingService.mapList(addresses.getContent(), AddressDTO.class);

    }

    public List<AddressDTO> findAll(AddressRequestDTO addressRequestDTO) {
        AddressRequest addressRequest = mappingService.map(addressRequestDTO, AddressRequest.class);
        List<Address> addresses = addressBusinessService.findAll(addressRequest);
        return mappingService.mapList(addresses, AddressDTO.class);
    }

}
