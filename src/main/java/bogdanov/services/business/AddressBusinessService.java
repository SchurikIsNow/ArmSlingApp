package bogdanov.services.business;

import bogdanov.entity.common.Address;
import bogdanov.entity.request.find.AddressRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface AddressBusinessService {

    Address createAddress(Address address);

    Page<Address> findAllAddresses(Pageable pageable);

    List<Address> findAll(AddressRequest addressRequest);
}
