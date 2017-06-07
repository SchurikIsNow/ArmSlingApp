package bogdanov.dto.request.find;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressRequestDTO {
    String city;
    String exactAddress;
    String country;
    String region;
}
