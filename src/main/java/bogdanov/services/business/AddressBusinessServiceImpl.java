package bogdanov.services.business;

import bogdanov.builders.predicate.AddressPredicates;
import bogdanov.entity.common.Address;
import bogdanov.entity.common.QAddress;
import bogdanov.entity.request.find.AddressRequest;
import bogdanov.repository.AddressRepository;
import com.querydsl.core.BooleanBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AddressBusinessServiceImpl implements AddressBusinessService {
    @Autowired
    private AddressRepository addressRepository;

    public Address createAddress(Address address) {
        return addressRepository.save(address);
    }

    public Page<Address> findAllAddresses(Pageable pageable) {
        return addressRepository.findAll(pageable);
    }

    public List<Address> findAll(AddressRequest addressRequest) {
        BooleanBuilder filter = AddressPredicates.getAddressFilter(QAddress.address, addressRequest);
        return (List<Address>) addressRepository.findAll(filter);
    }
}
